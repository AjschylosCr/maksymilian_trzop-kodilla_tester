package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.List;

public class TaskManager {
    public static void main(String[] args) {
        List<LocalDate> tasks = TaskRepository.getTasksLists(); //List<Task>
        .stream() //Stream<Task>
        .filter(u -> u.getDeadLine().equals("")) //Stream<Task>//'jest wcześniejsza'?
    }
}
