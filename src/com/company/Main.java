package com.company;

import com.company.device.Car;
import com.company.device.Device;
import com.company.device.Phone;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("canis");
        dog.isAlive = true;
        dog.name = "Szarik";

        System.out.println(dog.name);
        //System.out.println("species: " + dog.species + " name: " + dog.name + " waga:" + dog.weight);

        Animal cat = new Animal("felis");
        cat.isAlive = true;
        cat.name = "Sierściuch";

        System.out.println("ten kot to " + cat.name);
        System.out.println(cat.weight);

        //nowa klasa Phone
        //String producer
        //String model
        //Double screenSize
        //String os
        //utwórz dwa nowe obiekty w main i wypełnij danymi

        Phone a = new Phone("xiaomi", "ASx90", 2019);
        a.producer = "xiaomi";
        a.model = "ASx90";
        a.screenSize = 7.5;
        a.os = "android";

        System.out.println("producer: " + a.producer + " model: " + a.model + " screenSize: " + a.screenSize + " os: " + a.os);

        Phone b = new Phone("samsung", "xyc29", 2020);
        b.producer = "samsung";
        b.model = "xyc29";
        b.screenSize = 8.5;
        b.os = "android";

        System.out.println("producer: " + b.producer + " model: " + b.model + " screenSize: " + b.screenSize + " os: " + b.os);

        dog.feed();
        dog.feed();
        dog.feed();
        dog.feed();
        dog.feed();

        //System.out.println(dog.weight);

        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();

        System.out.println(dog.weight);

       Human kacper = new Human();
       kacper.firstName = "Kacper";
       kacper.lastName = "Warda";
       kacper.pet = dog;
       kacper.mobile = new Phone("kkk", "ddd", 2021);

       kacper.mobile.model = "6s";
       kacper.mobile.producer = "apple";
       kacper.pet.feed();

        System.out.println(kacper.pet.name);

        //car

        Car c1 = new Car("ceed", "kia");
        c1.value = 100000.0;

        kacper.setSalary(1000.0);
        System.out.println(kacper.getSalary());

        System.out.println(kacper.getCar());

        Device fridge = new Device("aaa", "sss", 2020);

        System.out.println(fridge);

    }



}
