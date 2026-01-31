//Random class to generate random integer
package java_file;
import java.util.Random;
public class RandomClass {
    public static void main(String[] args){
        Random random = new Random();

        int number1;

        number1 = random.nextInt(1,7);
        if (number1==1){
            System.out.println("Move one step forward....");
        } else if (number1==2) {
            System.out.println("Move two step forward....");
        } else if (number1==3) {
            System.out.println("Move three step forward....");
        } else if (number1==4) {
            System.out.println("Move four step forward....");
        } else if (number1==5) {
            System.out.println("Move five step forward....");
        }else {
            System.out.println("Move six step forward....");
        }
//        System.out.println(number1);
    }
}
