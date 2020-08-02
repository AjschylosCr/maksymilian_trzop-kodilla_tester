package interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Ford ford = new Ford (130);
        System.out.println(ford.getSpeed());
        ford.increaseSpeed();
        ford.decreaseSpeed();

        Honda honda = new Honda (110);
        System.out.println(honda.getSpeed());
        honda.increaseSpeed();
        honda.decreaseSpeed();

        Pontiac pontiac = new Pontiac (120);
        System.out.println(pontiac.getSpeed());
        pontiac.increaseSpeed();
        pontiac.decreaseSpeed();

        doRace(pontiac);
        doRace(honda);
        doRace(ford);
    }
    public static void doRace(Car car ) {
        System.out.println(car.getSpeed());
        car.increaseSpeed();
        System.out.println("Prędkość po przyśpieszeniu" + car.getSpeed());
        car.decreaseSpeed();
        System.out.println("Prędkość po hamowaniu" +car.getSpeed());
    }
}