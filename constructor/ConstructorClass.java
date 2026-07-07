package constructor;

public class ConstructorClass {
    String name;
    int age;

    ConstructorClass(){// this is a constructor
        name = "Junaid Alam"; // always initialize with these values
        age = 25;
    }

    void info(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("My name is " + name);
        System.out.println("And I am " + age + " years old");
    }
}
