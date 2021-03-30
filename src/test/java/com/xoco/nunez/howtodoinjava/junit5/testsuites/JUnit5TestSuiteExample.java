package com.xoco.nunez.howtodoinjava.junit5.testsuites;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

/**
 * 2. Create Test Suite with @SelectPackages
 * @SelectPackages specifies the names of packages to select when running a test suite via
 * @RunWith(JUnitPlatform.class).
 *
 * Specify Single Package
 * Pass “packageName” as parameter to @SelectPackages annotation.
 */
@RunWith(JUnitPlatform.class)
@SelectPackages("com.xoco.nunez.howtodoinjava.junit5.testsuites.packageA")
public class JUnit5TestSuiteExample {
}
