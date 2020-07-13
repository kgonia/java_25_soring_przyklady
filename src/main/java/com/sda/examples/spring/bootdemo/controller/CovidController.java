package com.sda.examples.spring.bootdemo.controller;

import com.sda.examples.spring.bootdemo.model.CountryStatistics;
import com.sda.examples.spring.bootdemo.service.ICountryStatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/covid/country")
public class CovidController {

    private final ICountryStatisticsService countryStatisticsService;

    @Autowired
    public CovidController(@Qualifier("countryStatisticsCovid19ApiService") ICountryStatisticsService countryStatisticsService) {
        this.countryStatisticsService = countryStatisticsService;
    }

    @GetMapping("/{country}")
    public CountryStatistics getInfo(@PathVariable String country){
        return countryStatisticsService.getByCountry(country);
    }

    @PostMapping("/{country}")
    public void addCountry(@PathVariable String country, @RequestBody CountryStatistics countryStatistics){
        this.countryStatisticsService.add(countryStatistics);
    }

    @GetMapping
    public Map<String, CountryStatistics> getInfoForAll(){
        return null;
    }
}
