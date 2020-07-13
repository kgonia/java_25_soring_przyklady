package com.sda.examples.spring.bootdemo.service;

import com.sda.examples.spring.bootdemo.model.CountryStatistics;
import com.sda.examples.spring.bootdemo.repository.CountryStatisticsInMemoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class CountryStatisticsInMemoryService implements ICountryStatisticsService {

    private final CountryStatisticsInMemoryRepository countryStatisticsInMemoryRepository;

    @Autowired
    public CountryStatisticsInMemoryService(CountryStatisticsInMemoryRepository countryStatisticsInMemoryRepository) {
        this.countryStatisticsInMemoryRepository = countryStatisticsInMemoryRepository;
    }

    @Override
    public CountryStatistics getByCountry(String countryCode) {

        CountryStatistics countryStatistics = countryStatisticsInMemoryRepository.getByCountry(countryCode);
        if (countryStatistics == null) {
            countryStatistics = new CountryStatistics(0, 0, 0);
        }
        return countryStatistics;
    }

    @Override
    public void add(CountryStatistics countryStatistics) {
        throw new UnsupportedOperationException("Not implemented YET");
    }

    public Map<String, CountryStatistics> findAll(){
        return this.countryStatisticsInMemoryRepository.findAll();
    }
}
