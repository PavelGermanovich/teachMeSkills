package sessions.lesson7.task3;

public class Rectangle {
    private int a, b;

    Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int getArea() {
        return a * b;
    }
    public int getPerimeter() {
        return (a + b) * 2;
    }
}
