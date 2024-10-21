package api_payload;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class Data {
    @JsonProperty("total_products")
    private Integer totalProducts;
    private String country;
    private String domain;
    private List<Products> products = new ArrayList<Products>();
    public Integer getTotalProducts() {
        return totalProducts;
    }
    public void setTotalProducts(Integer totalProducts) {
        this.totalProducts = totalProducts;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getDomain() {
        return domain;
    }
    public void setDomain(String domain) {
        this.domain = domain;
    }
    public List<Products> getProducts() {
        return products;
    }
    public void setProducts(List<Products> products) {
        this.products = products;
    }
}
