//Check weather the number is Even or Odd
package ques_solve;
import java.util.Scanner;
public class CheckEvenOdd {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = input.nextInt();
        String result;
        result = (number%2==0)? "Even" : "Odd";
        System.out.println(result);

    }
}
