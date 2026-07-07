package constructor;

public class ParameterizedConstructor {
    String name;
    int age;

    ParameterizedConstructor(String name, int age){// parameter constructor
        this.name = name;
        this.age = age;
    }

    void info(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("My name is " + name);
        System.out.println("And I am " + age + " years old");
    }
    public static void main(String[] args){
        ParameterizedConstructor obj = new ParameterizedConstructor("Junaid",24);
        System.out.println(obj.name);
        System.out.println(obj.age);
    }
}
