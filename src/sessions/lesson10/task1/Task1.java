package sessions.lesson10.task1;

public class Task1 {
    /**
     * Напишите метод, который принимает в качестве параметра любую строку, например “I like Java!!!”.
     */
    public static void main(String[] args) {
        StringUtil stringUtil = new StringUtil();
        stringUtil.setStr("I like Java!!!");

        stringUtil.checkStringEndWith("!!!");
        stringUtil.checkStringStartWith("I like");
        stringUtil.checkStrContains("Java");
        stringUtil.showPosition("Java");
        stringUtil.changeAllSybmols("a", "o");
        stringUtil.setToUpperCase();
        stringUtil.setToLowerCase();
        stringUtil.substring("Java");
    }
}
