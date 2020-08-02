package arrays.homework;

import interfaces.homework.Car;
import interfaces.homework.Ford;
import interfaces.homework.Honda;
import interfaces.homework.Pontiac;

public class CarUtils {
    public static void describeCar(Car car) {
        System.out.println("-----------");
        System.out.println("Car model "+getCarName(car));
        System.out.println("Get speed "+car.getSpeed());
    }

    public static String getCarName(Car car) {
        if (car instanceof Ford)
            return "Ford";
        else if (car instanceof Pontiac)
            return "Pontiac";
        else if (car instanceof Honda)
            return "Honda";
        else
            return "Unknown Car";
    }
}