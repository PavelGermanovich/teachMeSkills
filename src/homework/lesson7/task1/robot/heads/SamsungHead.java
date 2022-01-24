package homework.lesson7.task1.robot.heads;

public class SamsungHead implements IHead{
    int price;

    public SamsungHead(int price) {
        this.price = price;
    }

    @Override
    public void speek() {
        System.out.println("Samsung head");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
