package inheritance;
//class parentClass{
//    public parentClass(){ // this will work perfectly but problem is occurred when
//                          // we create parameterized constructor
//        System.out.println("Parent class constructor called.......");
//    }
//}
class parentClass{
    public parentClass(String name){
        System.out.println("Parent class constructor called.........." + name);
    }
}
class childClass extends parentClass{
    public childClass(){
        super("Parent class");
        System.out.println("Child class constructor called........");
    }
}
public class useSuper {
    public static void main(String[] args){
        childClass obj = new childClass();
    }
}
