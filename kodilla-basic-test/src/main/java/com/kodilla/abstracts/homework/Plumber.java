package com.kodilla.abstracts.homework;

public class Plumber extends Job {
    private String salary;
    private String responsibilities;

    public Plumber(String salary, String responsibilities) {this.salary=salary; this.responsibilities=responsibilities;}
    @Override
    public String name() {
        return null;
    }
}