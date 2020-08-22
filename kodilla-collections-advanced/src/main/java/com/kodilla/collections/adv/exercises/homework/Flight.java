package com.kodilla.collections.adv.exercises.homework;

public class Flight extends FlightRepository {
    String departure;
    String arrival;

    public Flight(String departure,String arrival){
        this.departure = departure;
        this.arrival = arrival;
    }
}
