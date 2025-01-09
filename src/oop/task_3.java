package oop;

public class task_3 {
    public class Car extends
            Vehicle {

        int wheelCount;
        double weight;
    }

    public class Vehicle {
        double maxSpeed;
    }

    public class ElectricCar
            extends Car {

        int electricEnginePower;
    }
}
