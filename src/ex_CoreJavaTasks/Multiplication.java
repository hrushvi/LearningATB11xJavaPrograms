package ex_CoreJavaTasks;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        System.out.println("Enter number to print a table: ");
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("Table of "+num);
        System.out.println("--------------");

        for(int i=1;i<=10;i++){
            System.out.println(num + " X "  + i +" = "+ num*i);
        }
        sc.close();
    }
}
