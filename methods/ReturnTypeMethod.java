package methods;
import java.util.Scanner;
public class ReturnTypeMethod {
    public static void main(String[] args){
        greet();
        int first = readNumber();
        int second = readNumber();
        int result = addition(first,second);
        System.out.println("The sum of two numbers is " + result);
    }

    public static void greet(){
        System.out.println("Welcome to the calculator-----");
    }
    public static int readNumber(){   //return type method--> read number and return value to where the method calls
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        return number;
    }
    public static int addition(int a, int b){
        return a + b;
    }
}
