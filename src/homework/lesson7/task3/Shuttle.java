package homework.lesson7.task3;

import java.util.Random;

public class Shuttle implements IStart{
    @Override
    public boolean checkBeforeStart() {
        if (new Random().nextInt(11) > 3) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void launchEngine() {
        System.out.println("Двигатели Шатла запущены. Все системы в норме");
    }

    @Override
    public void start() {
        System.out.println("Старт Шатла");
    }
}
