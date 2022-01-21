package homework.lesson7.task2.Clothes;

public class Person {
    private String name;
    private Shoes shoes;
    private Pants pants;
    private Jacket jacket;

    public Person(String name, Shoes shoes, Pants pants, Jacket jacket) {
        this.name = name;
        this.shoes = shoes;
        this.pants = pants;
        this.jacket = jacket;
    }

    public void putOn() {
        shoes.putOn();
        pants.putOn();
        jacket.putOn();
    }

    public void putOff() {
        shoes.putOff();
        pants.putOff();
        jacket.putOff();
    }
}
