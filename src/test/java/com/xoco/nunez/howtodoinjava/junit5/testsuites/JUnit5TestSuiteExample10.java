package com.xoco.nunez.howtodoinjava.junit5.testsuites;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

/**
 * 6. @IncludeTags and @ExcludeTags
 *
 * @ExcludeTags Example
 * This test suite will exclude all tests tagged with development inside package
 * com.howtodoinjava.junit5.examples (and it’s sub-packages).
 */
@RunWith(JUnitPlatform.class)
@SelectPackages("com.xoco.nunez.howtodoinjava.junit5.testsuites")
@ExcludeTags("development")
public class JUnit5TestSuiteExample10 {
}
