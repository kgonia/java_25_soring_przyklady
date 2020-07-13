package com.sda.examples.spring.bootdemo.repository;

import com.sda.examples.spring.bootdemo.model.CountryStatistics;
import org.springframework.data.repository.CrudRepository;

public interface CountryStatisticsRepository extends CrudRepository<CountryStatistics,String> {
}
