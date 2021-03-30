package com.xoco.nunez.howtodoinjava.junit5.intro;

import com.xoco.nunez.howtodoinjava.junit5.examples.Calculator;
import org.junit.jupiter.api.*;

import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

/**
 * JUnit 5 Annotations
 * JUnit 5 offers following annotations to write tests.
 *
 * ANNOTATION	DESCRIPTION
 * @BeforeEach The annotated method will be run before each test method in the test class.
 * @AfterEach The annotated method will be run after each test method in the test class.
 * @BeforeAll The annotated method will be run before all test methods in the test class. This method must be static.
 * @AfterAll The annotated method will be run after all test methods in the test class. This method must be static.
 * @Test It is used to mark a method as junit test
 * @DisplayName Used to provide any custom display name for a test class or test method
 * @Disable It is used to disable or ignore a test class or method from test suite.
 * @Nested Used to create nested test classes
 * @Tag Mark test methods or test classes with tags for test discovering and filtering
 * @TestFactory Mark a method is a test factory for dynamic tests
 *
 * Writing Tests in JUnit 5
 * There is not much changed between JUnit 4 and JUnit 5 in test writing styles. Here is sample tests with their life cycle methods.
 */
public class AppTest {

    @BeforeAll
    static void setup() {
        System.out.println("@BeforeAll executed");
    }

    @BeforeEach
    void setupThis() {
        System.out.println("@BeforeEach executed");
    }

    @Tag("DEV")
    @Test
    void testCalcOne() {
        System.out.println("===== TEST ONE EXECUTED =====");
        Assertions.assertEquals(4, Calculator.add(2, 2));
    }

    @Tag("PROD")
    @Disabled
    @Test
    void testCalcTwo() {
        System.out.println("===== TEST TWO EXECUTED =====");
        assertEquals(6, Calculator.add(2, 4));
    }

    /**
     * Assertions
     * Assertions help in validating the expected output with actual output of a testcase. To keep
     * things simple, all JUnit Jupiter assertions are static methods in
     * the org.junit.jupiter.Assertions class e.g. assertEquals(), assertNotEquals().
     */
    @Test
    void testCase() {
        // Test will pass
        assertNotEquals(3, Calculator.add(2, 2));

        // Test will fail
        assertNotEquals(4, Calculator.add(2, 2), "Calculator.add(2, 2) test failed");

        // Test will fail
        Supplier<String> messageSupplier = () -> "Calculator.add(2, 2) test failed";
        assertNotEquals(4, Calculator.add(2, 2), messageSupplier);
    }

    /**
     * Assumptions
     * Assumptions class provides static methods to support conditional test execution based on
     * assumptions. A failed assumption results in a test being aborted. Assumptions are typically
     * used whenever it does not make sense to continue execution of a given test method. In test
     * report, these test will be marked as passed.
     *
     * JUnit jupiter Assumptions class has two such methods: assumeFalse(), assumeTrue().
     */
    @Test
    void testOnDev() {
        System.setProperty("ENV", "DEV");
        assumeTrue("DEV".equals(System.getProperty("ENV")), AppTest::message);
    }

    @Test
    void testOnProd() {
        System.setProperty("ENV", "PROD");
        assumeFalse("DEV".equals(System.getProperty("ENV")));
    }

    private static String message() {
        return "TEST Execution Failed :: ";
    }

    @AfterEach
    void tearDownThis(){
        System.out.println("@AfterEach executed");
    }

    @AfterAll
    static void tearDown() {
        System.out.println("@AfterAll executed");
    }
}
