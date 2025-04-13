package ex_CoreJavaTasks;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter a number to find a factorial -- ");
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int fact=1;
        for(int i=num;i>0;i--){
         fact=fact*i;
        }
        System.out.println("Factorial for "+num+ " is: "+fact);

    }
}
