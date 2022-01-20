package sessions.lesson7.task2;

public class Person {
    private int age;
    private String fullName;

    public Person() {
    }

    public Person(int age, String fullname) {
        this.age = age;
        this.fullName = fullname;
    }

    public void talk() {
        System.out.println(fullName + " говорит");
    }

    public void move() {
        System.out.println(fullName + " говорит");
    }
}