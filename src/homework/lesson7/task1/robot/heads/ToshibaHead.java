package homework.lesson7.task1.robot.heads;

public class ToshibaHead implements IHead{
    private int price;

    public ToshibaHead(int price) {
        this.price = price;
    }

    @Override
    public void speek() {
        System.out.println("Toshiba speaking");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
