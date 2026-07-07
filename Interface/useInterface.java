package Interface;

interface Animal{
    void sound();
    void eat();
}
class Lion implements Animal{
    public void sound(){
        System.out.println("Roar....");
    }
    public void eat(){
        System.out.println("meat...");
    }
}
class Dog implements Animal{
    public void sound(){
        System.out.println("Bark....");
    }
    public void eat(){
        System.out.println("Bones....");
    }
}

public class useInterface {
    public static void main(String[] args){
        Animal an;

        an = new Lion();
        an.sound();
        an.eat();

        an = new Dog();
        an.sound();
        an.eat();
    }
}
