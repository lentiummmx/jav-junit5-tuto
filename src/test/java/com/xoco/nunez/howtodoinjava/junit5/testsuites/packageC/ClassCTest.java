package com.xoco.nunez.howtodoinjava.junit5.testsuites.packageC;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

public class ClassCTest {
    @Test
    @Tag("development")
    void testCaseC(TestInfo testInfo) {
        // run in all environments
    }
}
