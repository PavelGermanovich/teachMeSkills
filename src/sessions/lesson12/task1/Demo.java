package sessions.lesson12.task1;

public class Demo {
    /**
     * Рассмотрим, как мы можем использовать эти методы. Возьмем стандартную задачу из прошлой темы -
     * "Производитель-Потребитель" ("Producer-Consumer"): пока производитель не произвел продукт, потребитель не может
     * его купить. Пусть производитель должен произвести 5 товаров, соответственно потребитель должен их все купить.
     * Но при этом одновременно на складе может находиться не более 3 товаров. Для решения этой задачи задействуем
     * методы wait() и notify():
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Thread main has started");
        Store store = new Store();
        Consumer consumer = new Consumer();
        consumer.setStore(store);
        Producer producer = new Producer();
        producer.setStore(store);
        new Thread(producer).start();
        new Thread(consumer).start();
        System.out.println("Thread main has finished");
    }
}
