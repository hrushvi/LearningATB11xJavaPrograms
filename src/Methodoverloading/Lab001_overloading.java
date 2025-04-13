package Methodoverloading;
//✅ Create a Shape class with an area() method overloaded for:
//area(int side) → returns square area
//area(int length, int width) → returns rectangle area
//area(double radius) → returns circle area (use 3.14 * radius * radius)
public class Lab001_overloading {

    public static int area(int side){
        return side*side;
    }
    public static int area(int length,int width){
        return length*width;
    }
      public static double area(double radius){
        return 3.14*radius*radius;
    }

    public static void main(String[] args) {
        System.out.println(area(5));
        System.out.println(area(10,5));
        System.out.println(area(5.64));



    }
}
