package homework.lesson7.task2.Clothes;

public class BlackShoes implements Shoes {
    private boolean shoesPutOn;

    @Override
    public void putOn() {
        shoesPutOn = true;
        System.out.println("Black Shoes put on");
    }

    @Override
    public void putOff() {
        shoesPutOn = false;
        System.out.println("Black Shoes put on");
    }
}
