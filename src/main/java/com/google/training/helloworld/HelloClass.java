package com.google.training.helloworld;

public class HelloClass {
    public String message = "Hello World";
    public String period;

    public HelloClass () {
    }

    public HelloClass (String name) {
        this.message = "Hello " + name + "!";
    }
    
    public HelloClass(String name, String period) {
    	 this.message = "Hello " + name + "!";
         this.period = period;
	}

	public String getMessage() {
        return message;
    }
}
