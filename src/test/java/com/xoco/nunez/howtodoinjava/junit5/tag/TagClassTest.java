package com.xoco.nunez.howtodoinjava.junit5.tag;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

/**
 * JUnit 5 @Tag Annotation Example
 * JUnit 5 @Tag can be used to filter testcases from test plans. It can help in create multiple
 * different test plans for different environments, different use-cases or any specific requirement.
 * You can execute set of tests by including only those tagged tests in test plan OR by excluding
 * other tests from test plan.
 *
 * 1. @Tag Annotation Usage
 * We can apply the @Tag annotation on test class or test method or both.
 */
@Tag("development")
public class TagClassTest {
    @Test
    @Tag("userManagement")
    void testCaseA(TestInfo testInfo) {}

    /**
     * 2. We can apply multiple tags on single test case as well, so that you can include it in
     * multiple test plans.
     *
     * @param testInfo
     */
    @Test
    @Tag("development")
    @Tag("production")
    void testCaseB(TestInfo testInfo) {}
}
