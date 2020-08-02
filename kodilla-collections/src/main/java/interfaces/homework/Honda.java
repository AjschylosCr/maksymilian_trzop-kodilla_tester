package interfaces.homework;

public class Honda implements Car {
    private int speed;

    public Honda (int speed){
        this.speed = speed;
    }
    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 35; }

    @Override
    public void decreaseSpeed() {
        speed -= 30; }

    @Override
    public String toString() {
        return "Honda{" +
                "speed=" + speed +
                '}';
    }
}