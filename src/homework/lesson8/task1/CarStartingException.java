package homework.lesson8.task1;

public class CarStartingException extends Exception {
    public CarStartingException(String message) {
        super("Car not started exception!\n" + message);
    }
}