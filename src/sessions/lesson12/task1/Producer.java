package sessions.lesson12.task1;

public class Producer implements Runnable{
    private Store store;

    public void setStore(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        for (int i = 1; i < 6; i++) {
            store.put();
        }
    }
}
