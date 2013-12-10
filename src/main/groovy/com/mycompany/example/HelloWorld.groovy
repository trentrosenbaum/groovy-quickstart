package com.mycompany.example

/**
 * Simple class to ensure quick start project is working.
 * @author Trent Rosenbaum
 */
public class HelloWorld {

    String name

    public HelloWorld(){
        name = 'World'
    }

    public HelloWorld(String name){
        this.name = name
    }

    public String greeting(){
        return "Hello $name!!"
    }

}