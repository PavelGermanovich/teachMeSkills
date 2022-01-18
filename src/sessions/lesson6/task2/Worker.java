package sessions.lesson6.task2;

public class Worker extends Person {
    private int experienceYears;
    public Worker() {
    }
    public Worker(String name, int age, int experienceYears) {
        super(name, age);
        this.experienceYears = experienceYears;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }
}
