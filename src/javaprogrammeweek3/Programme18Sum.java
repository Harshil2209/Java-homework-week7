package javaprogrammeweek3;

public class Programme18Sum {
    public static void main(String[] args) {
        int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8};// Array declaration
        int sum = sumArray(numbers); // assigning local variable
        System.out.println("The sum of the array: " + sum);
    }

    public static int sumArray(int[] arr){
        int sum = 0;
        for (int i =0; i <arr.length; i++){
            sum += arr[i];

        }
        return sum;
    }
}

