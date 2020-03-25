package People;

import Components.Engine;
import Components.Gearbox;
import Vehicles.Car;
import Vehicles.Petrol;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    Petrol petrolCar;
    Engine engine;
    Gearbox gearbox;

    @Before
    public void before(){
        customer = new Customer("Peter", 80000);
        petrolCar = new Petrol("Ford", "mondeo", engine, gearbox, 30000);

    }

    // Customers Name
    @Test
    public void canGetName(){
        assertEquals("Peter", customer.getName());

    }

    // Customers Funds
    @Test
    public void canGetCustomerCash(){
        assertEquals(80000, customer.getTotalCash());
    }

    // Customer Garage starts empty.
    @Test
    public void customerGarageStartsEmpty(){
        assertEquals(0, customer.ownedCarsCount());
    }

    // Customer buys car adds 1 to the garage.
    @Test
    public void currentlyOwnedCar(){
        customer.addOwnedCar(petrolCar);
        assertEquals(1, customer.getCarCount());
    }
}
