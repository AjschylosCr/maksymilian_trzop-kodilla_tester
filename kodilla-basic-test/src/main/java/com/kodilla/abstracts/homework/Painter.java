package com.kodilla.abstracts.homework;

public class Painter extends Job {
    private String salary;
    private String responsibilities;

    public Painter(String salary, String responsibilities) {this.salary=salary; this.responsibilities=responsibilities;}
    @Override
    public String name() {
        return null;
    }
}