package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
Map<Principal, School> juxtaposition = new HashMap<>();

        Principal stevenson = new Principal("Stevenson", "Boston Public");
        Principal johnson = new Principal("Johnson", "St. John's");
        Principal villenueve = new Principal("Villenueve", "Royal");

        School stevensonSchool = new School();
        School johnsonSchool = new School();
        School villenueveSchool = new School();

        juxtaposition.put(stevenson, stevensonSchool);
        juxtaposition.put(johnson, johnsonSchool);
        juxtaposition.put(villenueve, villenueveSchool);
    }
}
