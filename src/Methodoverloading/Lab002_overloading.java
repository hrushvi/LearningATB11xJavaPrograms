package Methodoverloading;

import java.util.Scanner;

public class Lab002_overloading {
    public static void main(String[] args) {
        Calculator cl = new Calculator();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number (Integer)");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number (Integer)");
        int b = sc.nextInt();
        System.out.println("Enter 3rd number (Integer)");
        int c = sc.nextInt();
        System.out.println("Enter 4th number (Decimal)");
        double d = sc.nextDouble();
        System.out.println("Enter 5th number (Decimal)");
        double e = sc.nextDouble();
        System.out.println("sum of 2 integer --> " + cl.add(a, b));
        System.out.println("sum of two decimal --> " + cl.add(d, e));
        System.out.println("Sum of 3 integer --> " + cl.add(a, b, c));

        sc.close();

    }
}
    class  Calculator{
        int add(int a, int b){
            return a+b;
        }
        double add(double a,double b){
            return a+b;
        }
        int add(int a,int b, int c){
            return a+b+c;
        }
    }
