package ex_Switch;

public class Lab008_switchAbovejdk13 {
    public static void main(String[] args) {
        int a = 1;
        switch (a){
            case 1 -> System.out.println("1");
            case 2 -> System.out.println("2");
            default -> System.out.println("default");

            // We can use arrows for cases
            // Break statement is not required her.

        }
    }
}
