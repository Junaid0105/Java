package abstractClassMethods;

import java.util.LinkedList;

abstract class Language{
    abstract public void greetings();
}

class Hindi extends Language{
    public void greetings(){
        System.out.println("hello in hindi");
    }
}
class English extends Language{
    public void greetings(){
        System.out.println("Good morning");
    }
}

public class useAbstract {
    public static void main(String[] args){
        Language lang;
        lang = new Hindi();
        lang.greetings();

        lang = new English();
        lang.greetings();
    }
}
