package ex_Task001;

public class Lab_InputArgs {
    public static void main(String[] args) {
    //    String marks1 = args[0];
        String marks1 = args[0];
        String marks2 = args[1];
        String marks3 = args[2];

        int marks = Integer.parseInt(marks1);
        int marks4 = Integer.parseInt(marks2);
        int marks5 = Integer.parseInt(marks3);


        System.out.println(marks4);
        System.out.println(marks5);
        String Grade = (marks>59) ? ((marks>89) ? "Grade A" : (marks>79) ? "Grade B" : (marks>69) ? "Grade C" : "Grade D") : "Grade f";
        System.out.println(Grade);



    }
    }

