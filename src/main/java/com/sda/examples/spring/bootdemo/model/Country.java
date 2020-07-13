package com.sda.examples.spring.bootdemo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Country {

    @JsonProperty("Country")
    private String country;

    @JsonProperty("CountryCode")
    private String countryCode;

    @JsonProperty("TotalConfirmed")
    private Long totalConfirmed;

    @JsonProperty("TotalDeaths")
    private Long totalDeaths;

    @JsonProperty("TotalRecovered")
    private Long totalRecovered;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public Long getTotalConfirmed() {
        return totalConfirmed;
    }

    public void setTotalConfirmed(Long totalConfirmed) {
        this.totalConfirmed = totalConfirmed;
    }

    public Long getTotalDeaths() {
        return totalDeaths;
    }

    public void setTotalDeaths(Long totalDeaths) {
        this.totalDeaths = totalDeaths;
    }

    public Long getTotalRecovered() {
        return totalRecovered;
    }

    public void setTotalRecovered(Long totalRecovered) {
        this.totalRecovered = totalRecovered;
    }
}
