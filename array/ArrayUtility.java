package array;
import java.util.Scanner;
public class ArrayUtility {
    public static int[] inputArray(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number of elements: ");
        int size = input.nextInt();
        int[] numArr = new int[size];
        int i = 0;
        while (i<size){
            System.out.print("Enter the "+ (i+1) + " elements: ");
            numArr[i] = input.nextInt();
            i++;
        }
        return numArr;
    }
}
