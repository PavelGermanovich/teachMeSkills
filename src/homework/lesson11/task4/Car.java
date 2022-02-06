package homework.lesson11.task4;

import java.io.Serializable;

public class Car implements Serializable {
    private String mark;
    private int speed;
    private int cost;
    private transient int length;

    public Car(String mark, int speed, int cost) {
        this.mark = mark;
        this.speed = speed;
        this.cost = cost;
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

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getLength() {
        return length;
    }

    public Car() {
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", speed=" + speed +
                ", cost=" + cost +
                ", length=" + length +
                '}';
    }
}
