package homework.lesson7.task2.Clothes;

public class BlueJacket implements Jacket{
    private boolean jacketPutOn;

    @Override
    public void putOn() {
        jacketPutOn = true;
        System.out.println("Blue Jacket put on");
    }

    @Override
    public void putOff() {
        jacketPutOn = false;
        System.out.println("Blue Jacket put off");
    }
}
