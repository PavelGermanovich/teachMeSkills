package homework.lesson7.task3;

public class SpacePort {
    public void launch(IStart iStart) {
        if (!iStart.checkBeforeStart()) {
            System.out.println("Предстартовая проверка провалилась");
        } else {
            iStart.launchEngine();
            System.out.println("Обратный отсчет: ");
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
            iStart.start();
        }
    }
}
