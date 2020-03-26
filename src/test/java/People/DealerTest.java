package People;

import Components.Engine;
import Components.Gearbox;
import Vehicles.Electric;
import Vehicles.Petrol;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealerTest {

    Dealer dealer;
    Petrol petrolCar;
    Electric electricCar;
    Engine engine;
    Gearbox gearbox;

    @Before
    public void before(){
        dealer = new Dealer("CodeCars", 200000);
        petrolCar = new Petrol("Toyota", "supra", engine, gearbox, 50000);
        electricCar = new Electric("Nissan", "leaf", engine, gearbox, 20000);
        petrolCar = new Petrol("BMW", "M3", engine, gearbox, 60000);

    }

    @Test
    public void canGetName(){
        assertEquals("CodeCars", dealer.getName());
    }

    @Test
    public void canGetDealerCash(){
        assertEquals(200000, dealer.getTotalCash());
    }

    @Test
    public void dealerGarageStartsEmpty(){
        assertEquals(0, dealer.stockCarsCount());
    }

    @Test
    public void currentlyStockedCars(){
        dealer.addStockCars(petrolCar);
        assertEquals(1, dealer.stockCarsCount());
    }


}
