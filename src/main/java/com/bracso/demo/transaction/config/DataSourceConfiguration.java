/*
 * Copyright (c) 2021.  Inditex 
 */

package com.bracso.demo.transaction.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 *
 * @author oburgosm
 */
@Configuration(proxyBeanMethods = false)
@Import({Ds1Configuration.class, Ds2Configuration.class})
public class DataSourceConfiguration {

}
