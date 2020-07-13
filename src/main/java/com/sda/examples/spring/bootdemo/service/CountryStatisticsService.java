package com.sda.examples.spring.bootdemo.service;

import com.sda.examples.spring.bootdemo.model.CountryStatistics;
import com.sda.examples.spring.bootdemo.repository.CountryStatisticsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class CountryStatisticsService implements ICountryStatisticsService {

    private final CountryStatisticsRepository countryStatisticsRepository;

    @Autowired
    public CountryStatisticsService(CountryStatisticsRepository countryStatisticsRepository) {
        this.countryStatisticsRepository = countryStatisticsRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public CountryStatistics getByCountry(String countryCode){

        Optional<CountryStatistics> countryStatisticsOptional = this.countryStatisticsRepository.findById(countryCode);
        return countryStatisticsOptional.orElse(new CountryStatistics(0,0,0));

//        return this.countryStatisticsRepository.findById(countryCode)
//                .orElse(new CountryStatistics(0,0,0));
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void add(CountryStatistics countryStatistics) {
        this.countryStatisticsRepository.save(countryStatistics);
    }
}
