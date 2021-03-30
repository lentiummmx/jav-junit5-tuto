package com.xoco.nunez.howtodoinjava.junit5.assumptions;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

/**
 * JUnit 5 Assumptions Examples
 * JUnit 5 Assumptions class provides static methods to support conditional test execution based on
 * assumptions. A failed assumption results in a test being aborted. Assumptions are typically used
 * whenever it does not make sense to continue execution of a given test method. In test report,
 * these test will be marked as passed.
 *
 * JUnit jupiter Assumptions class has two such methods: assumeFalse(), assumeTrue().
 *
 * A third method assumeThat() is in Experimental state and might be confirmed in future.
 * Table of Contents
 *
 * Assumptions.assumeTrue()
 * Assumptions.assumeFalse()
 */
public class AppTest {
    /**
     * JUnit 5 Assumptions.assumeTrue()
     * assumeTrue() validates the given assumption to true and if assumption is true – test proceed,
     * otherwise test execution is aborted.
     *
     * It has following overloaded methods.
     *
     * public static void assumeTrue(boolean assumption) throws TestAbortedException
     * public static void assumeTrue(boolean assumption, Supplier<String> messageSupplier) throws TestAbortedException
     * public static void assumeTrue(boolean assumption, String message) throws TestAbortedException
     *
     * public static void assumeTrue(BooleanSupplier assumptionSupplier) throws TestAbortedException
     * public static void assumeTrue(BooleanSupplier assumptionSupplier, String message) throws TestAbortedException
     * public static void assumeTrue(BooleanSupplier assumptionSupplier, Supplier<String> messageSupplier) throws TestAbortedException
     */
    @Test
    void testOnDevAssmTrue()
    {
        System.setProperty("ENV", "DEV");
        Assumptions.assumeTrue("DEV".equals(System.getProperty("ENV")));
        //remainder of test will proceed
    }

    @Test
    void testOnProdAssmTrue()
    {
        System.setProperty("ENV", "PROD");
        Assumptions.assumeTrue("DEV".equals(System.getProperty("ENV")), AppTest::message);
        //remainder of test will be aborted
    }

    private static String message () {
        return "TEST Execution Failed :: ";
    }

    /**
     * JUnit 5 Assumptions.assumeFalse()
     * assumeFalse() validates the given assumption to false and if assumption is false – test
     * proceed, otherwise test execution is aborted. It works just opposite to assumeTrue().
     *
     * It has following overloaded methods.
     *
     * public static void assumeFalse(boolean assumption) throws TestAbortedException
     * public static void assumeFalse(boolean assumption, Supplier<String> messageSupplier) throws TestAbortedException
     * public static void assumeFalse(boolean assumption, String message) throws TestAbortedException
     *
     * public static void assumeFalse(BooleanSupplier assumptionSupplier) throws TestAbortedException
     * public static void assumeFalse(BooleanSupplier assumptionSupplier, String message) throws TestAbortedException
     * public static void assumeFalse(BooleanSupplier assumptionSupplier, Supplier<String> messageSupplier) throws TestAbortedException
     */
    @Test
    void testOnDevAssmFalse()
    {
        System.setProperty("ENV", "DEV");
        Assumptions.assumeFalse("DEV".equals(System.getProperty("ENV")), AppTest::message);
        //remainder of test will be aborted
    }

    @Test
    void testOnProdAssmFalse()
    {
        System.setProperty("ENV", "PROD");
        Assumptions.assumeFalse("DEV".equals(System.getProperty("ENV")));
        //remainder of test will proceed

    }
}
