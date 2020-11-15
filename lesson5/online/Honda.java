package lesson5.online;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date of creation: 02.11.2020
 */

public class Honda extends Car {

    protected int height;

    public Honda(String name, int speed, String color) {
        super(name, speed, color);
        height = 0;
    }

    public Honda(String name, int speed, String color, int height) {
        super(name, speed, color);
        this.height = height;
    }

    protected void move() {
        System.out.println(name + " has moved "+ speed);
    }

    @Override
    void beep() {
        System.out.println(name + " has beep-beep-beep!");
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
