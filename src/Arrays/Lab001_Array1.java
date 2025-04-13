package Arrays;

public class Lab001_Array1 {
    public static void main(String[] args) {
        int[] marks = new int[5];
        marks[0] = 100;
        marks[1] = 50;
        marks[2] = 60;
        marks[3] = 40;
        marks[4] = 70;
        //marks[5] = 100; //throws array index out of bound error - array index stars from 0.
        for(int i=0;i< marks.length;i++){
            System.out.println(marks[i]); //if you type only marks[] and not type - it will print address of marks
        }
    }
}
