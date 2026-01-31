package loop_questions;
import java.util.Scanner;
public class FactorialMethod {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        long fact = factorial(number);
        System.out.println("The factorial of " + number + " is " + fact);
    }
    public static long factorial(int num){
        if (num<2){
            return 1;
        }
        long fact = 1;
        while (num>0){
            fact = fact * num;
            num--;
        }
       return fact;
    }
}
