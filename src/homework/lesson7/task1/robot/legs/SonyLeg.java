package homework.lesson7.task1.robot.legs;

public class SonyLeg implements ILeg{
    private final int price = 300;

    @Override
    public void step() {
        System.out.println("Sony leg step!");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
