package ex_Task001;

public class Task14March_ArgsInputWithTernary {
    public static void main(String[] args) {
        // Take a user input 2 numbers from the arguments and calculate the maximum in between with ternary operator.
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        int max = (num1>num2) ? num1 : num2;
        System.out.println("Max number is: "+max);

    }


}
