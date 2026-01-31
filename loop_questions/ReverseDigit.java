package loop_questions;
import java.util.Scanner;
public class ReverseDigit {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();

        int count = 1;
        int rev_num = 0;
        int remainder;
        while (count<=number){
            remainder = number % 10;
            rev_num = (rev_num * 10) + remainder;
            number = number/10;
        }
        System.out.println("Reverse number: " + rev_num);
    }
}
