package homework.lesson8.task1;

public class CarStartingException extends Exception {
    private String carException = "Car not started exception!";

    public CarStartingException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return carException + "\n" + super.getMessage();
    }
}
