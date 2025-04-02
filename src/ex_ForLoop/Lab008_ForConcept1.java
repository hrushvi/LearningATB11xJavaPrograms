package ex_ForLoop;

public class Lab008_ForConcept1 {
    public static void main(String[] args) {
        for(long l=1l;l<10;l++){
            System.out.println(l);
        }
        for(float f=1.2f;f<10;f++){
            System.out.println(f);
            // different datatypes are allowed
            //not advisable - most of the time we will  use int
            // as we mostly increment by 1
        }
    }
}
