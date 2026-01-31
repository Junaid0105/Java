package loop_questions;
import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        int count = 3;
        int a = 0, b = 1;
        int curr_num = 0;
        if (number<0){
            System.out.println("Invalid number...");
        } else if (number==1) {
            System.out.println(a);
        }else {
            System.out.print(a + " ");
            System.out.print(b + " ");
            while (count<=number){
                curr_num = a + b;
                a = b;
                b = curr_num;
                System.out.print(curr_num + " ");
                count++;
            }
        }
    }
}
