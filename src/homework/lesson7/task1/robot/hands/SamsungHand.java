package homework.lesson7.task1.robot.hands;

public class SamsungHand implements IHand{
    private boolean handUp;
    private int price;

    public SamsungHand(int price) {
        this.price = price;
    }

    @Override
    public void upHand() {
        if (!handUp) {
            System.out.println("Samsung Hand is UP!");
        } else {
            System.out.println("Samsung Hand is already UP!");
        }
    }

    @Override
    public int getPrice() {
        return price;
    }
}
