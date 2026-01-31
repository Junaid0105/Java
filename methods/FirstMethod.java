package methods;
import java.util.Scanner;
public class FirstMethod {
    public static void main(String[] args){
        Pattern();
    }
    // other method------
    public static void Pattern(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int rows = input.nextInt();
        int count = 0;

        while(count<rows){
            System.out.print("*");
            int i = 0;
            while (i<count){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            count++;
        }
    }
}
