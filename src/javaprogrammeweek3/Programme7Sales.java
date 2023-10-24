package javaprogrammeweek3;

import java.util.Scanner;

public class Programme7Sales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter sales ID:");
        int salesID = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter saller's Name: ");
        String sellerName = scanner.nextLine();

        System.out.println("Enter Sales Amount:");
        double salesAmount = scanner.nextDouble();

        System.out.println("Enetr Salary Basic:");
        double salaryBasic = scanner.nextDouble();

        double commissionRate = 0.0;


        if (salesAmount>=50000){
            commissionRate = .35;

        } else if (salesAmount >= 30000) {
            commissionRate = .20;

        } else if (salesAmount >= 20000) {
            commissionRate = .10;


        } else if (salesAmount >= 10000) {
            commissionRate = .05;

        }else{
            commissionRate = .02;
        }
        double commission = salesAmount * commissionRate;
        double totalSalary = salesAmount + commissionRate;

        System.out.println("Sales ID:" + salesID);
        System.out.println("Sellere's Name:"+sellerName);
        System.out.println("Sales Amount:" + salesAmount);
        System.out.println("Commision Rate: "+ (commissionRate * 100) +"%");
        System.out.println("Commision: "+ commission);
        System.out.println("Total Salary: "+ totalSalary);
    }
}
