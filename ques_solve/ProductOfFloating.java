//Create a program to calculate product of two floating points numbers.
package ques_solve;
import java.util.Scanner;
public class ProductOfFloating {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();

        double product = num1 * num2;
        System.out.println("The product of two numbers is " + product);
    }
}
