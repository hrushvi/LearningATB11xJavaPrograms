package ex_Inheritance;

public class MultipleInheritance_IQ1 {
    //Multiple inheritance is not allowed in Java to avoid method conflicts, ambiguity, and complexity in constructor execution.
    //
    //1️⃣ Example: The Diamond Problem (Main Issue)
    //Imagine two parent classes have the same method name, and a child class tries to inherit from both:
    class A {
        void show() {
            System.out.println("A's method");
        }
    }

    class B {
        void show() {
            System.out.println("B's method");
        }
    }

//    // ❌ Java does NOT allow this!
//    class C extends A, B {
//        public static void main(String[] args) {
//            C obj = new C();
//            obj.show();  // Which 'show()' should be called? A's or B's?
//        }
    }
//1️⃣ Constructor Execution Order Problem
//Even if methods are different, Java still has constructor chaining rules (parent constructor must execute first).
//
//        💡 Example: If Java allowed multiple inheritance, which constructor should run first?
//
class A {
    int num = 10;
}

class B {
    int num = 20;
}

// ❌ Java does NOT allow this
//class C extends A, B {
//    public static void main(String[] args) {
//        C obj = new C();
//        System.out.println(obj.num);  // Which num? A’s or B’s? ❓
//    }
}


}
