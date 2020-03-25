package Vehicles;

import Components.Engine;
import Components.Gearbox;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Petrol petrolCar;
    Engine engine;
    Gearbox gearbox;
    Electric electricCar;

    @Before
    public void before(){
        engine = new Engine(2, 375);
        gearbox = new Gearbox(5);
        petrolCar = new Petrol("Ford", "Mondeo", engine, gearbox, 30000);
        electricCar = new Electric("Tesla", "Roadster", engine, gearbox, 60000);

    }


    // Petrol Car has number of gears.
    @Test
    public void canCountGears(){
        assertEquals(5, petrolCar.getGearboxSize());
    }

    // Petrol Car has engine size.
    @Test
    public void hasEngineSize(){
        assertEquals(2, petrolCar.getEngineSize());
    }

    // Electric Car has voltage.
    @Test
    public void hasEngineVoltage(){
        assertEquals(375, electricCar.getEngineVoltage());
    }

    // Electric Car has price.
    @Test
    public void electricCarHasPrice(){
        assertEquals(60000, electricCar.getElectricCarPrice());
    }


}
