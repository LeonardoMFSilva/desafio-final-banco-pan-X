package com.panacademy.grupox.lambda;

import com.panacademy.grupox.lambda.domain.VersionCode;
import com.panacademy.grupox.lambda.respository.VersionCodeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.function.Supplier;

@SpringBootApplication
public class AwsLambdaApplication {

    @Autowired
    private VersionCodeDao versionCodeDao;

    @Bean
    public Supplier<List<VersionCode>> orders() {
        return () -> versionCodeDao.buildVersionCode();
    }

    public static void main(String[] args) {
        SpringApplication.run(AwsLambdaApplication.class, args);
    }

}
