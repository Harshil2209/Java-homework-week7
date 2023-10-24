package javaprogrammeweek3;
//Write a java programme to input that tells us that input number is odd or even

import java.util.Scanner;

public class Programme1EvenOdd {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Eneter a number: ");
        int num = reader.nextInt();
        String evenOdd = (num % 2 == 0) ? "even" : "odd";
        System.out.println(num + " is " + evenOdd);
    }

}
