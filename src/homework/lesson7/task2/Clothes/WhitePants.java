package homework.lesson7.task2.Clothes;

public class WhitePants implements Pants{
    private boolean pantsPutOn;

    @Override
    public void putOn() {
        pantsPutOn = true;
        System.out.println("White Pants put on");
    }

    @Override
    public void putOff() {
        pantsPutOn = false;
        System.out.println("White Pants put off");
    }
}
