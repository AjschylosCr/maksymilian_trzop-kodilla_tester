package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Ivan", new Teacher("Sknerus")));
        studentList.add(new Student("Fedor", null));
        studentList.add(new Student("Izydor", new Teacher("Wolland")));
        for (Student student: studentList){
            System.out.println("Student "+student.name+" teacher "+student.getTeacher().getName());
        }
    }
}