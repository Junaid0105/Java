package loop_questions;
import java.util.Scanner;
public class LCM_UsingLoop {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();

        int max_num = Math.max(number1,number2);
        int count = 1;
        boolean n = true;
        while (n){
            if ((max_num % number1==0) && (max_num % number2==0)){
                System.out.println("The LCM of two integer is " + max_num);
                n = false;
            }else {
                max_num = max_num+1;

            }
        }
    }
}
