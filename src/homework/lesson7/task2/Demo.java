package homework.lesson7.task2;

import homework.lesson7.task2.Clothes.*;

public class Demo {
    public static void main(String[] args) {
        Person person = new Person("Alex", new RedShoes(), new OrangePants(), new BlueJacket());
        person.putOff();
        person.putOn();
        System.out.println();
        Person personTwo = new Person("Alex", new BlackShoes(), new WhitePants(), new BlackJacket());
        person.putOff();
        person.putOn();
    }
}
