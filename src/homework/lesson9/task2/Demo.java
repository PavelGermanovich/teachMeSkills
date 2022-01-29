package homework.lesson9.task2;

public class Demo {
    /**
     * 2) Заменить все вхождения символа стоящего в позиции (3) на символ стоящий в позиции 0
     */
    public static void main(String[] args) {
        StringUtil stringUtil = new StringUtil();
        String actual = stringUtil.getInputStringValidated();
        String result = stringUtil.replaceAll(actual);
        System.out.println(result);
    }
}
