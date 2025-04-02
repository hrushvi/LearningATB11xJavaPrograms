package ex_Inheritance.DynamicDispatchEX;

public class CallJuice {
    public static void main(String[] args) {
        WhichJuice wj;
        wj = new StrawberryJuice();
        wj.juice();

        wj =new OrangeJuice();
        wj.juice();



    }

}
