package sessions.lesson7.task2;

public class Demo {
    public static void main(String[] args) {
        Person person = new Person();
        person.talk();
        person.move();
        Person person2 = new Person(12, "Pave");
        person2.move();
    }
}
