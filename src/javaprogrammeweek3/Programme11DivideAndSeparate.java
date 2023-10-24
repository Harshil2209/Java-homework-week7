package javaprogrammeweek3;

public class Programme11DivideAndSeparate {
    public static void main(String[] args) {
        System.out.println("Number divided by 3: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i + " ");
            }
        }
        System.out.println("\nNumber divided by 5: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.println(i + " ");
            }
        }
    }
}
