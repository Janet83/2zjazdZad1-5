package com.company;

public class Human {
    String firstName;
    String lastName;
    Integer age;
    Boolean isAlive;
    private Double salary;

    Phone mobile;
    Animal pet;
    private Car car;

    public Double getSalary() {
        System.out.println("Dane o wypłacie były pobrane " + java.time.LocalDateTime.now());
        return this.salary;
    }

    public void setSalary(Double salary) {
        if (salary < 0) {
            System.out.println("chyba cie powaliło, nie ma niewolnictwa");
        } else {
            System.out.println("nowa wypłata wysłana do systemu księgowego");
            System.out.println("odbierz aneks od Pani Hani");
            System.out.println("nie ukrywaj dochodów, ZUS i US i tak cie znajda");
            this.salary = salary;
        }
    }

    public Car getCar() {
        return this.car;
    }

    public void setCar(Car car) {
        if (this.salary > car.value) {
            System.out.println("kupiłeś za gotówkę auto: " + car.model);
            this.car = car;
        } else if (this.salary > car.value / 12.0) {
            System.out.println("kupiłeś na kredyt auto: " + car.model);
            this.car = car;
        } else {
            System.out.println("zapisz się na studia i znajdź nową robotę albo idż po podwyżkę");
        }
    }
}
