package com.sda.examples.spring.bootdemo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Global {

    @JsonProperty("NewConfirmed")
    private Long newConfirmed;

    @JsonProperty("TotalConfirmed")
    private Long totalConfirmed;

    @JsonProperty("NewDeaths")
    private Long newDeaths;

    @JsonProperty("TotalDeaths")
    private Long totalDeaths;

    @JsonProperty("NewRecovered")
    private Long newRecovered;

    @JsonProperty("TotalRecovered")
    private Long totalRecovered;

    public Long getNewConfirmed() {
        return newConfirmed;
    }

    public void setNewConfirmed(Long newConfirmed) {
        this.newConfirmed = newConfirmed;
    }

    public Long getTotalConfirmed() {
        return totalConfirmed;
    }

    public void setTotalConfirmed(Long totalConfirmed) {
        this.totalConfirmed = totalConfirmed;
    }

    public Long getNewDeaths() {
        return newDeaths;
    }

    public void setNewDeaths(Long newDeaths) {
        this.newDeaths = newDeaths;
    }

    public Long getTotalDeaths() {
        return totalDeaths;
    }

    public void setTotalDeaths(Long totalDeaths) {
        this.totalDeaths = totalDeaths;
    }

    public Long getNewRecovered() {
        return newRecovered;
    }

    public void setNewRecovered(Long newRecovered) {
        this.newRecovered = newRecovered;
    }

    public Long getTotalRecovered() {
        return totalRecovered;
    }

    public void setTotalRecovered(Long totalRecovered) {
        this.totalRecovered = totalRecovered;
    }
}
