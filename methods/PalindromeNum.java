package methods;
import java.util.Scanner;
public class PalindromeNum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter thr number: ");
        int number = input.nextInt();
        int reverse_num = ReverseNum(number);
        if (reverse_num == number){
            System.out.println("The number is Palindrome");
        }
        else {
            System.out.println("The number is not Palindrome");
        }

    }
    public static int ReverseNum(int num){
        int remainder = 0;
        int result = 0;
        while (num>0){
            remainder = num % 10;
            result = (result * 10 ) + remainder;
            num = num/10;
        }
        return result;
    }
}
