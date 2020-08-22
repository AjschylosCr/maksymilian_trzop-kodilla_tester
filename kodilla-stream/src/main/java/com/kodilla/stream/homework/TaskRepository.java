package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTasksLists(){
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("get cat food", LocalDate.of(2020,9,1), LocalDate.of(2020,9,2)));
        tasks.add(new Task("call Annie", LocalDate.of(2020,8,24), LocalDate.of(2020,8,27)));
        tasks.add(new Task("go to the doctor", LocalDate.of(2020,9,12), LocalDate.of(2020,9,12)));
        return tasks;
    }
}
