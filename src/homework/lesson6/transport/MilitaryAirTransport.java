package homework.lesson6.transport;

public class MilitaryAirTransport extends AirTransport {
    private boolean ejectionSystemAvailability;
    private int numberOfRockets;

    public MilitaryAirTransport(int power, int maxSpeed, int weight, String mark, int wingspan,
                                int minRunwayStripLength, boolean ejectionSystemAvailability, int numberOfRockets) {
        super(power, maxSpeed, weight, mark, wingspan, minRunwayStripLength);
        this.ejectionSystemAvailability = ejectionSystemAvailability;
        this.numberOfRockets = numberOfRockets;
    }

    @Override
    public String toString() {
        return "Это военный самолет со следующими хар-ми: " + super.toString() +
                ", Наличие системы катапультирования = " + ejectionSystemAvailability +
                ", Количество ракет = " + numberOfRockets;
    }

    public void shoot() {
        if (numberOfRockets > 0) {
            System.out.println("Ракета пошла!");
            numberOfRockets--;
        } else {
            System.out.println("Боеприпасы отсутствуют");
        }
    }

    public void ejectFromPlane() {
        if (ejectionSystemAvailability) {
            System.out.println("Катапультирование прошло успешно");
        } else {
            System.out.println("У вас нет такой системы");
        }
    }
}
