package Vehicles;

import Components.Engine;
import Components.Gearbox;

public class Electric extends Car {

    public Electric(String make, String model, Engine engine, Gearbox gearbox, int price){
        super(make, model, engine, gearbox, price);
    }
}

