package com.xoco.nunez.howtodoinjava.junit5.disabled;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assumptions.assumeFalse;

/**
 * JUnit 5 @Disabled Test Example
 * JUnit @Disabled annotation can be used to disable the test methods from test suite. This
 * annotation can be applied over a test class as well as over individual test methods.
 *
 * It accepts only one optional parameter, which indicates the reason this test is disabled.
 *
 * @Disabled Test Class
 * When @Disabled is applied over test class, all test methods within that class are automatically
 * disabled as well.
 */
@Disabled
public class DisabledClassTest {

    @Test
    void testOnDev() {
        System.setProperty("ENV", "DEV");
        assumeFalse("DEV".equals(System.getProperty("ENV")));
    }

    @Test
    void testOnProd() {
        System.setProperty("ENV", "PROD");
        assumeFalse("DEV".equals(System.getProperty("ENV")));
    }
}
