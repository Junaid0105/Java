package encapsulation;

public class Main {

    public static void main(String[] args){
        encapsulationClass st_info = new encapsulationClass();
//        st_info.name = "Junaid";  // this is the problem when we didn't create the
//        st_info.age = 25;         // instance variable private , we can access directly without methods
//        System.out.println(st_info.age + " " + st_info.name);  // that's why we need encapsulation
        st_info.info(25,"Junaid");
    }
}
