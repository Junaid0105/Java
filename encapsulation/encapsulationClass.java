package encapsulation;

// encapsulation --> Encapsulation is the process of binding or wrapping the
//                   data and the codes that operates on the data into a single entity

public class encapsulationClass {
//    int age;   // without encapsulation
//    String name;

    private int age;   // we create this instance variables private
    private String name; // private instance variable

    public void info(int age, String name){
        System.out.println("My name is " + name);
        System.out.println("I am " + age + " years old");
    }
}
