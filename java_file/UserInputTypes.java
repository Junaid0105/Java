package java_file;
import java.sql.SQLOutput;
import java.util.Scanner;
public class UserInputTypes {
    public static void main(String[] args){
        Scanner inputObj = new Scanner(System.in);// Create a Scanner class object
        System.out.print("Enter the boolean value: ");
        boolean boolValue = inputObj.nextBoolean(); // Read boolean value from a user
        inputObj.nextLine();

        System.out.print("Enter the String: ");
        String name = inputObj.nextLine();// read a string value from the user

        System.out.print("Enter the Double value (Decimal): ");
        double ExperienceNumber = inputObj.nextDouble();//Read double(decimal) number



        System.out.println("You are a student of Java: " + boolValue);
        System.out.println("My name is " + name);
        System.out.println(ExperienceNumber + " Years experience");

    }
}
