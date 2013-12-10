package com.mycompany.example

public class HelloWorld {

    String message

    public HelloWorld(){
        message = 'Hello World!!'
    }

    public HelloWorld(String name){

        message = "Hello $name!!"
    }

    public String greet(){
        return message
    }

}