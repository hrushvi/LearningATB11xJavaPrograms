package ex_Task001;

import java.util.Scanner;

public class Task14March_ScannerInput1 {
    public static void main(String[] args) {
        //Take a user input - Name, Age and Salary and print them in the end.
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Name");
        String name = sc.nextLine();

        System.out.println(("Enter your Age"));
        int age = sc.nextInt();

        System.out.println("Enter your Salary");
        long salary = sc.nextLong();

        System.out.printf("Name:%s\nAge: %d\nSalary:%d",name,age,salary);

    }
}
