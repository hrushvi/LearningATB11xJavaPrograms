package Arrays;

import java.util.Scanner;

public class Lab003_ArrayString {
    public static void main(String[] args) {
        String[] students = new String[5];
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i< students.length;i++){
            System.out.println("Enter  "+(i+1) +"student's name: -->");
            students[i] = scanner.nextLine();
            }
        for(String name : students){
            System.out.println(name);
        }
    }
}
