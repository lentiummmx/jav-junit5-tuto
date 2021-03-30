package com.xoco.nunez.howtodoinjava.junit5.testsuites;

import com.xoco.nunez.howtodoinjava.junit5.testsuites.packageA.ClassATest;
import com.xoco.nunez.howtodoinjava.junit5.testsuites.packageB.ClassBTest;
import com.xoco.nunez.howtodoinjava.junit5.testsuites.packageC.ClassCTest;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

/**
 * 3. Create Test Suite with @SelectClasses
 *
 * Specify Multiple Classes
 * Pass class names in parameter as array (inside curly braces {}) to @SelectClasses annotation.
 */
@RunWith(JUnitPlatform.class)
@SelectClasses({ClassATest.class, ClassBTest.class, ClassCTest.class})
public class JUnit5TestSuiteExample4 {
}
