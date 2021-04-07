package com.bracso.demo.transaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.bracso.demo.transaction.config.DataSourceConfiguration;
import com.bracso.demo.transaction.config.EM1Configuration;

@SpringBootApplication
@Import({DataSourceConfiguration.class, EM1Configuration.class})
public class DemoTransactionApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoTransactionApplication.class, args);
    }
    
}
