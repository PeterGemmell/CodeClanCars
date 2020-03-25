package Vehicles;

import Components.Engine;
import Components.Gearbox;

public abstract class Car {

    private String make;
    private String model;
    private Engine engine;
    private Gearbox gearbox;
    private int price;

    public Car(String make, String model, Engine engine, Gearbox gearbox, int price){

        this.make = make;
        this.model = model;
        this.engine = engine;
        this.gearbox = gearbox;
        this.price = price;
    }
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public Engine getEngine() {
        return engine;
    }
    public Gearbox getGearbox() {
        return gearbox;
    }

     public int getPrice(){
        return price;
     }

    // Petrol car GearBox Size
    public int getGearboxSize() {
        return gearbox.getSize();
    }

    // Petrol car Engine Size
    public int getEngineSize(){
        return engine.getSize();
    }

    // Electric car Engine Voltage
    public int getEngineVoltage(){
        return engine.getVoltageSize();
    }

    // Electric car price
    public int getElectricCarPrice(){
        return price;
    }
}

