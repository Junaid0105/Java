package loop_questions;
import java.util.Scanner;
public class DigitSum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the integer number: ");
        int number = input.nextInt();

        int count = 1;
        int remainder;
        int result = 0;
        while(number>0){
            remainder = number%10;
            result = result + remainder;
            number = number/10;
        }
        System.out.println("The sum of integer digits is " + result);
    }
}
