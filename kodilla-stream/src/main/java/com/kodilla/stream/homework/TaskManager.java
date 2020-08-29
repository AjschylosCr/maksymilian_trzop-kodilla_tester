package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        List<LocalDate> tasks = TaskRepository.getTasksLists() //List<Task>
        .stream() //Stream<Task>
        .filter(u -> u.getDeadLine().isBefore(currentDate))//Stream<Task>//'jest wcześniejsza'?
        .map(Task::getDeadLine)
                .collect(Collectors.toList());
        System.out.println(tasks.size());
    }
}
