package sessions.lesson6.task1;

public class Car {
    private Colors color;
    private int speedLimit;
    private int weight;
    private CarType brand;

    public Car(Colors color, int speed, int weight, CarType brand) {
        this.color = color;
        this.speedLimit = speed;
        this.weight = weight;
        this.brand = brand;
    }

    public Colors getColor() {
        return color;
    }

    public int getSpeedLimit() {
        return speedLimit;
    }

    public int getWeight() {
        return weight;
    }

    public CarType getBrand() {
        return brand;
    }

    public void changeColor(Colors color) {
        this.color = color;
    }

    public void checkSpeed(int speed) {
        if (speed <= 0) {
            System.out.println("Некорректное значение скорости!");
            return;
        }
        if (this.speedLimit < speed) {
            System.out.println("Вы не можете выжать скорость больше лимита!");
        } else {
            System.out.println("Вы можете выжать скорость авто " + speed);
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", speedLimit=" + speedLimit +
                ", weight=" + weight +
                ", brand='" + brand + '\'' +
                '}';
    }
}