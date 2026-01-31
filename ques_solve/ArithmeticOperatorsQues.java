package ques_solve;

import java.util.Scanner;

public class ArithmeticOperatorsQues {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        var number1 = input.nextInt();

        System.out.print("Enter the second number: ");
        var number2 = input.nextInt();

        System.out.println("The sum of two number is " +(number1+number2));
        System.out.println("The difference of two number is " + (number1-number2));
        System.out.println("The product of two number is " + (number1*number2));
        System.out.println("The division of two number is " + (number1/number2));
        System.out.println("Remainder of integer is " + (number1%number2));
    }
}
