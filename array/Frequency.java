package array;
import java.util.Scanner;
public class Frequency {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7,8,4,5,3,2,4,1,1,5,6,3,6,6,7,8,8,7,9,9};
        System.out.print("Enter the target: ");
        int target = input.nextInt();
        int NumberCount = NumberOfOccurrences(arr, target);
        System.out.println("The " + target + " is occur " + NumberCount + " times");
    }
    public static int NumberOfOccurrences(int[] arr, int num){
        int i = 0;
        int count = 0;
        while (i<arr.length){
            if (arr[i]==num){
                count++;
            }
            i++;
        }
        return count;
    }
}
