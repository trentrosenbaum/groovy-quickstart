package com.mycompany.example

import spock.lang.Specification

/**
 * Created with IntelliJ IDEA.
 * User: tjr
 * Date: 10/12/13
 * Time: 08:32
 * To change this template use File | Settings | File Templates.
 */
class HelloWorldTests extends Specification {


    def "Say Hello to the world."(){

        when:
            def object = new HelloWorld()
        then:
            object.greet() == 'Hello World!!'

    }

    def "Say hello to the crew of the Enterpise."() {

        when:
            def object = new HelloWorld(name)
        then:
            object.greet() == message
        where:
            name     | message
            'Kirk'   | 'Hello Kirk!!'
            'Spock'  | 'Hello Spock!!'
            'Bones'  | 'Hello Bones!!'
            'Scotty' | 'Hello Scotty!!'

    }

}
