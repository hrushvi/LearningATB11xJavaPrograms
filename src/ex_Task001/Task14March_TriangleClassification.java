package ex_Task001;

import java.util.Scanner;

public class Task14March_TriangleClassification {
    public static void main(String[] args) {
        //Triangle Classifier:
        //
        //Write a program that classifies a triangle based on its side lengths.
        // Given three input values representing the lengths of the sides,
        // determine if the triangle is equilateral (all sides are equal),
        // isosceles (exactly two sides are equal),
        // or scalene (no sides are equal). Use an if-else statement to classify the triangle

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of first side of the triangle");
        int side1 = sc.nextInt();
        System.out.println("Enter the length of second side of the triangle");
        int side2 = sc.nextInt();
        System.out.println("Enter the length of third side of the triangle");
        int side3 = sc.nextInt();

        if(side1 == side2 && side2==side3){
            System.out.println("Triangle is equilateral");
        }
        else if (side1 == side2 || side1==side3 || side2==side3) {
            System.out.println("Triangle is isosceles");
        }
        else {
            System.out.println("Triangle is scalene");
        }
        }

    }
