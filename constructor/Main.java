package constructor;

public class Main {
    public static void main(String[] args){
        ConstructorClass stuObject = new ConstructorClass();
        System.out.println(stuObject.name);
        System.out.println(stuObject.age);

        stuObject.info("Alam",22);
    }
}
