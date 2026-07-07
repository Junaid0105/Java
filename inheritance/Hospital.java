package inheritance;

class Doctor{
    public void qualification(){
        System.out.println("Qualification details.....");
    }
}
class Surgeon extends  Doctor{
    public void specialist(){
        System.out.println("Specialisation details......");
    }
}

public class Hospital {
    public static void main(String[] args){
        Surgeon s1 = new Surgeon();
        s1.specialist();
        s1.qualification();
    }
}
