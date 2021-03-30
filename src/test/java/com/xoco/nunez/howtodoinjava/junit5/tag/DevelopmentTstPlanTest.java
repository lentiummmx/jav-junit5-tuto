package com.xoco.nunez.howtodoinjava.junit5.tag;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

/**
 * Tests to run in development environment
 */
@RunWith(JUnitPlatform.class)
@SelectPackages("com.xoco.nunez.howtodoinjava.junit5.tag")
//@SelectClasses({ClassATest.class, ClassBTest.class, ClassCTest.class})
@IncludeTags("development")
public class DevelopmentTstPlanTest {
}
