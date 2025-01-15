package org.example.company;

public class Mitsubishi extends Car{
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    //methods
    public String startEngine() {
        String message = getClass().getSimpleName() + " the car's engine is starting";
        System.out.println(message);
        return message;
    }

    public String accelerate() {
        String message = getClass().getSimpleName() + " the car is accelerating";
        System.out.println(message);
        return message;
    }

    public String brake() {
        String message = getClass().getSimpleName() + " the car is braking";
        System.out.println(message);
        return message;
    }
}