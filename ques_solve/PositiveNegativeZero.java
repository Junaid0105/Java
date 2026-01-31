//Check weather the number is positive , negative or zero
package ques_solve;
import java.util.Scanner;
public class PositiveNegativeZero {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = input.nextInt();

        if (number==0){
            System.out.println("Zero");
        }
        else if (number>0) {
            System.out.println("Positive");
        }
        else {
            System.out.println("Negative");
        }
        ;
    }
}
