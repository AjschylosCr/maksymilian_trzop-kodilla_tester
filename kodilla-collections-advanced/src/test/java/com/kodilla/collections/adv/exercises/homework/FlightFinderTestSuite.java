package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlightFinderTestSuite {
    @Test
    public void testFindFlightsFrom() {
// given
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> result;
// when
        result = flightFinder.findFlightsFrom("London");
// then
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("London", "Warsaw"));
        expectedList.add(new Flight("London", "Tel Aviv"));
        expectedList.add(new Flight("London", "Madrid"));
        assertEquals(expectedList, result);
    }

    @Test
    public void testFindFlightsTo() {
// given
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> result;
// when
        result = flightFinder.findFlightsTo("Madrid");
// then
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Moscow", "Madrid"));
        expectedList.add(new Flight("Moscow", "Madrid"));
        expectedList.add(new Flight("Vladyvostok", "Madrid"));
        assertEquals(expectedList, result);
    }
}
