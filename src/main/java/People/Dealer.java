package People;

import Vehicles.Car;
import Vehicles.Electric;

import java.util.ArrayList;

public class Dealer extends Participant {

    private String name;
    private int totalCash;
    private ArrayList<Car> stockCars;


    public Dealer(String name, int totalCash){
        super(name, totalCash);
        this.name = name;
        this.totalCash = totalCash;
        this.stockCars = new ArrayList<Car>();

    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getTotalCash() {
        return totalCash;
    }

    public ArrayList<Car> getStockCars() {
        return stockCars;
    }

    public int stockCarsCount(){
        return this.stockCars.size();
    }

    public void addStockCars(Car car){
        this.stockCars.add(car);

    }
}
