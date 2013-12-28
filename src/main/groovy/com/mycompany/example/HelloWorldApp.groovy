package com.mycompany.example


public class HelloWorldApp {


    public static void main(String[] args){

        def helloWorldGreeter = new HelloWorld()
        println helloWorldGreeter.greeting()

        def helloWorldGreeter2 = new HelloWorld('Groovy')
        println helloWorldGreeter2.greeting()

    }

}