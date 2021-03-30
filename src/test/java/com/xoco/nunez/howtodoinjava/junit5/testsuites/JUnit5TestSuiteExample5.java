package com.xoco.nunez.howtodoinjava.junit5.testsuites;

import com.xoco.nunez.howtodoinjava.junit5.testsuites.packageA.ClassATest;
import com.xoco.nunez.howtodoinjava.junit5.testsuites.packageB.ClassBTest;
import com.xoco.nunez.howtodoinjava.junit5.testsuites.packageC.ClassCTest;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludePackages;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

/**
 * 4. @IncludePackages and @ExcludePackages
 * As we learn that @SelectPackages causes all it’s sub-packages as well to be scanned for test
 * classes. If you want to exclude any specific sub-package, or include any package then you may use
 * @IncludePackages and @ExcludePackages annotations.
 *
 * @IncludePackages Example
 * This will add tests from test classes in com.howtodoinjava.junit5.examples.packageC only i.e. ClassCTest.
 */
@RunWith(JUnitPlatform.class)
@SelectPackages("com.xoco.nunez.howtodoinjava.junit5.testsuites")
@IncludePackages("com.xoco.nunez.howtodoinjava.junit5.testsuites.packageC")
public class JUnit5TestSuiteExample5 {
}
