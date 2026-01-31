package ques_solve;
import java.util.Scanner;
public class EvenOddUsingBitwise {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = input.nextInt();

        if ((number&1)==0){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }
}
