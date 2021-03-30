package com.xoco.nunez.howtodoinjava.junit5.testsuites;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.ExcludePackages;
import org.junit.platform.suite.api.IncludePackages;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

/**
 * 4. @IncludePackages and @ExcludePackages
 *
 * @ExcludePackages Example
 * This will add tests from test classes in com.howtodoinjava.junit5.examples but exclude all test
 * classes from sub-package com.howtodoinjava.junit5.examples.packageC i.e. ClassATest and ClassBTest.
 */
@RunWith(JUnitPlatform.class)
@SelectPackages("com.xoco.nunez.howtodoinjava.junit5.testsuites")
@ExcludePackages("com.xoco.nunez.howtodoinjava.junit5.testsuites.packageC")
public class JUnit5TestSuiteExample6 {
}
