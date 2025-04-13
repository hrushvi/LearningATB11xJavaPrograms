package Arrays;

import java.util.Scanner;

public class Lab006_2d_180degreeRotation {
    public static void main(String[] args) {
        System.out.println("Enter size of array");
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int[][] arr= new int[size][size];
        System.out.println("------------");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.println("Enter number  "+"["+i+"]["+j+"]");
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("------------");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.printf("%02d",arr[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

        for (int i=0;i<arr.length/2;i++){
            for(int j=i;j<arr.length;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[size-i-1][size-j-1];
                arr[size-i-1][size-j-1]=temp;
            }
        }


        System.out.println("------------");
        System.out.println("------------");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.printf("%02d",arr[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
