package ques_solve;
import java.util.Scanner;
public class GreatestNum {
    public static void main(String[] args){
        Scanner input  = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number2: ");
        int num2 = input.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = input.nextInt();

        if (num1>num2 && num1>num3){
            System.out.println("first number is greater");
        }
        else if (num2>num1 && num2>num3) {
            System.out.println("Second number is greater");
        }
        else {
            System.out.println("Third number is greater");
        }
    }
}
