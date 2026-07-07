package polymorphism;

class Parent{
    public void method1(){
        System.out.println("I am in parent class");
    }
}
class child1 extends Parent{
    public void method1(){
        System.out.println("I am in child1 class");
    }
}
class child2 extends Parent{
    public void method1(){
        System.out.println("I am in child 2 class");
    }
}


public class useLateBindingDynamicPolymorphism {
    public static void main(String[] args){
        Parent p ; // reference for all objects(Parent ,child1, child2)
        p = new Parent();               //
        p.method1();                    //  this is late binding
                                        //  JVM Check object at run time
        p = new child1();               //
        p.method1();                    //
                                        //
        p = new child2();               //
        p.method1();                    //

    }
}
