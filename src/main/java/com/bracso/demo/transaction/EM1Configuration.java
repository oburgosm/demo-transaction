package com.bracso.demo.transaction;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 *
 * @author bracs
 */
@Configuration(proxyBeanMethods = false)
@EnableJpaRepositories(basePackages = "com.bracso.demo.transaction.db1.repository", entityManagerFactoryRef="em1")
public class EM1Configuration {
    
    @Bean
    public EntityManagerFactory  em1(EntityManagerFactoryBuilder builder, @Qualifier("ds1") DataSource ds1) {
        return builder.dataSource(ds1).jta(true).packages("com.bracso.demo.transaction.db1.entity").build().getObject();
    }
    
}
