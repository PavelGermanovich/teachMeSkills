package sessions.lesson9.task1;

public class Demo {
    public static void main(String[] args) {
        Number number = new Number();
        number.hashCode();
        System.out.println("Введите первое число");
        int firstNumber = number.validateUntilInputNumberCorrect();
        System.out.println("Введите второе число");
        int secondNumber = number.validateUntilInputNumberCorrect();
        System.out.println("Результат равен " + Calculator.divide(firstNumber, secondNumber));
    }
}