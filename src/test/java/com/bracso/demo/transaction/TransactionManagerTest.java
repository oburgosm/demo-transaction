package com.bracso.demo.transaction;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.jta.JtaTransactionManager;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 *
 * @author oburgosm
 */
@SpringBootTest(classes = TransactionManagerTest.class)
@EnableAutoConfiguration
public class TransactionManagerTest {
    
    @Autowired
    PlatformTransactionManager platformTransactionManager;

    @Test
    void testTransactionManager() {
        // Only if Atomikos is in classpath
        assertThat(this.platformTransactionManager, is(instanceOf(JtaTransactionManager.class)));
    }
    
}
