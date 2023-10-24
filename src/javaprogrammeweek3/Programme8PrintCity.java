package javaprogrammeweek3;

import java.util.Scanner;

public class Programme8PrintCity {
    static char l;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input any character from A to F (Uppercase Only) :" );
        l = scan.next().charAt(0);
        scan.close();
        Programme8PrintCity obj = new Programme8PrintCity();
        obj.city();
    }

    // Instance method with if else statement assessing the inserted character and printing
    //also ensuring inserted character is within permitted range

    public void city() {
        if (l == 'A') {
            System.out.println("Ahmedabad");
        }else if (l == 'B'){
            System.out.println("Baroda");
        }else if (l == 'C'){
            System.out.println("Coimbatore");
        } else if (l == 'D') {
            System.out.println("Daman");
        }else if (l == 'E'){
            System.out.println("East Baroda");
        } else if (l == 'F') {
            System.out.println("Faizabad");
        }else {
            System.out.println("Invalid Character Entry");
        }
    }
    }
