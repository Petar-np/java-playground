package com.company;

class Car {
    private String name;
    private int engine;
    private int wheels;
    private int doors;
    private int cylinders;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        engine = 1;
        wheels = 4;
        doors = 5;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void startEngine() {
        System.out.println("Starting car's engine");
    }

    public void accelerate() {
        System.out.println("Accelerating car");
    }

    public void breaking() {
        System.out.println("Car is breaking");
    }
}

class Jeep extends Car {
    public Jeep() {
        super("Jeep", 6);
    }

    @Override
    public void startEngine() {
        System.out.println("Starting Jeep's engine");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerating Jeep");
    }

    @Override
    public void breaking() {
        System.out.println("Jeep is breaking");
    }
}

class Skoda extends Car {
    public Skoda() {
        super("Skoda", 4);
    }

    @Override
    public void startEngine() {
        System.out.println("Starting Skoda's engine");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerating Skoda");
    }

    @Override
    public void breaking() {
        System.out.println("Skoda is breaking");
    }
}

class LandRover extends Car {
    public LandRover() {
        super("LandRover", 6);
    }

    @Override
    public void startEngine() {
        System.out.println("Starting LandRover's engine");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerating LandRover");
    }

    @Override
    public void breaking() {
        System.out.println("LandRover is breaking");
    }
}

public class Main {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            Car car = getRandomCar();
            System.out.println("Car #" + i + ":");
            System.out.println(car.getName());
            car.startEngine();
            car.accelerate();
            car.breaking();
            System.out.println();
        }
    }

    private static Car getRandomCar() {
        int randomNumber = (int) (Math.random() * 4 + 1);
        switch (randomNumber) {
            case 1:
                return new Car("Car", 4);
            case 2:
                return new Jeep();
            case 3:
                return new Skoda();
            case 4:
                return new LandRover();
        }

        return null;
    }
}
