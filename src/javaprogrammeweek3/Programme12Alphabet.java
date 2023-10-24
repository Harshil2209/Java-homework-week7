package javaprogrammeweek3;

import java.util.Scanner;

public class Programme12Alphabet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Enter a character
        System.out.println("Eneter a character: ");
        char inputChar = scanner.next().charAt(0);

        //scanner close

        if (Character.isDigit(inputChar)){
            System.out.println("Input a number");
        } else if (Character.isLetter(inputChar)) {
            System.out.println("Input is a alphabet");

        }else {
            System.out.println("Input is a symbol or a combination of characters");
        }
    }
}
