package com.bracso.demo.transaction.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

/**
 *
 * @author bracs
 */
@Configuration(proxyBeanMethods = false)
@EnableJpaRepositories(basePackages = "com.bracso.demo.transaction.db1.repository", entityManagerFactoryRef = "em1")
public class EM1Configuration {

    @Bean
    @Primary
    public LocalContainerEntityManagerFactoryBean em1(EntityManagerFactoryBuilder builder, @Qualifier("ds1") DataSource ds1, JpaProperties jpaConfiguration) {
        return builder
                .dataSource(ds1)
                .persistenceUnit("ds1PersistenceUnit")
                .properties(jpaConfiguration.getProperties())
                .jta(true)
                .packages("com.bracso.demo.transaction.db1.entity")
                .build();
    }

}
