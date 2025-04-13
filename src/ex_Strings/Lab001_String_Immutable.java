package ex_Strings;


public class Lab001_String_Immutable {
    public static void main(String[] args) {
        String name = "Hrushvi"; // Stores in String Constant pool
        name.toUpperCase();// This will not change the name to upper case reference is pointing to string "Hrushvi"
        System.out.println(name); //Printing "Hrushvi:


        String name2="hrushvi";
        name2=name2.toUpperCase();
        System.out.println(name2);//changes to "HRUSHVI as reference is assigned"


        String name3 = new String(); //->Stores in Heap area OR Object area
        name3= "Hrushvi";

        System.out.println(name3);
        String name4 = new String("Hrushvi"); // new will alway create a new memory even thought it's same string.

    }
}
