package ex_Strings;

import java.util.Scanner;

public class Lab002_String_Functions {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String Practice = sc.nextLine();
        //Count Length of the string
        System.out.println("Length of the String is"+ Practice.length());

        //Check if it's empty -> Return Boolean
        System.out.println("String is Empty --> "+Practice.isEmpty());

        // CharAT
        System.out.println("Charachter at 5th index -->"+Practice.charAt(5));

        //Equals -> Return boolean -> Case sensitive
        System.out.println("Are both the string same? -->"+Practice.equals("Hello"));
    }
}
