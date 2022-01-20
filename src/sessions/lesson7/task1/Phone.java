package sessions.lesson7.task1;

import java.io.Serializable;
import java.util.Objects;

public class Phone implements Serializable {
    private int number;
    private String model;
    private int weight;

    public Phone() {
    }

    public Phone(int number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, int number) {
        System.out.println("Звонит " + name + " c номера " + number);
    }
    public void sendMessage(int[] numbers) {
        for (int number: numbers) {
            System.out.println("Phone - " + number);
        }
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return number == phone.number && weight == phone.weight && Objects.equals(model, phone.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, model, weight);
    }
}
