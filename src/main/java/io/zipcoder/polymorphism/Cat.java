package io.zipcoder.polymorphism;

public class Cat extends Pet {

    public Cat() {
        super();
    }

    public Cat(String name) {
        this.name = name;
    }

    public String speak() {
        return "Miau";
    }

}
