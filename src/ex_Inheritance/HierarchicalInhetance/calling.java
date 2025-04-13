package ex_Inheritance.HierarchicalInhetance;

 class Animal {
     void make_sound() {
         System.out.println("Animal sound");
     }
 }

    class dog extends Animal{
        void make_sound(){
            System.out.println("Woof Woof!");
        }
    }

    class cat extends Animal{
        void make_sound(){
            System.out.println("Meow Meow");
        }
    }
    public class calling{
        public static void main(String[] args) {
            Animal animal = new cat();
            animal.make_sound();
            animal = new dog();
            animal.make_sound();

        }
    }
