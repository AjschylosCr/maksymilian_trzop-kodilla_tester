package com.kodilla.stream.com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) throws OrderDoesntExistException {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("1"));
        warehouse.addOrder(new Order("2"));
        warehouse.addOrder(new Order("3"));
        warehouse.addOrder(new Order("4"));
        warehouse.addOrder(new Order("5"));

        try {
            System.out.println(warehouse.getOrder("6"));
        } catch(OrderDoesntExistException e){
            System.out.println("Order does not excist");
        }
    }
}
