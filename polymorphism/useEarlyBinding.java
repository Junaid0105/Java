package polymorphism;

class ParentClass{
    public void method1(){
        System.out.println("I am in parent class");
    }
}
class childClass1 extends ParentClass{
    public void method1(){
        System.out.println("I am in child1 class");
    }
}
class childClass2 extends ParentClass{
    public void method1(){
        System.out.println("I am in child 2 class");
    }
}

public class useEarlyBinding {
    public static void main(String[] args){
        ParentClass p = new ParentClass();
        p.method1();

        childClass1 ch1 = new childClass1();
        ch1.method1();

        childClass2 ch2 = new childClass2();
        ch2.method1();
    }
}
