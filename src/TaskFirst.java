public class TaskFirst {
    public static void main(String[] args) {
        int petyaApples = 5;
        int sergApples = 9;
        int sum = petyaApples + sergApples;

        System.out.println("Sum of apples equals " + sum);

        if (petyaApples > sergApples) {
            System.out.println("Petya has more apples, difference is " + (petyaApples - sergApples));
        } else if (petyaApples < sergApples) {
            System.out.println("Serg has more apples, diff is " + (sergApples - petyaApples));
        } else {
            System.out.println("Apples amount equals");
        }

        System.out.println((sum % 2) == 0 ? "Sum of apples is even" : "Sum of apples is odd");
    }


}
