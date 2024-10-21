package api_calls;


import api_payload.Parameters;
import api_payload.Products;
import api_payload.Root;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class amazon_fetchProductAPI{

    @Test
    public static void fetchProductBestSeller() {
        Parameters query = new Parameters();
        query.setQuery("Mobile");
        query.setCountry("IN");
        query.setSortBy("BEST_SELLERS");

        Response response = RestAssured.given().log().all()
                .queryParam("query", query.getQuery())
                .queryParam("country", query.getCountry())
                .queryParam("sort_by", query.getSortBy())
                .header("x-rapidapi-host", "real-time-amazon-data.p.rapidapi.com")
                .header("x-rapidapi-key", "0ca8e8c58emshf7c190b107304e8p1daec4jsn1efce5ab9753")
                .when()
                .get("https://real-time-amazon-data.p.rapidapi.com/search")
                .then().extract().response();

        String json = response.asString();
        System.out.println(json);


        ObjectMapper objectMapper = new ObjectMapper();
        try {
            Root apiResponse = objectMapper.readValue(json, Root.class);
            List<Products> products = apiResponse.getData().getProducts();
            for (Products product : products) {
                System.out.println("--------------------------------");
                System.out.println("ASIN: " + product.getAsin());
                System.out.println("Title: " + product.getProductTitle());
                System.out.println("Product Price: " + product.getProductPrice());
                System.out.println("Delivery: " + product.getDelivery());
                System.out.println("Product URL: " + product.getProductUrl());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public static void fetchProductNEWEST(){
        Parameters query2 = new Parameters();
        query2.setQuery("PHONE");
        query2.setCountry("US");
        query2.setSortBy("NEWEST");

//            // Create a map for query parameters
//            Map<String, Object> queryParams = new HashMap<>();
//            queryParams.put("query", query2.getQuery());
//            queryParams.put("country", query2.getCountry());
//            queryParams.put("sort_by", query2.getSortBy());

        Response responseNEWEST = RestAssured.given().log().all()
                .queryParam("query", query2.getQuery())
                .queryParam("country", query2.getCountry())
                .queryParam("sort_by", query2.getSortBy())
                .header("x-rapidapi-host", "real-time-amazon-data.p.rapidapi.com")
                .header("x-rapidapi-key", "0ca8e8c58emshf7c190b107304e8p1daec4jsn1efce5ab9753")
                .when()
                .get("https://real-time-amazon-data.p.rapidapi.com/search")
                .then().extract().response();

        String jsonOutput2 = responseNEWEST.asString();
        System.out.println(jsonOutput2);


        ObjectMapper objectMapperNewest = new ObjectMapper();
        try {
            Root apiResponseNewest = objectMapperNewest.readValue(jsonOutput2,Root.class);
            List<Products> products = apiResponseNewest.getData().getProducts();
            for (Products product : products) {
                System.out.println("--------------------------------");
                System.out.println("ASIN: " + product.getAsin());
                System.out.println("Title: " + product.getProductTitle());
                System.out.println("Product Price: "+product.getProductPrice());
                System.out.println("Delivery: "+product.getDelivery());
                System.out.println("Product URL: "+product.getProductUrl());
                System.out.println("Availability: "+product.getProduct_availability());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
