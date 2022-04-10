package com.company;

public class Animal {
    final String species;
    private Double weight = 10.0;
    Integer age;
    String name;
    Boolean isAlive;

    public Animal(String species) {
        this.isAlive = true;
        this.age = 1;
        this.species = species;

        switch (this.species) {
            case "felis":this.weight = 2.0; break;
            case "canis":this.weight = 10.0; break;
            default: this.weight = 5.0; break;
        }
    }

    void feed() {

        if (weight <= 0.0) {
            System.out.println("Animal died");
        } else {

            weight += 1;
            System.out.println("thx for food");
        }
    }

    void takeForAWalk() {

        if (weight <= 0.0) {
            System.out.println("Animal died");
        } else {
            weight -= 1.0;
            System.out.println("nice walk, thx");
        }
    }

}