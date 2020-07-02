package com.kodilla.abstracts.homework;

public class ApplicationJob {
    public static void main(String[] args) {

        Plumber plumber = new Plumber("low", "fixing plumbing");
        plumber.name();

        Painter painter = new Painter("quite high", "painting walls and stuff");
        painter.name();

        OfficeWorker officeWorker = new OfficeWorker("very high", "doing nothin' basically");
        officeWorker.name();
    }
}