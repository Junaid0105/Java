package ques_solve;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value of length: ");
        int Length = input.nextInt();

        System.out.println("Enter the value of breadth: ");
        int Breadth = input.nextInt();

        System.out.println("The area of rectangle is: " + (Length*Breadth));
    }
}
