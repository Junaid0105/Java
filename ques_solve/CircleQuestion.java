//Circumference and area of circle, volume of sphere
//use Math class
package ques_solve;
import java.util.Scanner;
public class CircleQuestion {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double radius;
        double circumference;
        double area;
        double volume;

        System.out.print("Enter the radius of Circle: ");
        radius = input.nextDouble();
//        circumference of circle
        circumference = 2 * Math.PI * radius;
        System.out.println("The Circumference of a circle is " + circumference + "cm");
        System.out.printf("The Circumference of a circle is %.1fcm\n",circumference);

//        area of a circle
        area = Math.PI * Math.pow(radius, 2) ;
        System.out.println("The area of a circle is " + area + "cm²");
        System.out.printf("The area of a circle is %.1fcm²\n",area);

//        volume of sphere
        volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);
        System.out.println("The volume of sphere is " + volume + "cm³");
        System.out.printf("The volume of sphere is %.1fcm³\n",volume);
    }
}
