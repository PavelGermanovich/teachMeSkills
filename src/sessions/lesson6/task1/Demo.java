package sessions.lesson6.task1;

import java.util.Random;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Car carOne = new Car(Colors.RED, 140, 1500, CarType.AUDI);
        Car carTwo = new Car(Colors.BLUE, 160, 1800, CarType.BMW);
        Car carThree = new Car(Colors.WHITE, 180, 1800, CarType.FERRARI);
        Car carFour = new Car(Colors.BLACK, 200, 2000, CarType.MERSEDEs);
        int i = new Scanner(System.in).nextInt();
        carOne.changeColor(Colors.BLACK);
        carOne.checkSpeed(i);
        System.out.println(carOne);

        Car[] cars = new Car[4];
        for (int carId = 0; carId < cars.length; carId++) {
            Colors randomColor = Colors.values()[new Random().nextInt(Colors.values().length)];
            CarType randomCarType = CarType.values()[new Random().nextInt(CarType.values().length)];
            cars[carId] = new Car(randomColor,
                    new Random().nextInt(200) + 100,
                    new Random().nextInt(1000) + 1000, randomCarType);
        }

        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
