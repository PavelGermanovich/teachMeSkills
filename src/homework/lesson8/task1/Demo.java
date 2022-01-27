package homework.lesson8.task1;

public class Demo {
    public static void main(String[] args) {
        Car car1 = new Car("Audi", 100, 23000);
        Car car2 = new Car();
        car2.setMark("Mercedes");
        Car car3 = new Car("BMW", 120, 24000);

        try {
            car1.start();
        } catch (CarStartingException e) {
            System.out.println(e);
        }
        try {
            car2.start();
        } catch (CarStartingException e) {
            System.out.println(e);
        }
        try {
            car3.start();
        } catch (CarStartingException e) {
            System.out.println(e);
        }
    }
}
