package polymorphism;

//Polymorphism is a process that one method with same name shows different behavior on different condition
// static polymorphism is also compile time polymorphism
// compile time polymorphism achieved by method overloading

class parentClass{
    public void method1(String name){
        System.out.println("I am parent class method.........." + name);
    }
}
class childClass extends parentClass{
    public void method1(){

        System.out.println("I am child class method");

    }
}
public class staticPolymorphism {
    public static void main(String[] args){
        childClass obj = new childClass();
        obj.method1("Parent class");
    }
}
