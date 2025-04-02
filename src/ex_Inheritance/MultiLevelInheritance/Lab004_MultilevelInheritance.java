package ex_Inheritance.MultiLevelInheritance;

public interface Lab004_MultilevelInheritance {
    public static void main(String[] args) {
        Daughter d1 = new Daughter();
        d1.f();
        d1.gf();
        d1.dau();
        Father f1 = new Father();
        f1.f();
        f1.gf();
        Grandfather g1 = new Grandfather();
        g1.gf();
        //Granfather can only access his method and property - super - super class
        // Father can access his and grandfathers property and methods - child class to GF
        // son class can access his, father and grandfather's property and methods.
    }

}
