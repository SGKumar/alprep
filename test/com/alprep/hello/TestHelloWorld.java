package com.alprep.hello;

import org.junit.Test;
import static org.junit.Assert.*;

import com.alprep.hello.HelloWorld;

public class TestHelloWorld {
    @Test public void testAppHasAGreeting() {
        HelloWorld classUnderTest = new HelloWorld();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }
}
