package People;

import Vehicles.Car;

import java.util.ArrayList;

public class Customer extends Participant {

    private String name;
    private int totalCash;
    private ArrayList<Car> ownedCars;


    public Customer(String name, int totalCash){
        super(name, totalCash);
        this.name = name;
        this.totalCash = totalCash;
        this.ownedCars = new ArrayList<Car>();

    }

    // Getters
    public String getName() {
        return name;
    }


    public int getTotalCash() {
        return totalCash;
    }

    public ArrayList<Car> getOwnedCars(){
        return ownedCars;
    }

    public int getCarCount(){
        return this.ownedCars.size();
    }

    public int ownedCarsCount(){
        return this.ownedCars.size();
    }

    public void addOwnedCar(Car car){
        this.ownedCars.add(car);

    }

    // Setters

    public void setOwnedCars(ArrayList<Car> ownedCars){
        this.ownedCars = ownedCars;

    }
}
