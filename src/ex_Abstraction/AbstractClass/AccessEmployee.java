package ex_Abstraction.AbstractClass;

import java.util.Scanner;

public class AccessEmployee {
    public static void main(String[] args) {

        System.out.println("Enter details of full time Employee Id, Name, and Salary Respectively.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID (Integer):  ");
        int id=sc.nextInt();
        System.out.println("Enter Name (String):  ");
        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String name = sc.nextLine();
        System.out.println("Enter Salary (Double):  ");
        double fxsalary=sc.nextDouble();
        FullTimeSalary fs = new FullTimeSalary(id,name,fxsalary);
        System.out.println("Calculated Salary for Full time Employee is: -- >"+fs.calculateSalary());
        fs.displayDetails();


        System.out.println("Enter details of Part time Employee Id, Name, and Salary Respectively.");
        System.out.println("Enter ID (Integer):  ");
        int ptid=sc.nextInt();
        System.out.println("Enter Name (String):  ");
        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String ptName=sc.nextLine();
        System.out.println("Enter Hours worked");
        int hrswrkd=sc.nextInt();
        System.out.println("Enter Hours Rater per hour");
        int rtprhr=sc.nextInt();
        PartTimeSalary ps = new PartTimeSalary(ptid,ptName,hrswrkd, rtprhr);
        System.out.println("Calculated Salary for Part time Employee is: -- >"+ps.calculateSalary());
        ps.displayDetails();


    }
}
