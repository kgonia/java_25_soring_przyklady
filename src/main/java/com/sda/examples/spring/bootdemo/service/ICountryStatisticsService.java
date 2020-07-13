package com.sda.examples.spring.bootdemo.service;

import com.sda.examples.spring.bootdemo.model.CountryStatistics;

public interface ICountryStatisticsService {

    CountryStatistics getByCountry(String countryCode);

    void add(CountryStatistics countryStatistics);

}
