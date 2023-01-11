package main;

import static org.junit.Assert.*;

import org.junit.Test;

import model.Customers;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void createCustomers()
    {
        Customers customer1 = new Customers("Sabi");
        assertTrue(customer1.getName().equals("Sabi"));
        assertFalse(customer1.getName().equals("jsp"));
    }
}
