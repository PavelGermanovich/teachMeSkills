package homework.lesson12.transport;

public class AirTransport extends Vehicle {
    protected int wingspan;
    protected int minRunwayStripLength;

    public AirTransport(int power, int maxSpeed, int weight, String mark, int wingspan, int minRunwayStripLength) {
        super(power, maxSpeed, weight, mark);
        this.wingspan = wingspan;
        this.minRunwayStripLength = minRunwayStripLength;
    }

    @Override
    public String toString() {
        return super.toString() + "Размах крыльев=" + wingspan +
                ", Минимальная длина взлетно-посадочной полосы=" + minRunwayStripLength + " ";
    }
}
