package homework.lesson12.transport;

public class Car extends GroundTransport {
    private String carcase;
    private int numberOfPassengers;

    public Car(int power, int maxSpeed, int weight, String mark, int numberOfWheels,
               int fuelConsumption, String carcase, int numberOfPassengers) {
        super(power, maxSpeed, weight, mark, numberOfWheels, fuelConsumption);
        this.carcase = carcase;
        this.numberOfPassengers = numberOfPassengers;
    }

    @Override
    public String toString() {
        return "Это машина со следующими хар-ми: " + super.toString() +
                ", Кузов '" + carcase +
                ", Количество пассажиров = " + numberOfPassengers;
    }

    public void calculateDistanceForTime(double hours) {
        double distance = hours * maxSpeed;
        System.out.println(String.format("За время %.1f ч," +
                " автомобиль %s двигаясь с максимальной скоростью %d км/ч проедет %.1f км и израсходует %.1f литров топлива",
                hours, mark, maxSpeed, distance, getFuelConsumption(distance)));
    }

    private double getFuelConsumption(double distance) {
            return (distance / 100) * fuelConsumption;
    }
}
