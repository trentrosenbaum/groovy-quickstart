package com.mycompany.example

import org.junit.Test

/**
 * Simple unit tests to ensure quick start project is working.
 * @author Trent Rosenbaum
 */
class HelloWorldTests {

    @Test
    public void testDefaultHelloGreeting(){

        def object = new HelloWorld()

        assert object != null
        assert object.greeting() == 'Hello World!!'

    }

    @Test
    public void testNamedHelloGreeting(){

        def object = new HelloWorld('Jon')

        assert object != null
        assert object.greeting() == 'Hello Jon!!'

    }

}
