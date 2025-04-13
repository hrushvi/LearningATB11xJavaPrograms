package Arrays;

import java.util.Scanner;

/*sum of diagonals
    1  2  3  4
    5  6  7  8
    9 10 11 12
   13 14 15 16        13
   1st sum - 1+6+11+16
   2nd sum = 4+7+10+13

         diff = 1st-2nd*/
public class Lab004_2DArrayExample {
    public static void main(String[] args) {

        System.out.print("Enter Array size: ");
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][] arr = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = scanner.nextInt();

            }
        }

        System.out.println("==========");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){

                System.out.printf("%02d",arr[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("==========");

        int d2sum=0;
        int d1sum=0;
        for (int i = 0; i < arr.length; i++) {

            d1sum = d1sum + arr[i][i];

            d2sum = d2sum + arr[i][N-1-i];

        }
        int diff=d1sum-d2sum;
        System.out.println(" Difference between 2 diagonals --> " + diff);
        }
    }

