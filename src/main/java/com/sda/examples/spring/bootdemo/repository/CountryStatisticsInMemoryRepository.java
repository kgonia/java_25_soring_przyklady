package com.sda.examples.spring.bootdemo.repository;

import com.sda.examples.spring.bootdemo.model.CountryStatistics;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class CountryStatisticsInMemoryRepository {

    private Map<String, CountryStatistics> statisticsMap;

    public CountryStatisticsInMemoryRepository() {
        this.statisticsMap = new HashMap<>();
        statisticsMap.put("pl",new CountryStatistics(10000,1000,10));
        statisticsMap.put("de",new CountryStatistics(10000,7000,0));
    }

    public CountryStatistics getByCountry(String countryCode){
        return statisticsMap.get(countryCode);
    }

    public Map<String, CountryStatistics> findAll(){
        return statisticsMap;
    }
}
