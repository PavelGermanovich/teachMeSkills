public class TaskSecond {
    public static void main(String[] args) {
        int n = 12;

        if (n > 5 && n <= 10) {
            System.out.println("s");
        } else if (n > 10) {
            System.out.println((n%2==0 ? "XL" : "L"));
        } else {
            System.out.println("Nothing matches");
        }
    }
}
