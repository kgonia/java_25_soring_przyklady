package com.sda.examples.spring.bootdemo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "country_statistics")
public class CountryStatistics {

    @Id
    @Column(length = 2, nullable = false, unique = true)
    private String countyCode;

    @Column(nullable = false)
    private int active;

    @Column(nullable = false)
    private int deaths;

    @Column(nullable = false)
    private int recovered;

    public CountryStatistics() {
    }

    public CountryStatistics(int active, int deaths, int recovered) {
        this.active = active;
        this.deaths = deaths;
        this.recovered = recovered;

//        this(null, active, deaths, recovered);
    }

    public CountryStatistics(String countyCode, int active, int deaths, int recovered) {
        this.countyCode = countyCode;
        this.active = active;
        this.deaths = deaths;
        this.recovered = recovered;
    }

    public void setCountyCode(String countyCode) {
        this.countyCode = countyCode;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }

    public void setRecovered(int recovered) {
        this.recovered = recovered;
    }

    public String getCountyCode() {
        return countyCode;
    }

    public int getActive() {
        return active;
    }

    public int getDeaths() {
        return deaths;
    }

    public int getRecovered() {
        return recovered;
    }
}
