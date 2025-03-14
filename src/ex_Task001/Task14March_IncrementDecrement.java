package ex_Task001;

public class Task14March_IncrementDecrement
{
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++ + a++);
        // 6 / 10 / NA
        // ++a -  value of a -> 11
        // 11 + (a++) 11 - after the addition value of a -> 12
        // 11 + 11 + (a++) 12 -> after the addition value of a ->13
        // 11 + 11 + 12 = 34
        System.out.println(a);
        // Value of a - > 13
        // output -> 34 and 13

    }
}
