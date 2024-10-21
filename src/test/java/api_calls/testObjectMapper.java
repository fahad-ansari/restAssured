package api_calls;
import api_payload.Products;
import api_payload.Root;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;

public class testObjectMapper {


    public static void main(String[] args) {
        String json = "{ \"status\": \"OK\", \"data\": { \"products\": [{ \"asin\": \"B0DFY3XCB6\", \"product_title\": \"Sample Product\" }] } } }";

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            Root apiResponse = objectMapper.readValue(json,Root.class);
            List<Products> products = apiResponse.getData().getProducts();
            for (Products product : products) {
                System.out.println("ASIN: " + product.getAsin());
                System.out.println("Title: " + product.getProductTitle());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

