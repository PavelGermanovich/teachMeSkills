package homework.lesson7.task1.robot.legs;

public class ToshibaLeg implements ILeg{
    private final int price = 222;

    @Override
    public void step() {
        System.out.println("Toshiba leg step!");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
