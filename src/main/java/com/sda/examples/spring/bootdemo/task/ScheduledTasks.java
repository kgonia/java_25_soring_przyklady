package com.sda.examples.spring.bootdemo.task;

import com.sda.examples.spring.bootdemo.model.CountryStatistics;
import com.sda.examples.spring.bootdemo.service.CountryStatisticsCovid19ApiService;
import com.sda.examples.spring.bootdemo.service.CountryStatisticsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Component
public class ScheduledTasks {

    private final CountryStatisticsCovid19ApiService countryStatisticsCovid19ApiService;

    private final CountryStatisticsService countryStatisticsService;

    private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);

    @Autowired
    public ScheduledTasks(CountryStatisticsCovid19ApiService countryStatisticsCovid19ApiService,
                          CountryStatisticsService countryStatisticsService) {
        this.countryStatisticsCovid19ApiService = countryStatisticsCovid19ApiService;
        this.countryStatisticsService = countryStatisticsService;
    }

    @Scheduled(fixedRate = 15000)
    public void reportCurrentTime() {
        log.info("Getting data");
        List<CountryStatistics> result = countryStatisticsCovid19ApiService.findAll();
        log.info("Saving data, size: " + result.size());
        result.forEach(countryStatistics -> countryStatisticsService.add(countryStatistics));
    }
}
