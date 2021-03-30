package com.xoco.nunez.howtodoinjava.junit5.tag;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

/**
 * Let’s create test plan for both environments.
 *
 * Tests to run in production environment
 */
@RunWith(JUnitPlatform.class)
@SelectPackages("com.xoco.nunez.howtodoinjava.junit5.tag")
@IncludeTags("production")
public class ProductionTstPlanTest {
}
