package com.xoco.nunez.howtodoinjava.junit5.intro;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

/**
 * Test Suites
 * Using JUnit 5 test suites, you can run tests spread into multiple test classes and different
 * packages. JUnit 5 provides two annotations: @SelectPackages and @SelectClasses to create test
 * suites.
 *
 * To execute the suite, you will use @RunWith(JUnitPlatform.class).
 */
@RunWith(JUnitPlatform.class)
@SelectPackages("com.xoco.nunez.howtodoinjava.junit5")
//@SelectClasses()
public class JUnit5TestSuiteExample {
}
