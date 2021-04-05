package com.bracso.demo.transaction;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jta.atomikos.AtomikosDataSourceBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author oburgosm
 */
@Configuration(proxyBeanMethods = false)
public class Ds1Configuration {
    
    @Bean
    @ConfigurationProperties("com.bracso.demo.transaction.ds1")
    public DataSource myDs1() {
        return new AtomikosDataSourceBean();
    }
    
}
