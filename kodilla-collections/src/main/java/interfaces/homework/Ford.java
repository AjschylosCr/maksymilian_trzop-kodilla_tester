package interfaces.homework;

public class Ford implements Car {
    private int speed;

    public Ford (int speed){
        this.speed = speed;
    }
    @Override
    public int getSpeed() {return speed; }

    @Override
    public void increaseSpeed() {
        speed += 25; }

    @Override
    public void decreaseSpeed() {
        speed -= 25; }

    @Override
    public String toString() {
        return "Ford{" +
                "speed=" + speed +
                '}';
    }
}