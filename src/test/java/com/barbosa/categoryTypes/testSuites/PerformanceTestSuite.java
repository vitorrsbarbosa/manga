package com.barbosa.categoryTypes.testSuites;

import com.barbosa.categoryTypes.classes.ClassATests;
import com.barbosa.categoryTypes.classes.ClassBTests;
import com.barbosa.categoryTypes.classes.ClassCTests;
import com.barbosa.categoryTypes.performance.PerformanceTests;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory(PerformanceTests.class)
// Include multiple categories
// @Categories.IncludeCategory({PerformanceTests.class, RegressionTests.class})
@Suite.SuiteClasses({ ClassATests.class, ClassBTests.class, ClassCTests.class })
public class PerformanceTestSuite {
}