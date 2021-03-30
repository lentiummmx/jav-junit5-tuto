package com.xoco.nunez.howtodoinjava.junit5.repeatedtest;

import com.xoco.nunez.howtodoinjava.junit5.examples.Calculator;
import org.junit.jupiter.api.*;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * JUnit 5 @RepeatedTest Annotation Example
 * JUnit 5 @RepeatedTest annotation enable to write repeatable test templates which could be run
 * multiple times. The frequency can be configured as parameter to @RepeatedTest annotation.
 *
 * 1. @RepeatedTest annotation usage
 * To create repeatable test template method, annotate the method with @RepeatedTest.
 */
@RunWith(JUnitPlatform.class)
public class RepeatedTestExample {

    /**
     * Test will repeated 5 times.
     *
     * Please note that each invocation of a repeated test behaves like the execution of a regular
     * @Test method with full support for the same lifecycle callbacks and extensions. It means that
     * @BeforeEach and @AfterEach annotated methods will be invoked where they fit in test life
     * cycle, for each individual invocation.
     *
     * @param testInfo
     * @param repetitionInfo
     */
    @DisplayName("Add operation test")
    @RepeatedTest(5)
    void addNumber(TestInfo testInfo, RepetitionInfo repetitionInfo) {
        System.out.println("Running test -> " + repetitionInfo.getCurrentRepetition());
        assertEquals(2, Calculator.add(1, 1), "1 + 1 should equal 2");
    }

    /**
     * 2. Custom Display Test Names
     * Apart from specifying the number of repetitions, you can give a custom display name to each
     * repetition. This custom display name can be combination of static text + dynamic place
     * holders. Currently, 3 place holders are supported:
     *
     * {displayName}: display name of the @RepeatedTest method.
     * {currentRepetition}: the current repetition count.
     * {totalRepetitions}: the total number of repetitions.
     *
     * @param testInfo
     * @param repetitionInfo
     */
    @DisplayName("Add operation 2 test")
    @RepeatedTest(value = 5, name = "{displayName} - repetition {currentRepetition} of {totalRepetitions}")
    void addNumberCustDisplName(TestInfo testInfo, RepetitionInfo repetitionInfo) {
        System.out.println("Running test -> " + repetitionInfo.getCurrentRepetition());
        assertEquals(2, Calculator.add(1, 1), "1 + 1 should equal 2");
    }

    /**
     * You can use one of two predefined formats i.e. RepeatedTest.LONG_DISPLAY_NAME and
     * RepeatedTest.SHORT_DISPLAY_NAME. SHORT_DISPLAY_NAME is default format if none specified.
     *
     * RepeatedTest.LONG_DISPLAY_NAME – {displayName} :: repetition {currentRepetition} of {totalRepetitions}
     * RepeatedTest.SHORT_DISPLAY_NAME – repetition {currentRepetition} of {totalRepetitions}
     *
     * @param testInfo
     * @param repetitionInfo
     */
    @DisplayName("Add operation 3 test")
    //@RepeatedTest(value = 5, name = RepeatedTest.SHORT_DISPLAY_NAME)
    @RepeatedTest(value = 5, name = RepeatedTest.LONG_DISPLAY_NAME)
    void addNumberPredfndForms(TestInfo testInfo, RepetitionInfo repetitionInfo) {
        System.out.println("Running test -> " + repetitionInfo.getCurrentRepetition());
        assertEquals(2, Calculator.add(1, 1), "1 + 1 should equal 2");
    }

    @BeforeAll
    public static void init() {
        System.out.println("Before All init() method called");
    }

    /**
     * 3. RepetitionInfo interface
     * RepetitionInfo is used to inject information about the current repetition of a repeated test
     * into @RepeatedTest, @BeforeEach, and @AfterEach methods.
     *
     * @param repetitionInfo
     */
    @BeforeEach
    public void initEach(RepetitionInfo repetitionInfo) {
        int currentRepetition = repetitionInfo.getCurrentRepetition();
        int totalRepetitions = repetitionInfo.getTotalRepetitions();
        // Use information as needed
        System.out.println("BeforeEach initEach() method called");
    }

    @AfterAll
    public static void cleanUp(){
        System.out.println("After All cleanUp() method called");
    }

    /**
     * see #initEach
     *
     * @param repetitionInfo
     */
    @AfterEach
    public void cleanUpEach(RepetitionInfo repetitionInfo){
        int currentRepetition = repetitionInfo.getCurrentRepetition();
        int totalRepetitions = repetitionInfo.getTotalRepetitions();
        // Use information as needed
        System.out.println("After Each cleanUpEach() method called");
    }
}
