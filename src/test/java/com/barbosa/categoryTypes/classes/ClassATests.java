package com.barbosa.categoryTypes.classes;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import com.barbosa.categoryTypes.performance.PerformanceTests;

public class ClassATests {

    @Category(PerformanceTests.class)
    @Test
    public void test_a_1() {
        assertThat(1 == 1, is(true));
    }

    @Test
    public void test_a_2() {
        assertThat(1 == 1, is(true));
    }

}