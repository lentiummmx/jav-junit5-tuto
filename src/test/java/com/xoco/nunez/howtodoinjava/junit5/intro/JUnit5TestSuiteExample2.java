package com.xoco.nunez.howtodoinjava.junit5.intro;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.IncludePackages;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

/**
 * Additionally, you can use following annotations for filtering test packages, classes or even test
 * methods.
 *
 * @IncludePackages and @ExcludePackages to filter packages
 * @IncludeClassNamePatterns and @ExcludeClassNamePatterns to filter test classes
 * @IncludeTags and @ExcludeTags to filter test methods
 */
@RunWith(JUnitPlatform.class)
@SelectPackages("com.xoco.nunez.howtodoinjava.junit5")
//@SelectClasses()
@IncludePackages("com.xoco.nunez.howtodoinjava.junit5.intro")
@ExcludeTags("PROD")
public class JUnit5TestSuiteExample2 {
}
