package Arrays;

import java.util.Scanner;

public class Lab008_countGraterAvg {
    public static void main(String[] args) {
        System.out.print("Sizr of an array - > ");
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the number at index: "+i);
            arr[i]=sc.nextInt();
        }
        findGreaterThanAvgCount(arr);

    }
    static void findGreaterThanAvgCount(int[] arr){
        int sum=0; int count=0;
        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];

        }
        int avg=sum/arr.length;
        System.out.println("Sum of number--> "+sum);
        System.out.println("Average --> "+avg);
        for(int i=0;i<arr.length;i++){
            if(arr[i]>avg){
                count++;
            }
        }
        System.out.println("Count of numbers greater --> "+count);

    }
}
