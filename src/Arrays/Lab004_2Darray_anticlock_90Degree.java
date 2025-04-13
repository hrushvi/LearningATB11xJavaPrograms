package Arrays;

import java.util.Scanner;

public class Lab004_2Darray_anticlock_90Degree {
    public static void main(String[] args) {
        System.out.println("enter size of an array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[][] arr = new int[size][size];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println("Value of -> [" + i + "][" + j + "]");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("============");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.printf("%02d", arr[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
        System.out.println("============");


        for (int i = 0; i< arr.length; i++) { // 0
            for (int j = i ; j <arr.length; j++) { //0 | 1
                int temp= arr[i][j];   // temp = 1 // | temp = [0][1], temp=2
                arr[i][j]=arr[j][i]; //[0][0] 1 = [0][0] 1 // | [0][1] = [1][0] 4
                arr[j][i]=temp; //[0][0] = 1 //[1][0] = 2


            }
        }
        System.out.println("============");
        for(int i=0;i<arr.length;i++){
            for(int j= 0;j<arr.length;j++){
                System.out.printf("%02d",arr[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }

       System.out.println("============");
        for(int i=0;i<arr.length;i++){
            for(int j= arr.length-1;j>=0;j--){
                System.out.printf("%02d",arr[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
        System.out.println("============");

    }
    }

