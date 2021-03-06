package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Integer> schools = new ArrayList<>();
    private String schoolName;

    public School(String schoolName, Integer... schools) {
        this.schoolName = schoolName;
        for (Integer school : schools)
            this.schools.add(school);
    }

    public int getSum(){
        int sum = 0;
        for (int number: schools)
            sum += number;
        return sum;
    }

    public String getSchoolName(){
        return schoolName;
    }
}
