//Bitwise operator
package java_file;
import java.util.Scanner;
public class BitwiseOperator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();
        System.out.print("Enter the Second number: ");
        int number2 = input.nextInt();
        int result;

//        Bitwise AND operator (&)
        result = number1&number2;
        System.out.println("Bitwise AND of two number is " + result);

//        Bitwise OR |
        result = number1|number2;
        System.out.println("Bitwise OR of two number is " + result);

//        Bitwise XOR ^
        result = number1^number2;
        System.out.println("Bitwise XOR of two number is " + result);

//        NOT Operator ~
        result = ~number1;
        System.out.println("Bitwise NOT of one number1 is " + result);

//        Left shift operator <<
        result = number1<<number2;
        System.out.println("Left shit: " + result);

        result = 4>>2;
        System.out.println("Right shift: " + result);
    }
}
