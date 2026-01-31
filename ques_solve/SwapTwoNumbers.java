package ques_solve;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args){
        Scanner inputObject = new Scanner(System.in);

        int number1, number2,temp;

        System.out.println("Enter the number1: ");
        number1 = inputObject.nextInt();

        System.out.println("Enter the number2: ");
        number2 = inputObject.nextInt();

        System.out.println("before swapping Number1: " + number1);
        System.out.println("before swapping Number2: " + number2);
//        temp = number1;
//        number1 = number2;
//        number2 = temp;
//        swapping a number without temp
        number1 = number1 + number2;
        number2 = number1 - number2;
        number1 = number1 - number2;
        System.out.println("after swapping Number1: " + number1);
        System.out.println("after swapping Number2: " + number2);

        System.out.println();
    }
}
