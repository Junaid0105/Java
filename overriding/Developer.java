package overriding;

public class Developer {
    public static void main(String[] args){
        FrontEndDeveloper dev = new FullStackDeveloper();
        dev.mySkills(); // child method called, if we need to call parent method also then we have to use "super"
    }
}
