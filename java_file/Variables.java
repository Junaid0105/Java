package java_file;
import java.lang.*;

public class Variables {
    public static void main(String[] args){
        //declare variables --> variables used to store the data of any type
        int age = 20; // integer data type
        String name = "Junaid"; //string data type
        System.out.println(age);
        System.out.println(name);

        /* final keyword---> if we don't want to overwrite the existing value then, we use
        * final keyword ( this will declare the variable as "final" or "constant", which means unchangeable
        * and read-only)*/
        final int myNumber = 100;
        System.out.println(myNumber);
        //myNumber = 40; ---> this will give the error because we can not reassign the value to final variable

    }
}
