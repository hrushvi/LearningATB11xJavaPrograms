package ex_Switch;

import java.util.Scanner;

public class Lab002_Switch {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter Browser name");
        String browser = Sc.nextLine();

        switch (browser){
            case "chrome":
                System.out.println("opening Chrome");
                System.out.println("TC1");
                System.out.println("TC2");
                System.out.println("closing browser - Chrome");
                break;
            case "firefox":
                System.out.println("Firefox");
                System.out.println("TC1");
                System.out.println("TC2");
                System.out.println("closing browser - Firefox");
            case "safari":
                System.out.println("safari");
                System.out.println("TC1");
                System.out.println("TC2");
                System.out.println("closing browser - safari");
            default:
                System.out.println("Browser not available");

        }

    }
}
