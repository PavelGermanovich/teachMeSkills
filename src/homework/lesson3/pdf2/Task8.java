package homework.lesson3.pdf2;

public class Task8 {
    /**
     * И ещё можете попрактиковаться и нарисовать оставшиеся 2
     * треугольника
     */
    public static void main(String[] args) {
        int triangleSize = 4;

        for (int j = 0; j < 4; j++) {
            for (int k = 0; k < 4; k++) {
                if (k < triangleSize - 1) {
                    System.out.printf(" ");
                } else {
                    System.out.printf("*");
                }
            }
            System.out.println();
            triangleSize--;
        }
        System.out.println();

        int secondTriangleSize = 4;
        for (int i = 0; i < secondTriangleSize; i++) {
            for (int k = 0; k < 4; k++) {
                if (k < i) {
                    System.out.printf(" ");
                } else {
                    System.out.printf("*");
                }
            }
            if (i != secondTriangleSize - 1) {
                System.out.println();
            }
        }
    }
}