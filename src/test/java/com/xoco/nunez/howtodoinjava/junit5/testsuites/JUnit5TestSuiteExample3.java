package com.xoco.nunez.howtodoinjava.junit5.testsuites;

import com.xoco.nunez.howtodoinjava.junit5.testsuites.packageA.ClassATest;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

/**
 * 3. Create Test Suite with @SelectClasses
 * @SelectClasses specifies the classes to select when running a test suite via
 * @RunWith(JUnitPlatform.class).
 *
 * Specify Single Class
 * Pass ClassName.class as parameter to @SelectClasses annotation.
 */
@RunWith(JUnitPlatform.class)
@SelectClasses(ClassATest.class)
public class JUnit5TestSuiteExample3 {
}
