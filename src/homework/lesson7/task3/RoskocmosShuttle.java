package homework.lesson7.task3;

import java.util.Random;

public class RoskocmosShuttle implements IStart{

    @Override
    public boolean checkBeforeStart() {
        if (new Random().nextInt(10000) == 1) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void launchEngine() {
        System.out.println("Двигатели Роскосмоса запущены. Все системы в норме");
    }

    @Override
    public void start() {
        System.out.println("Старт Роскомоса");
    }


}
