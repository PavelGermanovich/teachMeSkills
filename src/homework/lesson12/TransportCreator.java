package homework.lesson12;

import homework.lesson6.transport.Car;
import homework.lesson6.transport.CivilAirTransport;
import homework.lesson6.transport.MilitaryAirTransport;
import homework.lesson6.transport.Track;

public class TransportCreator {
    private final Track track = new Track(11, 22, 33, "Audi", 10, 10,
            10000);

    private final Car car = new Car(200, 200, 1000, "BMW", 4, 40,
            "Лифтбек", 10);

    private final CivilAirTransport civilAirTransport = new CivilAirTransport(200, 30, 10000,
            "Boing", 100, 1000, 333, true);

    private final MilitaryAirTransport militaryAirTransport = new MilitaryAirTransport(300, 400, 1000,
            "Boing", 300, 1000, true, 1);

    public Track getTrack() {
        return track;
    }

    public Car getCar() {
        return car;
    }

    public CivilAirTransport getCivilAirTransport() {
        return civilAirTransport;
    }

    public MilitaryAirTransport getMilitaryAirTransport() {
        return militaryAirTransport;
    }
}
