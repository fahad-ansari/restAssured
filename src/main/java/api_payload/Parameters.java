package api_payload;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Parameters {
    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public Boolean getPrime() {
        return isPrime;
    }

    public void setPrime(Boolean prime) {
        isPrime = prime;
    }

    private String query;
    private String country;
    @JsonProperty("sort_by")
    private String sortBy;
    private Integer page;
    private Boolean isPrime;


    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getSortBy() {
        return sortBy;
    }
    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }
    public Integer getPage() {
        return page;
    }
    public void setPage(Integer page) {
        this.page = page;
    }
    public Boolean getIsPrime() {
        return isPrime;
    }
    public void setIsPrime(Boolean isPrime) {
        this.isPrime = isPrime;
    }
}
