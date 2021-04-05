package com.bracso.demo.transaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({Ds1Configuration.class, Ds2Configuration.class, EM1Configuration.class, EM2Configuration.class})
public class DemoTransactionApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoTransactionApplication.class, args);
    }
    
}
