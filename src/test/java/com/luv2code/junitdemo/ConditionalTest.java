package com.luv2code.junitdemo;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class ConditionalTest {

    @Test
    @Disabled("Don't Run until issue #123 fixed")
    void testOnlyWithoutDisapled(){

    }

    @Test
    @DisabledOnOs(OS.WINDOWS)
    void testOnlyWithWindows(){

    }

    @Test
    @DisabledOnOs(OS.MAC)
    void testOnlyWithMac(){

    }

    @Test
    @DisabledOnJre(JRE.JAVA_8)
    void testOnlyWithJava8(){

    }

    @Test
    @DisabledOnJre(JRE.JAVA_17)
    void testOnlyWithJava17(){

    }

    @Test
    @DisabledOnJre(JRE.JAVA_11)
    void testOnlyWithJava11(){

    }

    @Test
    @EnabledIfEnvironmentVariable(named = "DEV_ENV", matches = "DEV")
    void testOnlyForDevEnvironment(){

    }
}
