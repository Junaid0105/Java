package loop_questions;
import java.util.Scanner;
public class SumOfOddNum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();

        int count = 1;
        int sum = 0;
        while (count<=number){
            sum = sum + count;
            count=count+2;
        }
        System.out.println("The sum of Odd Number is " + sum);
    }
}
