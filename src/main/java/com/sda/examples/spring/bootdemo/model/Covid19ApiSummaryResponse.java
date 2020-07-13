package com.sda.examples.spring.bootdemo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Covid19ApiSummaryResponse {

    @JsonProperty("Global")
    private Global global;

    @JsonProperty("Countries")
    private List<Country> countries;

    public Global getGlobal() {
        return global;
    }

    public void setGlobal(Global global) {
        this.global = global;
    }

    public List<Country> getCountries() {
        return countries;
    }

    public void setCountries(List<Country> countries) {
        this.countries = countries;
    }
}
