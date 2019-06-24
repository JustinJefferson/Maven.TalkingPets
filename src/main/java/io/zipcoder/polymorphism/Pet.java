package io.zipcoder.polymorphism;

public abstract class Pet {

    protected String name;

    public Pet() {
        name = "no name set";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract String speak();

    abstract String getSpecies();
}
