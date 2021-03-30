package com.xoco.nunez.howtodoinjava.junit5.tag;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

/**
 * 2. Create test plans with @IncludeTags and @ExcludeTags
 * We can use @IncludeTags or @ExcludeTags annotations in your testplan to filter tests or include
 * tests.
 */
@RunWith(JUnitPlatform.class)
@SelectPackages("com.xoco.nunez.howtodoinjava.junit5.tag")
//@IncludeTags("production")
@ExcludeTags("production")
public class MultipleTagsExample {
}
