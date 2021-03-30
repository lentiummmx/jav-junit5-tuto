package com.xoco.nunez.howtodoinjava.junit5.testsuites;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

/**
 * 2. Create Test Suite with @SelectPackages
 *
 * Specify Multiple Packages
 * Pass package names in parameter as string array (inside curly braces {}) to @SelectPackages
 * annotation.
 */
@RunWith(JUnitPlatform.class)
@SelectPackages({"com.xoco.nunez.howtodoinjava.junit5.testsuites.packageA", "com.xoco.nunez.howtodoinjava.junit5.testsuites.packageB"})
public class JUnit5TestSuiteExample2 {
}
/**
 * Please note that if we pass ‘packageX’ in @SelectPackages annotation, then test classes present
 * in this package AND all it’s sub-packages will be selected for test suite.
 */
