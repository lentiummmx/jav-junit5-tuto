package com.xoco.nunez.howtodoinjava.junit5.tag;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

/**
 * To add more than one tag, pass a string array of tags in desired annotation.
 */
@RunWith(JUnitPlatform.class)
@SelectPackages("com.xoco.nunez.howtodoinjava.junit5.tag")
@IncludeTags({"production", "development"})
public class MultipleIncludeTagsExample {
}
