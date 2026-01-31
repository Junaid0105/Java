package ques_solve;

import java.util.Scanner;

public class UserInputAddition {
    public static void main(String[] args){
        Scanner inputNum = new Scanner(System.in);// Create scanner class object

        System.out.print("Enter the first number: ");
        int firstNumber = inputNum.nextInt();

        System.out.print("Enter the second Number: ");
        int secondNumber = inputNum.nextInt();

        System.out.println("The sum of two number is: " + (firstNumber + secondNumber));
    }
}
