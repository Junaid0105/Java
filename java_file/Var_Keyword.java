package java_file;

public class Var_Keyword {
    public static void main(String[] args){
        /* var keyword --> lets the compiler automatically detect the type of a varaible based on the value
        * you assign to it*/

        var myNum = 5;         // int
        System.out.println(myNum);

        var myDouble = 9.98;   // double
        System.out.println(myDouble);

        var myChar = 'D';      // char
        System.out.println(myChar);

        var myBoolean = true;  // boolean
        System.out.println(myBoolean);

        var myString = "Hello"; // String
        System.out.println(myString);
    }
}
