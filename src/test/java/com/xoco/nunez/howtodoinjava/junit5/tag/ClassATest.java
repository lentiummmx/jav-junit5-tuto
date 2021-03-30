package com.xoco.nunez.howtodoinjava.junit5.tag;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

/**
 * 3. JUnit 5 @Tag Example
 * Let’s say we have 3 tests and we want to run all 3 in development environment; but want to run
 * only one in production. So we will tag the tests as below:
 */
public class ClassATest {
    @Test
    @Tag("development")
    @Tag("production")
    void testCaseA(TestInfo testInfo) {
        // run in all environments
    }
}
