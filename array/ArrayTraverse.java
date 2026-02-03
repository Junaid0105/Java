package array;
import java.util.Scanner;
public class ArrayTraverse {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] myArr = {34,23,43,23,53,45,65,75,45,76,86,87,78,89};
        System.out.print("Enter the number you want to search: ");
        int number = input.nextInt();
        boolean isFound = isFound(myArr,number);
        if (isFound){
            System.out.println("found");
        }
        else {
            System.out.println("not found ");
        }
    }
    public static boolean isFound(int[] arr, int num){
        int index = 0;
        while (index<arr.length){
            if (arr[index]==num){
                return true;
            }
            index++;
        }
        return false;
    }
}
