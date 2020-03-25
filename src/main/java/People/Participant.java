package People;

import Vehicles.Car;

import java.util.ArrayList;

public abstract class Participant {

    private String name;
//    public ArrayList<Car> cars;
    private int totalCash;

    public Participant(String name, int totalCash){
        this.name = name;
        this.totalCash = totalCash;
//        this.cars = new ArrayList<Car>();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public ArrayList<Car> getCars() {
//        return cars;
//    }

//    public void setCars(ArrayList<Car> cars) {
//        this.cars = cars;
//    }

    public int getTotalCash() {
        return totalCash;
    }

//    public void setTotalCash(int totalCash) {
//        this.totalCash = totalCash;
//    }
}
