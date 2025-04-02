package ex_Inheritance.MultiLevelInheritance;

public class Lab006_IQ2 {
    public static void main(String[] args) {
        Grandfather g1 = new Daughter();
        // Que 1: can we create Child class object with Superclass object?
        // Ans 1: yes, it's valid - it's called dynamic dispatch
        //Que 2: Can we access Child class methods with Super class reference?
        //Ans 2: No we can not call the methods of child class methods with the reference of Super class - eben though object is of son class
        //g1.d(); -> Invalid.
    }
}
