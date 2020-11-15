package lesson5.online;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date of creation: 29.10.2020
 */

public class Toyota extends Car {

    public Toyota(String name, int speed, String color) {
        super(name, speed, color);
    }

    protected void move() {
        System.out.println(name + " has moved " + speed);
    }

    void beep() {
        System.out.println(name + " has beep!");
    }

    public int getSpeed() {
        return speed;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }
}
