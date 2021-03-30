package com.xoco.nunez.howtodoinjava.junit5.lifecycle;

import com.xoco.nunez.howtodoinjava.junit5.examples.Calculator;
import org.junit.jupiter.api.*;

import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

/**
 * JUnit 5 Test LifeCycle
 * In JUnit 5, test lifecycle is driven by 4 primary annotations i.e. @BeforeAll, @BeforeEach,
 * @AfterEach and @AfterAll. Along with it, each test method must be marked with @Test annotation.
 * @Test annotation is virtually unchanged, although it no longer takes optional arguments.
 */
public class AppTest {

    /**
     * Before And After
     * In junit test life cycle, you will primarily need to have some methods to setup and tear down
     * the environment or test data on which the tests run.
     *
     * In JUnit, for each test – a new instance of test is created. @BeforeAll and @AfterAll
     * annotations – clear by their name – should be called only once in entire tests execution
     * cycle. So they must be declared static.
     *
     * If their are multiple methods annotated with same annotation (e.g. two methods with
     * @BeforeAll) then their execution order is undetermined.
     *
     * @BeforeEach and @AfterEach are invoked for each instance of test so they need not to be
     * static.
     */
    @BeforeAll
    static void setup() {
        System.out.println("@BeforeAll executed");
    }

    @BeforeEach
    void setupThis() {
        System.out.println("@BeforeEach executed");
    }

    @Test
    void testCalcOne() {
        System.out.println("===== TEST ONE EXECUTED =====");
        assertEquals(4, Calculator.add(2, 2));
    }

    @Test
    void testCalcTwo() {
        System.out.println("===== TEST TWO EXECUTED =====");
        assertEquals(6, Calculator.add(2, 4));
    }

    /**
     * Disabling Test
     * To disable a test in JUnit 5, you will need to use @Disabled annotation. It is equivalent to
     * JUnit 4’s @Ignored annotation.
     *
     * @Disabled annotation can be applied over test class (disables all test methods in that class)
     * or individual test methods as well.
     */
    @Disabled
    @Test
    void testCalcThree() {
        System.out.println("===== TEST Three EXECUTED =====");
        assertEquals(6, Calculator.add(2, 4));
    }

    /**
     * Assertions
     * In any test method, we will need to determine whether it passes of fails. You can do it using
     * Assertions. Assertions help in validating the expected output with actual output of a
     * testcase. To keep things simple, all JUnit Jupiter assertions are static methods in
     * the org.junit.jupiter.Assertions class.
     */
    @Test
    void testCase()
    {
        //Test will pass
        assertEquals(4, Calculator.add(2, 2));

        //Test will fail
        assertEquals(3, Calculator.add(2, 2), "Calculator.add(2, 2) test failed");

        //Test will fail
        Supplier<String> messageSupplier  = () -> "Calculator.add(2, 2) test failed";
        assertEquals(3, Calculator.add(2, 2), messageSupplier);
    }

    /**
     * To fail a test, simply use Assertions.fail() method.
     */
    @Test
    void testCaseFail() {
        fail("not found good reason to pass");
    }

    /**
     * Assumptions
     * Assumptions provides static methods to support conditional test execution based on
     * assumptions. A failed assumption results in a test being aborted. Assumptions are typically
     * used whenever it does not make sense to continue execution of a given test method. In test
     * report, these test will be marked as passed.
     *
     * Assumptions class has two methods: assumeFalse(), assumeTrue(). A third method assumeThat()
     * is in Experimental state and might be confirmed in future releases.
     */
    @Test
    void testOnDev()
    {
        System.setProperty("ENV", "DEV");
        Assumptions.assumeTrue("DEV".equals(System.getProperty("ENV")));
        //remainder of test will proceed
    }

    @Test
    void testOnProd()
    {
        System.setProperty("ENV", "PROD");
        Assumptions.assumeTrue("DEV".equals(System.getProperty("ENV")));
        //remainder of test will be aborted
    }

    @AfterEach
    void tearDownThis() {
        System.out.println("@AfterEach executed");
    }

    @AfterAll
    static void tearDown() {
        System.out.println("@AfterAll executed");
    }
}
