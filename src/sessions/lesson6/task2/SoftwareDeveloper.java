package sessions.lesson6.task2;

public class SoftwareDeveloper extends Worker {
    private String developmentType;
    public SoftwareDeveloper() {
    }
    public SoftwareDeveloper(String name, int age, int experienceYears,
                             String developmentType) {
        super(name, age, experienceYears);
        this.developmentType = developmentType;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSoftwareDeveloper{" +
                "developmentType='" + developmentType + '\'' +
                '}';
    }
}
