package lists.homework;

import interfaces.homework.Car;
import interfaces.homework.Ford;
import interfaces.homework.Honda;
import interfaces.homework.Pontiac;

import java.util.ArrayList;
import java.util.List;

import static arrays.homework.CarUtils.getCarName;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        cars.add(new Honda(110));
        cars.add(new Ford(120));
        cars.add(new Pontiac(130));

        cars.remove(1);
        Honda honda = new Honda(11);
        cars.add(honda);
        cars.remove(honda);

        for (Car car : cars){
            System.out.println("-----------");
            System.out.println("Car model "+getCarName(car));
            System.out.println("Get speed "+car.getSpeed());
        }
    }
}
