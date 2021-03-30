package com.xoco.nunez.howtodoinjava.junit5.testsuites;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.ExcludeClassNamePatterns;
import org.junit.platform.suite.api.IncludeClassNamePatterns;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

/**
 * 5. @IncludeClassNamePatterns and @ExcludeClassNamePatterns
 *
 * @ExcludeClassNamePatterns Example
 * Exclude all test classes with name ending with ATest or ATests.
 */
@RunWith(JUnitPlatform.class)
@SelectPackages("com.xoco.nunez.howtodoinjava.junit5.testsuites")
@ExcludeClassNamePatterns({"^.*ATests?$"})
public class JUnit5TestSuiteExample8 {
}
/**
 * You may apply more than one pattern in above annotations. In case of multiple patterns, they are
 * combined using OR semantics. It means that if fully qualified name of a class matches against at
 * least one of the patterns, the class will be included/excluded from the test suite.
 */
