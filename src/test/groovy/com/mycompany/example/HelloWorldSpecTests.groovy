package com.mycompany.example

import spock.lang.Specification

/**
 * Simple Spock specification to ensure quick start project is working.
 * @author Trent Rosenbaum
 */
class HelloWorldSpecTests extends Specification {


    def "Say hello to the world."(){

        when:
            def object = new HelloWorld()
        then:
            object.greeting() == 'Hello World!!'

    }

    def "Say hello to the crew of the USS Enterprise."() {

        when:
            def object = new HelloWorld(name)
        then:
            object.greeting() == message
        where:
            name     | message
            'Kirk'   | 'Hello Kirk!!'
            'Spock'  | 'Hello Spock!!'
            'Bones'  | 'Hello Bones!!'
            'Scotty' | 'Hello Scotty!!'

    }

}
