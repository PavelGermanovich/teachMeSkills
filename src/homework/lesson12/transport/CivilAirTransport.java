package homework.lesson12.transport;

public class CivilAirTransport extends AirTransport {
    private int numberOfPassengers;
    private boolean businessClassAvailability;

    public CivilAirTransport(int power, int maxSpeed, int weight, String mark, int wingspan, int minRunwayStripLength,
                             int numberOfPassengers, boolean businessClassAvailability) {
        super(power, maxSpeed, weight, mark, wingspan, minRunwayStripLength);
        this.numberOfPassengers = numberOfPassengers;
        this.businessClassAvailability = businessClassAvailability;
    }

    @Override
    public String toString() {
        return "Это гражданский самолет со следующими хар-ми: " + super.toString() +
                ", Количество пассажиров = " + numberOfPassengers +
                ", Наличие бизнес-класса = " + businessClassAvailability;
    }

    public void checkPassengersCapacity(int numberOfPassengers) {
        System.out.println(numberOfPassengers > this.numberOfPassengers ?
                "Нужен самолет побольше" : "Все пассажиры влезли в самолет");
    }
}
