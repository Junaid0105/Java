package switch_condition;
import java.util.Scanner;
public class BasicCalculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("-----------Calculator--------------");
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.print("Choose operator:-- + , - , * , / :-");
        char op = input.next().charAt(0);

        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        switch (op){
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '/':
                if (num2==0){
                    System.out.println("Can't divide by zero");
                }else {
                    System.out.println(num1/num2);
                }
                break;
            default:
                System.out.println("Not a valid operator");
        }
    }
}
