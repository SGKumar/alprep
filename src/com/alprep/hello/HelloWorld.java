package com.alprep.hello;

public class HelloWorld {
  public String getGreeting() {
    return new Greeter().sayHello();
  }
  public static void main(String[] args) {
    Greeter greeter = new Greeter();
    System.out.println(greeter.sayHello());
  }
}