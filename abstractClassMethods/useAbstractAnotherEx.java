package abstractClassMethods;

abstract class Animal{
    abstract public void sound();
}
class Lion extends Animal{
    public void sound(){
        System.out.println("Roar......");
    }
}
class Dog extends Animal{
    public void sound(){
        System.out.println("Bark.......");
    }
}

public class useAbstractAnotherEx {
    public static void main(String[] args){
        Animal an;
        an = new Lion();
        an.sound();

        an = new Dog();
        an.sound();
    }
}
