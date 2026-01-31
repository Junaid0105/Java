package java_file;

import java.util.Scanner;

public class InputByUser {
    public static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Welcome, " + name);
    }
}
