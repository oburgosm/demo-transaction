package com.bracso.demo.transaction.config;

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
public class Ds2Configuration {
    
    @Bean
    @ConfigurationProperties("com.bracso.demo.transaction.ds2")
    public DataSource ds2() {
        return new AtomikosDataSourceBean();
    }
    
}
