package homework.lesson7.task2.Clothes;

public class BlackJacket implements Jacket{
    private boolean jacketPutOn;

    @Override
    public void putOn() {
        jacketPutOn = true;
        System.out.println("Black Jacket put on");
    }

    @Override
    public void putOff() {
        jacketPutOn = false;
        System.out.println("Black Jacket put off");
    }
}
