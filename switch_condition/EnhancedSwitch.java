package switch_condition;
import java.util.Scanner;
public class EnhancedSwitch {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the days: ");
        String day = input.nextLine();

        switch (day){
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("It is a weekday");
            case "Saturday", "Sunday" -> System.out.println("It is a weekend");
            default -> System.out.println(day + " is not a day");
        }
    }
}
