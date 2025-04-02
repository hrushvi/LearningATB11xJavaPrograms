package ex_Inheritance.SingleInheritance;

public class Lab001_Inheritance1 {
    public static void main(String[] args) {
    Father f1 = new Father();
        System.out.println(f1.gold_f);
        f1.bhk2();

        son s1 = new son();
        s1.bhk3();
        s1.bhk2();
        System.out.println(s1.gold_f);
    }
}
class Father{
    int gold_f = 1000;

    void bhk2(){ //behavior | Method | Function
        System.out.println("Father-2BHK");
    }
    // if we have already inherited father to son class, we can not inherit son to father
}
class son extends  Father{
    // with extends keyword we can inherit the class
    // now we can excess father classes property and function
    // all the father's code will copied to son class.
    // we can access father's function and property with son class object.
    void bhk3(){
        System.out.println("SBHK Son");
    }
}