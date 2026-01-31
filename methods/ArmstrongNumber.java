package methods;
import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        int ArmNumber = ArmStrong(number);
        if (ArmNumber == number){
            System.out.println("The " + number + " is Armstrong number.");
        }else {
            System.out.println("The " + number + " is not Armstrong number.");
        }
    }
    public static int ArmStrong(int num){
        int i = 0;
        int originalNum = num;
        int remainder = 0;
        int result = 0;
        int len_of_num = length(num);
        while(i<num){
            remainder = num%10;
            result = (int) (result + (Math.pow(remainder,len_of_num)));
            num = num/10;
        }
        return result;
    }
    public static int length(int num){
        int count = 0;
        int temp = 0;
        while (temp<num){
            num = num/10;
            count++;
        }
        System.out.println(count);
        return count;
    }
}
