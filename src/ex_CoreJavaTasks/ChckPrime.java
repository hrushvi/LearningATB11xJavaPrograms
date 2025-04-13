package ex_CoreJavaTasks;

import java.util.Scanner;

public class ChckPrime {
    public static void main(String[] args) {
        System.out.println("Enter Number to check it's  prime:  ");
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        boolean isPrime=true;
        if(num<2){
            isPrime=false;
        }
        else {
            for(int i=2;i<Math.sqrt(num);i++){

                if(num%i==0){
                    isPrime=false;
                    break;
                }
            }
        }
      if(isPrime){
          System.out.println(num+" is a Prime Number");
      }
      else {
          System.out.println(num+" isn not a prime number");
      }
    }

}
