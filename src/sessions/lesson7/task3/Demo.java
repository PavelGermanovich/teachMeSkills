package sessions.lesson7.task3;

public class Demo {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 5);
        Square square = new Square(10);

        System.out.println("Rect perimeter " + rectangle.getPerimeter());
        System.out.println("Rect area " + rectangle.getArea());
        System.out.println("Square perimeter " + square.getPerimeter());
        System.out.println("Square area " + square.getArea());
    }
}
