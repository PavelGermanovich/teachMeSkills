package homework.lesson6.transport;

public class GroundTransport extends Vehicle {
    protected int numberOfWheels;
    protected int fuelConsumption;

    public GroundTransport(int power, int maxSpeed, int weight, String mark, int numberOfWheels, int fuelConsumption) {
        super(power, maxSpeed, weight, mark);
        this.numberOfWheels = numberOfWheels;
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public String toString() {
        return super.toString() + ", Число колес = " + numberOfWheels
                + ", Потребление топлива =" + fuelConsumption + " ";
    }
}
