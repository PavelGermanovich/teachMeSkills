package sessions.lesson8.task1;

public abstract class Laptop {
    protected String model;

    public void printGreetings() {
        System.out.println(String.format("Hello %s world", model));
    }
}
