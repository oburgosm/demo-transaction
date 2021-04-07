package com.bracso.demo.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.jta.JtaTransactionManager;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 *
 * @author oburgosm
 */
@SpringBootTest
public class TransactionManagerTest {
    
    @Autowired
    PlatformTransactionManager platformTransactionManager;

    @Test
    void testTransactionManager() {
        // Only if Atomikos is in classpath
        assertThat(this.platformTransactionManager, is(instanceOf(JtaTransactionManager.class)));
    }
    
}
