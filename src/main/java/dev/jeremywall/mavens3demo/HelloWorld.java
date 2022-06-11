package dev.jeremywall.mavens3demo;

public class HelloWorld {

    public static String sayHello(String name) {

        if (name == null) {
            return "Hello";
        }
        return "Hello " + name;
    }
}