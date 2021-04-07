package com.bracso.demo.transaction.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

/**
 *
 * @author bracs
 */
@Configuration(proxyBeanMethods = false)
@EnableJpaRepositories(basePackages = "com.bracso.demo.transaction.db2.repository", entityManagerFactoryRef = "em2")
public class EM2Configuration {

    @Bean
    public LocalContainerEntityManagerFactoryBean em2(EntityManagerFactoryBuilder builder, @Qualifier("ds2") DataSource ds2, JpaProperties jpaConfiguration) {
        return builder
                .dataSource(ds2)
                .persistenceUnit("ds2PersistenceUnit")
                .properties(jpaConfiguration.getProperties())
                .jta(true)
                .packages("com.bracso.demo.transaction.entities")
                .build();
    }

}
