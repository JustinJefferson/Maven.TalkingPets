package io.zipcoder.polymorphism;

public class Dog extends Pet {

    public Dog() {
        super();
    }

    public Dog(String name) {
        this.name = name;
    }

    public String speak() {
        return "Woof";
    }

    public String getSpecies() {
        return "Dog";
    }
}
