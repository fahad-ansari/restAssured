package api_payload;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Products {
    private String asin;
    @JsonProperty("product_title")
    private String productTitle;
    @JsonProperty("product_price")
    private String productPrice;
    @JsonProperty("product_original_price")
    private String productOriginalPrice;
    private String currency;
    @JsonProperty("product_star_rating")
    private String productStarRating;
    @JsonProperty("product_num_ratings")
    private Integer productNumRatings;
    @JsonProperty("product_url")
    private String productUrl;
    @JsonProperty("product_photo")
    private String productPhoto;
    @JsonProperty("product_num_offers")
    private Integer productNumOffers;
    private String product_minimum_offer_price;
    private Boolean is_best_seller;
    private Boolean is_amazon_choice;
    private Boolean is_prime;
    private Boolean climate_pledge_friendly;
    private String sales_volume;
    private String delivery;
    private String coupon_text;
    private Boolean has_variations;
    private String unit_price;
    private String unit_count;

    public String getUnit_count() {
        return unit_count;
    }

    public void setUnit_count(String unit_count) {
        this.unit_count = unit_count;
    }

    public String getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(String unit_price) {
        this.unit_price = unit_price;
    }



    public String getProduct_availability() {
        return product_availability;
    }

    public void setProduct_availability(String product_availability) {
        this.product_availability = product_availability;
    }

    private String product_availability;

    public String getAsin() {
        return asin;
    }
    public void setAsin(String asin) {
        this.asin = asin;
    }
    public String getProductTitle() {
        return productTitle;
    }
    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }
    public String getProductPrice() {
        return productPrice;
    }
    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }
    public String getProductOriginalPrice() {
        return productOriginalPrice;
    }
    public void setProductOriginalPrice(String productOriginalPrice) {
        this.productOriginalPrice = productOriginalPrice;
    }
    public String getCurrency() {
        return currency;
    }
    public void setCurrency(String currency) {
        this.currency = currency;
    }
    public String getProductStarRating() {
        return productStarRating;
    }
    public void setProductStarRating(String productStarRating) {
        this.productStarRating = productStarRating;
    }
    public Integer getProductNumRatings() {
        return productNumRatings;
    }
    public void setProductNumRatings(Integer productNumRatings) {
        this.productNumRatings = productNumRatings;
    }
    public String getProductUrl() {
        return productUrl;
    }
    public void setProductUrl(String productUrl) {
        this.productUrl = productUrl;
    }
    public String getProductPhoto() {
        return productPhoto;
    }
    public void setProductPhoto(String productPhoto) {
        this.productPhoto = productPhoto;
    }
    public Integer getProductNumOffers() {
        return productNumOffers;
    }
    public void setProductNumOffers(Integer productNumOffers) {
        this.productNumOffers = productNumOffers;
    }
    public String getProduct_minimum_offer_price() {
        return product_minimum_offer_price;
    }
    public void setProduct_minimum_offer_price(String product_minimum_offer_price) {
        this.product_minimum_offer_price = product_minimum_offer_price;
    }
    public Boolean getIs_best_seller() {
        return is_best_seller;
    }
    public void setIs_best_seller(Boolean is_best_seller) {
        this.is_best_seller = is_best_seller;
    }
    public Boolean getIs_amazon_choice() {
        return is_amazon_choice;
    }
    public void setIs_amazon_choice(Boolean is_amazon_choice) {
        this.is_amazon_choice = is_amazon_choice;
    }
    public Boolean getIs_prime() {
        return is_prime;
    }
    public void setIs_prime(Boolean is_prime) {
        this.is_prime = is_prime;
    }
    public Boolean getClimate_pledge_friendly() {
        return climate_pledge_friendly;
    }
    public void setClimate_pledge_friendly(Boolean climate_pledge_friendly) {
        this.climate_pledge_friendly = climate_pledge_friendly;
    }
    public String getSales_volume() {
        return sales_volume;
    }
    public void setSales_volume(String sales_volume) {
        this.sales_volume = sales_volume;
    }
    public String getDelivery() {
        return delivery;
    }
    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }
    public String getCoupon_text() {
        return coupon_text;
    }
    public void setCoupon_text(String coupon_text) {
        this.coupon_text = coupon_text;
    }
    public Boolean getHas_variations() {
        return has_variations;
    }
    public void setHas_variations(Boolean has_variations) {
        this.has_variations = has_variations;
    }
}
