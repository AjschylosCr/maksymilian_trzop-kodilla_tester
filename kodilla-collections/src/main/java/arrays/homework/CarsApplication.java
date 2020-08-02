package arrays.homework;

import interfaces.homework.Car;
import interfaces.homework.Ford;
import interfaces.homework.Honda;
import interfaces.homework.Pontiac;

import java.util.Random;

public class CarsApplication {

     static Random random = new Random();

    public static void main(String[] args) {
        Car[] cars = new Car[random.nextInt(15)+1];
        for (int n = 0; n < cars.length; n++)
            cars[n] = drawCar();
        for (Car car : cars)
            CarUtils.describeCar(car);
    }

    public static Car drawCar(){
        int a = random.nextInt(3);

        if (a==0)
            return new Ford(random.nextInt(120));
        if (a==1)
            return new Pontiac(random.nextInt(140));
        else
            return new Honda(random.nextInt(220));

    }
}
