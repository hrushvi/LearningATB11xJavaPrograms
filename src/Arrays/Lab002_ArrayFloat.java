package Arrays;

import java.util.Scanner;

public class Lab002_ArrayFloat {
    public static void main(String[] args) {
        float[] marks = new float[5];
        Scanner sc=new Scanner(System.in);
        for(int i =0;i<marks.length;i++){
            System.out.println("Ender Marks for student -->"+(i+1));
            marks[i]=sc.nextFloat();
        }
        sc.close();
        for(int i=0;i<marks.length;i++){
            System.out.println("Marks for student"+(i+1)+"--> " + marks[i]);
        }
    }
}
