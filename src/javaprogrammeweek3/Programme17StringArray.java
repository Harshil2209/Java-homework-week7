package javaprogrammeweek3;

import java.util.Arrays;

public class Programme17StringArray {
    public static void main(String[] args) {

        // Sorting a numeric array
        int[] numericArray = {1, 2, 3, 4, 5, 6, 7, 8, 9,};
        Arrays.sort(numericArray);
        System.out.println("Sorted numeric Array: ");
        for (int num : numericArray) {
            System.out.println(num + " ");
        }
        System.out.println();

        //sorting a string array
        String[] stringArray = {"java", "idea", "out", "src", "project", "class", "file"};
        Arrays.sort(stringArray);
        System.out.println("Sorted String Array: ");
        for (String name : stringArray) {
            System.out.println(name + " ");
        }
        System.out.println();
    }

}
