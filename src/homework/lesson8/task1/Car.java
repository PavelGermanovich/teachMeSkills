package homework.lesson8.task1;

import java.util.Random;

public class Car {
    private String mark;
    private int speed;
    private int price;

    public Car(String mark, int speed, int price) {
        this.mark = mark;
        this.speed = speed;
        this.price = price;
    }

    public Car() {
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void start() throws CarStartingException {
        int generatedNumber = new Random().nextInt(21);
        if (generatedNumber % 2 == 0) {
            throw new CarStartingException("Generated not EVEN number!");
        } else {
            System.out.printf("Car with mark %s has started\n", mark);
        }
    }
}
