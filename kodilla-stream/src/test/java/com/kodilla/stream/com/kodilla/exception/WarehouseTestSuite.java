package com.kodilla.stream.com.kodilla.exception;

import com.kodilla.stream.com.kodilla.exception.homework.Order;
import com.kodilla.stream.com.kodilla.exception.homework.OrderDoesntExistException;
import com.kodilla.stream.com.kodilla.exception.homework.Warehouse;
import org.junit.Test;

import java.util.NoSuchElementException;

public class WarehouseTestSuite {
    @Test(expected = NoSuchElementException.class)
    public void testOrder() throws OrderDoesntExistException {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("1"));
        warehouse.addOrder(new Order("2"));
        warehouse.addOrder(new Order("3"));
        warehouse.addOrder(new Order("4"));
        warehouse.addOrder(new Order("5"));

        System.out.println("Dupogłowy");
        warehouse.getOrder("7");
    }

    @Test(expected = OrderDoesntExistException.class)
    public void testOrderPositive() throws OrderDoesntExistException {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("1"));
        warehouse.addOrder(new Order("2"));
        warehouse.addOrder(new Order("3"));
        warehouse.addOrder(new Order("4"));
        warehouse.addOrder(new Order("5"));

        System.out.println("Dupogłowy");
        warehouse.getOrder("7");
    }
}
