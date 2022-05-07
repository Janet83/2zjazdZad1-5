package com.company.device;

import com.company.device.Device;
import org.w3c.dom.ls.LSOutput;

public class Car extends Device {
    Double millage;
    String color;
    Double engineVolume;
    public Double value;

    public Car(String aaa, String sss, int i) {
        super(aaa, sss, i);
    }

    public Car(String model, String producer, Integer yearOfProduction) {
        super(model, producer, yearOfProduction);
    }

    public Car(String ceed, String kia) {
        super("ceed", "kia", 2020);
    }

}
