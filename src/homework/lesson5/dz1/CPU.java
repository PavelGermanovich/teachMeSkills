package homework.lesson5.dz1;

public class CPU {
    private String cpuName;

    public CPU(String cpuName) {
        this.cpuName = cpuName;
    }

    public void showCPUInfo() {
        System.out.println("CPU name is " + cpuName);
    }
}
