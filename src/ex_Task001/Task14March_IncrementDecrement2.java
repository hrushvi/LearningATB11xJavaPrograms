package ex_Task001;

public class Task14March_IncrementDecrement2
{
    public static void main(String[] args) {
        int a = 20;
        System.out.println(--a + a++ + a--);
        // line 6: Value of a = 20
        // line 7: --a : Value of a = 19
        // line 7: 19 + 19(a++) : Value of a = 20
        // line 7: 19+19+20 : System wil print: 58
        System.out.println(a);
        // line 12:  Value of a = 19
    }
}
