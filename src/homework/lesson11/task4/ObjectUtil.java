package homework.lesson11.task4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectUtil {
    public static void serializeCar(Car car) {
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("src/homework/lesson11/task4/person.dat"))) {
            objectOutputStream.writeObject(car);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static Car deserializeCar() {
        Car car = new Car();
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("src/homework/lesson11/task4/person.dat"))) {
            car = (Car) objectInputStream.readObject();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return car;
    }
}
