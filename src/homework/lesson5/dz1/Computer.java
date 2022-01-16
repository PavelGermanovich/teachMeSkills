package homework.lesson5.dz1;

import java.util.Scanner;

public class Computer {
    private Ram ram;
    private CPU cpu;
    private HDD hdd;
    private int limitOfTurningOn;
    private boolean isComputerBurned;
    private boolean isComputerTurnedOn;

    public Computer(Ram ram, CPU cpu, HDD hdd, int limitOfTurningOn) {
        this.ram = ram;
        this.cpu = cpu;
        this.hdd = hdd;
        this.limitOfTurningOn = limitOfTurningOn;
    }

    public void showComputerInfo() {
        ram.showRamInfo();
        cpu.showCPUInfo();
        hdd.showHddInfo();
        System.out.println("Limit of switching Off&On is " + limitOfTurningOn);
        System.out.println("Is computer burn? " + isComputerBurned);
    }

    public void turnOn() {
        if (isComputerBurned) {
            System.out.println("Computer is Burned!");
            return;
        }

        if (!isComputerTurnedOn) {
            System.out.println("Trying to turn ON the computer");
            boolean guessTheNumber = isUserGuessTheNumber();
            if (guessTheNumber) {
                limitOfTurningOn--;
                if (limitOfTurningOn != 0) {
                    isComputerTurnedOn = true;
                    System.out.println("You successfully turned on the computer");
                } else {
                    isComputerBurned = true;
                    System.out.println("Computer has just burned, limit is ended");
                }
            } else {
                isComputerBurned = true;
                System.out.println("Computer has just burned");
            }
        } else {
            System.out.println("Computer is already turned on and working!");
        }
    }

    public void turnOff() {
        if (!isComputerBurned && isComputerTurnedOn) {
            System.out.println("Trying to turn OFF the computer");
            boolean guessTheNumber = isUserGuessTheNumber();
            if (guessTheNumber) {
                limitOfTurningOn--;
                if (limitOfTurningOn != 0) {
                    isComputerTurnedOn = false;
                    System.out.println("You successfully turned OFF the computer");
                } else {
                    isComputerBurned = true;
                    isComputerTurnedOn = false;
                    System.out.println("Computer has just burned, limit is ended");
                }
            } else {
                isComputerBurned = true;
                isComputerTurnedOn = false;
                System.out.println("Computer has just burned, u have not guess the number");
            }
        } else if (!isComputerTurnedOn) {
            System.out.println("Computer is NOT turned ON!");
        }
    }

    private boolean isUserGuessTheNumber() {
        System.out.println("Input number 0 or 1: ");
        int randomNumber = (int) (Math.random() * 2);
        int randomNumberFromUser = new Scanner(System.in).nextInt();
        if (randomNumber != randomNumberFromUser) {
            System.out.println("U have not guess the number!");
        }
        return randomNumber == randomNumberFromUser;
    }
}