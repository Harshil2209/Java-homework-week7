package javaprogrammeweek3;

import java.util.Scanner;

public class Programme5SalarySlip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Input employee details
        System.out.println("Enter Employee Id: ");
        int employeeId = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Employee Name: ");
        String employeeName = scanner.nextLine();
        System.out.println("Enter Basic Salary:");
        double basisSalary = scanner.nextDouble();

        //Calculate various components
        double hra = .10 * basisSalary;
        double ta = .08 * basisSalary;
        double da = .09 * basisSalary;
        double pf = .09 * basisSalary;
        double grossSalary = basisSalary + hra + ta + da - pf;

        //Print the salary slip
        System.out.println("___________________________________");
        System.out.println("| Salary Slip |");
        System.out.println("| Employee Id : " + employeeId + " |");
        System.out.println("| Employee Name : " + employeeName +" |");
        System.out.println("|___________________________________|");
        System.out.println("| Basic Salary : "+ hra+ "  | " );
        System.out.println("| HRA 10% : " + ta+ "|");
        System.out.println("| DA 9% : "+da+" | ");
        System.out.println("| PF - 20% :"+ pf+" |");
        System.out.println("|___________________|");
        System.out.println("| Gross Salary : "+grossSalary+ "|");
        System.out.println("|============================|");
    }
}
