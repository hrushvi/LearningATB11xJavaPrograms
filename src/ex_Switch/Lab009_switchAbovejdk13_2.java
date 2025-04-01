package ex_Switch;

import java.util.Scanner;

public class Lab009_switchAbovejdk13_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        sc.close();
        switch (a){
            case 1,2,3:
                System.out.println("1,2,3");
                break;
            case 4,5,6:
                System.out.println("4,5,6");
                break;
            default:
                System.out.println("default");
                break;

            // We can use multiple values in one case with comma separator
            // Break statement is not required her.


        }
    }
}
