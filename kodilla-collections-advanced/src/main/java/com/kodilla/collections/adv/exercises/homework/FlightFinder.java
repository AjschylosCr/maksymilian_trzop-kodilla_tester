package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightFinder {
    public List<Flight> findFlightsFrom(String departure){
        List<Flight> tempList = new ArrayList<>();
        for (Flight flight: FlightRepository.getFlightsTable()){
            if (flight.departure == departure){
                tempList.add(flight);
            }
        }
        return tempList;
    }

    public List<Flight> findFlightsTo(String arrival){
        List<Flight> tempList = new ArrayList<>();
        for (Flight flight: FlightRepository.getFlightsTable()){
            if (flight.arrival == arrival){
                tempList.add(flight);
            }
        }
        return tempList;
    }
}
