package ex_Switch;

public class Lab004_SwitchInterview02 {
    public static void main(String[] args) {
        char c = 'A';
        switch(c){
            case 65:
                System.out.println("Match ASCII");
                break;
            default:
                System.out.println("Not a match");
                break;

                /*
             Que - Is it valid and will it match  or not
             Ans - Valid statement - it will match the ascii value as A has the ascii of 65.
            */
        }
    }
}
