package homework.lesson12.transport;

public abstract class Vehicle {
    protected int power;
    protected int maxSpeed;
    protected int weight;
    protected String mark;
    private final double LS_TO_KW_RATIO = 0.74;

    public Vehicle(int power, int maxSpeed, int weight, String mark) {
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Лошадиных сил = " + power +
                ", Максимальная скорость = " + maxSpeed +
                ", Вес = " + weight +
                ", Марка = '" + mark +
                ", Мощность в килловат = " +  getPowerInKilowatts() + " ";
    }

    protected double getPowerInKilowatts() {
        return (double) power * LS_TO_KW_RATIO;
    }
}
