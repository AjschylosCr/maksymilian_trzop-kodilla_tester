package com.kodilla.abstracts.homework;

public class OfficeWorker extends Job {
    private String salary;
    private String responsibilities;

    public OfficeWorker(String salary, String responsibilities) {this.salary=salary; this.responsibilities=responsibilities;}
    @Override
    public String name() {
        return null;
    }
}