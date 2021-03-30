package com.xoco.nunez.howtodoinjava.junit5.testsuites;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.ExcludeClassNamePatterns;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

/**
 * 6. @IncludeTags and @ExcludeTags
 * In enterprise applications, you may have tagged test cases which you want to run in specific
 * environments e.g. development or production. You can include or exclude tests based on these tags
 * as well, from a test suite.
 *
 * @IncludeTags Example
 * This test suite will run all tests tagged with production inside package
 * com.howtodoinjava.junit5.examples (and it’s sub-packages).
 */
@RunWith(JUnitPlatform.class)
@SelectPackages("com.xoco.nunez.howtodoinjava.junit5.testsuites")
@IncludeTags("production")
public class JUnit5TestSuiteExample9 {
}
