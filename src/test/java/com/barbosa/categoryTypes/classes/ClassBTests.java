package com.barbosa.categoryTypes.classes;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import com.barbosa.categoryTypes.performance.PerformanceTests;
import com.barbosa.categoryTypes.regression.RegressionTests;

@Category({ PerformanceTests.class, RegressionTests.class })
public class ClassBTests {

    @Test
    public void test_b_1() {
        assertThat(1 == 1, is(true));
    }

}