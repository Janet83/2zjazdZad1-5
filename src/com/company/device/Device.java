package com.company.device;

public class Device {
    public String model;
    public String producer;
    public Integer yearOfProduction;

    public Device(String model, String producer, Integer yearOfProduction) {
        this.model = model;
        this.producer = producer;
        this.yearOfProduction = yearOfProduction;
    }

    public String toString() {
        return this.model + " " + this.producer + " " + this.yearOfProduction;
    }
}