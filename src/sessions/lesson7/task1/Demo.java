package sessions.lesson7.task1;

public class Demo {
    public static void main(String[] args) {
        Phone phoneOne = new Phone(2222, "Vivo", 323);
        Phone phoneTwo = new Phone(2222, "Vivo");
        phoneOne.receiveCall("Pavel");
        phoneTwo.receiveCall("Pavel", 23423);
        phoneOne.sendMessage(new int[]{234324,23234232});
    }
}
