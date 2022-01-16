package homework.lesson5.dz1;

public class Demo {
    public static void main(String[] args) {
        Ram ram = new Ram("16 gb - some ram name");
        CPU cpu = new CPU("AMD CPU name");
        HDD hdd = new HDD("HDD name");
        int limit = 20;
        Computer myPc = new Computer(ram, cpu, hdd, limit);
        myPc.showComputerInfo();

        myPc.turnOn();
        myPc.turnOn();

    }
}
