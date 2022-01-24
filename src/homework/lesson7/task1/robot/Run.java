package homework.lesson7.task1.robot;

import homework.lesson7.task1.robot.hands.SamsungHand;
import homework.lesson7.task1.robot.hands.SonyHand;
import homework.lesson7.task1.robot.hands.ToshibaHand;
import homework.lesson7.task1.robot.heads.SamsungHead;
import homework.lesson7.task1.robot.heads.SonyHead;
import homework.lesson7.task1.robot.heads.ToshibaHead;
import homework.lesson7.task1.robot.legs.SamsunaLeg;
import homework.lesson7.task1.robot.legs.SonyLeg;
import homework.lesson7.task1.robot.legs.ToshibaLeg;

public class Run {
    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */

        SonyHand sonyHand = new SonyHand(400);
        SonyHead sonyHead = new SonyHead(4000);
        SonyLeg sonyLeg = new SonyLeg();

        ToshibaHand toshibaHand = new ToshibaHand(111);
        ToshibaHead toshibaHead = new ToshibaHead(3000);
        ToshibaLeg toshibaLeg = new ToshibaLeg();

        SamsungHand samsungHand = new SamsungHand(222);
        SamsungHead samsungHead = new SamsungHead(3400);
        SamsunaLeg samsunaLeg = new SamsunaLeg();

        Robot robotOne = new Robot(samsungHead, toshibaHand, sonyLeg);
        Robot robotTwo = new Robot(toshibaHead, samsungHand, sonyLeg);
        Robot robotThree = new Robot(sonyHead, sonyHand, samsunaLeg);

        robotOne.action();
        robotTwo.action();
        robotThree.action();
        System.out.println(robotOne.getPrice());
        System.out.println(robotTwo.getPrice());
        System.out.println(robotThree.getPrice());

        if (robotOne.getPrice() > robotTwo.getPrice()) {
            if (robotOne.getPrice() > robotThree.getPrice()) {
                System.out.println("Robot one has MAX price");
            } else {
                System.out.println("Robot Three has max price!");
            }
        } else if (robotTwo.getPrice() > robotThree.getPrice()) {
            System.out.println("Robot 2 has max price!");
        } else {
            System.out.println("Robot three has max price!");
        }
    }
}
