package loop_questions;
import java.util.Scanner;
public class Prime {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        int count = 1;
        int flag = 0;
        while (count<=(number/2)){
            if (number % count ==0){
                flag = flag + 1;
            }
            count++;
        }
        if (flag==1){
            System.out.println("The number is prime");
        }else {
            System.out.println("Not prime");
        }

    }
}
