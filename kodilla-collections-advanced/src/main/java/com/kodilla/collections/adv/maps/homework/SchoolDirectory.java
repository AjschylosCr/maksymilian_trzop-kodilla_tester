package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> juxtaposition = new HashMap<>();

        Principal stevenson = new Principal("Stevenson");
        Principal johnson = new Principal("Johnson");
        Principal villenueve = new Principal("Villenueve");

        School stevensonSchool = new School("Boston Public",12,33,45);
        School johnsonSchool = new School("St. John's",23,44,15);
        School villenueveSchool = new School("Royal",21,55,24);

        juxtaposition.put(stevenson, stevensonSchool);
        juxtaposition.put(johnson, johnsonSchool);
        juxtaposition.put(villenueve, villenueveSchool);

        for (Map.Entry<Principal, School> schoolEntry: juxtaposition.entrySet())
                System.out.println(schoolEntry.getKey().getPrincipalName() + " Is Principal of "
                        + schoolEntry.getValue().getSchoolName() + " number of students " +
                        schoolEntry.getValue().getSum());

    }
}
