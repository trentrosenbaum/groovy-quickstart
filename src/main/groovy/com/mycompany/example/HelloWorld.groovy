package com.mycompany.example

import org.slf4j.Logger
import org.slf4j.LoggerFactory

/**
 * Simple class to ensure quick start project is working.
 * @author Trent Rosenbaum
 */
public class HelloWorld {

    final Logger logger = LoggerFactory.getLogger(HelloWorld.class);

    String name

    public HelloWorld(){
        this('World')
    }

    public HelloWorld(String name){
        this.name = name

        logger.info("Created with name: $name")
    }

    public String greeting(){

        return "Hello $name!!"
    }

}