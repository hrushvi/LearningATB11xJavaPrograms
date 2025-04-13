package Arrays;

import java.util.Scanner;

public class Lab001_Evennum {
    public static void main(String[] args) {
        System.out.print("Enter Size of Array --> ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] even = new int[size];
        for (int i = 0; i < even.length; i++) {
            even[i] = sc.nextInt();
        }
        findEven(even);
    }

    static void findEven(int arr[]) {
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count += 1;
            }
        }

            System.out.println("total Even number is  -- > "+count);

        }

    }


