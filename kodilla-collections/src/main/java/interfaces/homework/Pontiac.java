package interfaces.homework;

public class Pontiac implements Car {
    private int speed;

    public Pontiac (int speed){
        this.speed = speed;
    }
    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 45; }

    @Override
    public void decreaseSpeed() {
        speed -= 44; }

    @Override
    public String toString() {
        return "Pontiac{" +
                "speed=" + speed +
                '}';
    }
}