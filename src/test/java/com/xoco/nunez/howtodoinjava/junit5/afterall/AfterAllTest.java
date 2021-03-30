package com.xoco.nunez.howtodoinjava.junit5.afterall;

import com.xoco.nunez.howtodoinjava.junit5.examples.Calculator;
import org.junit.jupiter.api.*;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * JUnit 5 @AfterAll annotation example
 * JUnit 5 @AfterAll annotation is replacement of @AfterClass annotation in JUnit 4. It is used to
 * signal that the annotated method should be executed after all tests in the current test class.
 *
 * @AfterAll Annotation Usage
 * Annotate a method with @AfterAll as given below:
 *
 * @AfterAll annotated method MUST be a static method otherwise it will throw runtime error.
 */
@RunWith(JUnitPlatform.class)
public class AfterAllTest {

    /**
     * @AfterAll Annotation Example
     * I will test it 5 times using @RepeatedTest annotation. This annotation will cause the add
     * test to run 5 times. But @AfterAll annotated method must be called only once.
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

    @BeforeAll
    public static void init() {
        System.out.println("Before All init() method called");
    }

    @BeforeEach
    public void initEach() {
        System.out.println("BeforeEach initEach() method called");
    }

    @AfterAll
    public static void cleanUp(){
        System.out.println("After All cleanUp() method called");
    }

    @AfterEach
    public void cleanUpEach(){
        System.out.println("After Each cleanUpEach() method called");
    }
}
