package Vehicles;

import Components.Engine;
import Components.Gearbox;

public class Petrol extends Car {

    public Petrol(String make, String model, Engine engine, Gearbox gearbox, int price){
        super(make, model, engine, gearbox, price);
    }
}

