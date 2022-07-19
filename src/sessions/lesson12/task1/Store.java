package sessions.lesson12.task1;

public class Store {
    private int goodsNumber;

    public synchronized void put() {
        while (goodsNumber >= 3) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        goodsNumber++;
        System.out.println("Производитель добавил товар на Склад, кол-во товаров = " + goodsNumber);
        notify();
    }

    public synchronized void get() {
        while (goodsNumber < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        goodsNumber--;
        System.out.println("Покупатель забрал товар со Склада, кол-во товаров = " + goodsNumber);
        notify();
    }

}