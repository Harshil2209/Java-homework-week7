package javaprogrammeweek3;

public class Programme19AverageValue {
    public static void main(String[] args) {

        //initialize an array
        int[] numbers = {10,23,34,56,89};

        //initialize a variable to store the sum
        int sum = 0;

        //Iterate through the array to calculate the sum
        for (int number : numbers){
            sum =+ number;
        }
        //calculate the average
        double average =(double) sum / numbers.length;
        //print the average
        System.out.println("Average:" + average);
    }
}
