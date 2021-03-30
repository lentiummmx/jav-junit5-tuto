package com.xoco.nunez.howtodoinjava.junit5.expectexcept;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * JUnit 5 Expected Exception – assertThrows() Example
 * In JUnit 5, to test methods which throws exceptions, we should use .assertThrows() method from
 * org.junit.jupiter.api.Assertions class.
 *
 * 1. Syntax
 * The assertThrows() method asserts that execution of the supplied executable block or lambda
 * expression which throws an exception of the expectedType.
 *
 * <code>public static <T extends Throwable> T assertThrows(Class<T> expectedType, Executable executable)</code>
 *
 * If no exception is thrown from the executable block, or if an exception of a different type is
 * thrown, assertThrows() method will fail.
 *
 * Please note that if the code block throws an exception of a class that is a subtype of the
 * expected exception type, then the assertion will pass.
 *
 * For example, if we are expecting IllegalArgumentException and the test throws
 * NumberFormatException then also the test will PASS because NumberFormatException extends
 * IllegalArgumentException class.
 *
 * This also means that if we pass Exception.class as the expected exception type, any exception
 * thrown from the code block will make the assertion succeed since Exception is the super-type for
 * all exceptions.
 */
public class ExpectedExceptionTest {

    /**
     * 2. JUnit 5 expected exception example
     * The given below is a very simple example of a test that expects NumberFormatException to be thrown when the
     * supplied code block is executed.
     *
     * Here executable code is Integer.parseInt("One") which throws NumberFormatException if method argument is not a
     * valid numeric number.
     *
     * In the above example, "One" is not a valid numeric so the code throws the NumberFormatException, which
     * the assertThrows() method expects – so the test passes.
     */
    @Test
    void testExpectedException() {
        // First arg - specifies the expected exception.
        // Here it expects that code block will thow NumberFormatException
        // Second arg - is used to pass an executable code block or lambda expression
        assertThrows(NumberFormatException.class, () -> {
            Integer.parseInt("one");
        });
    }

    /**
     * 3. Expecting exceptions of super-types
     * As mentioned earlier, we can expect the parent/supertype of any exception class as well. For example, the above
     * test can be written with IllegalArgumentException also.
     *
     * This test case will also pass because the IllegalArgumentException is parent class of NumberFormatException which
     * is thrown from the test method.
     */
    @Test
    void testExpectedExceptionWithSuperType() {
        // IllegalArgumentException is parent class of NumberFormatException
        // This assertion will pass
        assertThrows(IllegalArgumentException.class, () -> {
            Integer.parseInt("one");
        });
    }

    /**
     * 4. Exception of different types, or no exception thrown
     * If executable code throws any other exception type, then test will FAIL; or even if test does not throw any
     * exception then also test will FAIL.
     *
     * For example, in below example "1" is a valid number so no exception will be thrown. This test will fail.
     */
    @Test
    void testExpectedExceptionFail() {
        // Code does not throw any exception
        // this assertion will fails
        assertThrows(IllegalArgumentException.class, () -> {
            Integer.parseInt("1");
        });
    }
}
