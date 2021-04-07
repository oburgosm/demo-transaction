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
@Import({EM1Configuration.class, EM2Configuration.class})
public class EMConfiguration {

}
