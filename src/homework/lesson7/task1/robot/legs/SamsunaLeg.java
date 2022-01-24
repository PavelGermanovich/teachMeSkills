package homework.lesson7.task1.robot.legs;

public class SamsunaLeg implements ILeg{
    private final int price = 100;

    @Override
    public void step() {
        System.out.println("Samsung leg step!");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
