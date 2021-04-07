package com.bracso.demo.transaction.config;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jta.atomikos.AtomikosDataSourceBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 *
 * @author oburgosm
 */
@Configuration(proxyBeanMethods = false)
public class Ds1Configuration {
    
    @Bean
    @ConfigurationProperties("com.bracso.demo.transaction.ds1")
    @Primary
    public DataSource ds1() {
        return new AtomikosDataSourceBean();
    }
    
}
