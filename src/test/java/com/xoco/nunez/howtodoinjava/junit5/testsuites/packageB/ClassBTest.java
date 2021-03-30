package com.xoco.nunez.howtodoinjava.junit5.testsuites.packageB;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

public class ClassBTest {
    @Test
    @Tag("development")
    void testCaseB(TestInfo testInfo) {
        // run in all environments
    }
}
