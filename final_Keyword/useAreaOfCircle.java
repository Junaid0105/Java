package final_Keyword;

class AreaOfCircle{
    private int radius = 2;
   // private final double pi = 3.14;// now this value is fixed, we can't be reassigned this value

    // final--> assign the value at once
    private final double pi;
    public AreaOfCircle(){
        pi = 3.14; // this another way to fix value
    }
    public void area(double p){
      //  pi = p;// can not reassign the value to final variable
        System.out.println(pi*radius*radius);
    }
}

public class useAreaOfCircle {
    public static void main(String[] args){
        AreaOfCircle ar = new AreaOfCircle();
        ar.area(22);
    }
}
