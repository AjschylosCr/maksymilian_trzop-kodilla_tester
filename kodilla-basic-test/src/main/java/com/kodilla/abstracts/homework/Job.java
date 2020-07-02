package com.kodilla.abstracts.homework;

public abstract class Job {
    private String salary;
    private String responsibilities;

    public String getSalary() {
        return salary;
    }

    public String getResponsibilities() {
        return responsibilities;
    }
    public abstract String name ();
}