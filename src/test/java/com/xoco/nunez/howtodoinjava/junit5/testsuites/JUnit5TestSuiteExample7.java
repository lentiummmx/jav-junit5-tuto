package com.xoco.nunez.howtodoinjava.junit5.testsuites;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.ExcludePackages;
import org.junit.platform.suite.api.IncludeClassNamePatterns;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

/**
 * 5. @IncludeClassNamePatterns and @ExcludeClassNamePatterns
 * Many times it is not feasible to include all packages or test class names in select annotations.
 * In that case, you may give a broader package scope and appy filtering on which test classes to be
 * included or excluded from suite.
 *
 * To specify test class names patterns to exclude or include, you can use @IncludeClassNamePatterns
 * and @ExcludeClassNamePatterns annotations.
 *
 * @IncludeClassNamePatterns Example
 * Include all test classes with name ending with ATest or ATests.
 */
@RunWith(JUnitPlatform.class)
@SelectPackages("com.xoco.nunez.howtodoinjava.junit5.testsuites")
@IncludeClassNamePatterns({"^.*ATests?$"})
public class JUnit5TestSuiteExample7 {
}
