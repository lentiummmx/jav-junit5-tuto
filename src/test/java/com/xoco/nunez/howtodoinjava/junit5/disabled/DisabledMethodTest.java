package com.xoco.nunez.howtodoinjava.junit5.disabled;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assumptions.assumeFalse;

public class DisabledMethodTest {

    /**
     * JUnit 5 @Disabled Test Method
     * @Disabled is used to signal that the annotated test method is currently disabled and should
     * not be executed.
     */
    @Disabled("Do not run in lower environment")
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
