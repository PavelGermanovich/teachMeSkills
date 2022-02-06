package homework.lesson11.task4;

public class Demo {
    /**
     * 4) Сеарилизовать объект Автомобиль(Марка, скорость, цена). После
     * сериализации произвести обратный процесс
     */
    public static void main(String[] args) {
        Car car = new Car("Audi", 140, 10000);
        ObjectUtil.serializeCar(car);
        Car car2 = ObjectUtil.deserializeCar();
        System.out.println(car2);
    }
}
