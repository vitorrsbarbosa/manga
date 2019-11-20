package com.barbosa.categoryTypes.classes;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import com.barbosa.categoryTypes.performance.PerformanceTests;
import com.barbosa.categoryTypes.regression.RegressionTests;

public class ClassCTests {

    @Category({ PerformanceTests.class, RegressionTests.class })
    @Test
    public void test_c_1() {
        assertThat(1 == 1, is(true));
    }

    @Category(RegressionTests.class)
    @Test
    public void test_c_2() {
        assertThat(1 == 1, is(true));
    }

}