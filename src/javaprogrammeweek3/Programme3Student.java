package javaprogrammeweek3;

import java.util.Scanner;

/**
 * This class represents a student and provides methods
 */
public class Programme3Student {
    static String name;
    static int roll, math, sci, eng;
    static int total;
    static double percentage;
    static String Grade;
    static String result;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter Student Name:");
        name = scan.nextLine();
        System.out.println("Please enter Student Roll Number: ");
        roll = scan.nextInt();
        System.out.println("Please enter Math marks: ");
        math = scan.nextInt();
        System.out.println("Please enter Science marks: ");
        sci = scan.nextInt();
        System.out.println("Please enter English marks: ");
        eng = scan.nextInt();
        // if else statements ensuring all the inserted marks are not out of permitted values
        // if the values are within permitted range it will print result
        // if the values are outside permitted values it will print error message
        if (math >= 0 && math <= 100 && sci >= 0 && sci <= 100 && eng >= 0 && eng <= 100) {
            result();
            print();

        } else {
            System.out.println("The mark valur should be between 0 to 100");
        }
        scan.close();
    }


    //Static method calculating total,percentage,& allocating Pass, Fail and Grade using Coditions
    public static void result() {
        total = math + eng + sci;
        percentage = (total / 3);
        if ((math < 35) || (sci < 35) || (eng < 35)) {
            percentage = 0.0;
            result = "Fail";
            Grade = "N/A";

        } else if ((percentage >= 35) && percentage < 50) {
            result = "Pass";
            Grade = "C";

        } else if ((percentage >= 50) && percentage < 60) {
            result = "Pass";
            Grade = "B";
        } else if ((percentage >= 60) && (percentage < 80)){
            result = "Pass";
            Grade = "A";
        }else if (percentage >= 80) {
            result = "Pass";
            Grade = "A++";
        }
    }

    //print method calling all variables and printing desired output
    public static void print() {
        System.out.println(" ---------------------------------------");
        System.out.println("|              MARK SHEET               ");
        System.out.println("|---------------------------------------");
        System.out.println("| Name    : " + name + "                ");
        System.out.println("| Roll No.: " + roll + "                ");
        System.out.println("|---------------------------------------");
        System.out.println("| SUBJECTS          :      MARKS        ");
        System.out.println("|---------------------------------------");
        System.out.println("| Maths             :      " + math + "  ");
        System.out.println("| Science           :      " + sci + "   ");
        System.out.println("| English           :      " + eng + "   ");
        System.out.println("|---------------------------------------");
        System.out.println("| Total             :      " + total + " ");
        System.out.println("|---------------------------------------");
        System.out.println("| Percentage        :      " + percentage);
        System.out.println("| Result            :      " + result);
        System.out.println("| Grade             :      " + Grade);
        System.out.println("|---------------------------------------");
    }


}
