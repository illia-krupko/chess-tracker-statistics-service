package krupkoillia.chesstracker.statisticsservice;

import org.springframework.boot.SpringApplication;

public class TestStatisticsServiceApplication {

    public static void main(String[] args) {
        SpringApplication.from(StatisticsServiceApplication::main)
            .with(TestcontainersConfiguration.class).run(args);
    }

}
