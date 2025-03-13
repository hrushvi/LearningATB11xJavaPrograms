package ex_13March_TernaryOperator;

public class Lab_13MarchTask {
    public static void main(String[] args) {
    //    String marks1 = args[0];
        String marks1 = args[0];
        int marks = Integer.parseInt(marks1);
        String Grade = (marks>59) ? ((marks>89) ? "Grade A" : (marks>79) ? "Grade B" : (marks>69) ? "Grade C" : "Grade D") : "Grade f";
        System.out.println(Grade);



    }
    }

