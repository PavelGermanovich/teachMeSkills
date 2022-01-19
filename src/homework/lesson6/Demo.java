package homework.lesson6;

import homework.lesson6.transport.Car;
import homework.lesson6.transport.CivilAirTransport;
import homework.lesson6.transport.MilitaryAirTransport;
import homework.lesson6.transport.Track;

public class Demo {
    public static void main(String[] args) {
        Track track = new Track(11, 22, 33, "Audi", 10, 10,
                10000);
        System.out.println(track);

        Car car = new Car(200, 200, 1000, "BMW", 4, 40,
                "Лифтбек", 10);
        System.out.println(car);
        car.calculateDistanceForTime(10);
        track.checkLoadCapacity(10001);

        CivilAirTransport civilAirTransport = new CivilAirTransport(200, 30, 10000,
                "Boing", 100, 1000, 333, true);
        System.out.println(civilAirTransport);
        civilAirTransport.checkPassengersCapacity(334);

        MilitaryAirTransport militaryAirTransport = new MilitaryAirTransport(300, 400, 1000,
                "Boing", 300, 1000, true, 1);
        System.out.println(militaryAirTransport);
        militaryAirTransport.shoot();
        militaryAirTransport.shoot();
        militaryAirTransport.ejectFromPlane();
    }
}
