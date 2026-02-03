package array;

public class ArrayDeclaration {
    public static void main(String[] args){
        int[] marks = new int[10];
        marks[0] = 90;
        marks[1]=93;
        marks[2]=99;
        marks[3]=89;
        int i = 0;
        while (i<10){
            System.out.println(marks[i]);
            i++;
        }

    }
}
