package com.sda.examples.spring.bootdemo.service;

import com.sda.examples.spring.bootdemo.model.CountryStatistics;
import com.sda.examples.spring.bootdemo.model.Covid19ApiSummaryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CountryStatisticsCovid19ApiService implements ICountryStatisticsService {

    private final RestTemplate restTemplate;

    @Autowired
    public CountryStatisticsCovid19ApiService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public CountryStatistics getByCountry(String countryCode) {

        Covid19ApiSummaryResponse response = restTemplate.getForObject("/summary", Covid19ApiSummaryResponse.class);
        CountryStatistics countryStatistics = response
                .getCountries()
                .stream()
                .filter(country -> country.getCountryCode().equalsIgnoreCase(countryCode))
                .findFirst()
                .map(country -> new CountryStatistics(country.getCountryCode(),
                        country.getTotalConfirmed().intValue(),
                        country.getTotalDeaths().intValue(),
                        country.getTotalRecovered().intValue()))
                .orElse(new CountryStatistics(0, 0 ,0));

        return countryStatistics;
    }

    @Override
    public void add(CountryStatistics countryStatistics) {
        throw new UnsupportedOperationException("You cant add data to external API");
    }

    public List<CountryStatistics> findAll(){
        Covid19ApiSummaryResponse response = restTemplate.getForObject("/summary", Covid19ApiSummaryResponse.class);
        return response
                .getCountries()
                .stream()
                .map(country -> new CountryStatistics(country.getCountryCode(),
                        country.getTotalConfirmed().intValue(),
                        country.getTotalDeaths().intValue(),
                        country.getTotalRecovered().intValue()))
                .collect(Collectors.toList());

    }


}
