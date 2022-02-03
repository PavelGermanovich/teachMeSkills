package sessions.lesson10.task2;

public class StringUtil {
    public StringBuilder formStringAddition(int first, int second) {
        return new StringBuilder().append(first).append(" + ").append(second).append(" = ")
                .append(first + second);
    }

    public StringBuilder formStringSubtraction(int first, int second) {
        return new StringBuilder().append(first).append(" - ").append(second).append(" = ")
                .append(first - second);
    }

    public StringBuilder formStringMultiply(int first, int second) {
        return new StringBuilder().append(first).append(" * ").append(second).append(" = ")
                .append(first * second);
    }

    public StringBuilder replaceEqualsUsingInsert(StringBuilder str) {
        int indexOfEquals = str.indexOf("=");
        str.deleteCharAt(indexOfEquals);
        str.insert(indexOfEquals, "равно");
        return str;
    }

    public StringBuilder replaceUsingReplace(StringBuilder stringBuilder) {
        return stringBuilder.replace(stringBuilder.indexOf("="), stringBuilder.indexOf("=") + 1,
                "равно");
    }
}
