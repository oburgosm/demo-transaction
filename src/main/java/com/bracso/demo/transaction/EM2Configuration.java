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
@EnableJpaRepositories(basePackages = "com.bracso.demo.transaction.db2.repository", entityManagerFactoryRef="em2")
public class EM2Configuration {
    
    @Bean
    public EntityManagerFactory  em2(EntityManagerFactoryBuilder builder, @Qualifier("ds2") DataSource ds2) {
        return builder.dataSource(ds2).jta(true).packages("com.bracso.demo.transaction.db2.entity").build().getObject();
    }
    
}
