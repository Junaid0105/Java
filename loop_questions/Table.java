//A program that prints the multiplication table for a given number
package loop_questions;
import java.util.Scanner;
public class Table {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = input.nextInt();
        int count = 1;
        while(count<=10){
            System.out.println(number + " x " + count + " = " + (number*count));
            count +=1;
        }
    }
}
