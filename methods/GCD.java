package methods;
import java.util.Scanner;
public class GCD {
    public static void main(String[] args){
        int num1 = readNumber();
        int num2 = readNumber();
        System.out.println(GCD_Num(num1, num2));
    }
    public static int GCD_Num(int num1, int num2){

        int leastNumber = least(num1,num2);
        int GCD = 1;
        int i = 2;
        while(i<=leastNumber){
            if (num1 % i == 0 && num2 % i == 0){
                GCD = i;
            }
            i++;
        }
        return GCD;

    }
    public static int readNumber(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        return number;
    }
    public static int least(int num1, int num2){
        if (num2<num1){
            return num2;
        }
        else {
            return num1;
        }
    }
}
