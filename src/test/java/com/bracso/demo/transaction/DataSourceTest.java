package com.bracso.demo.transaction;

import java.util.Map;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.aMapWithSize;

/**
 *
 * @author oburgosm
 */
@SpringBootTest
public class DataSourceTest {

    @Autowired
    Map<String, DataSource> datasources;

    @Test
    void testDatasources() {
        assertThat(this.datasources, is(aMapWithSize(2)));
    }

}
