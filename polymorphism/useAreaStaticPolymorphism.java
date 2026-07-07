package polymorphism;

class areaOfShapes{                                             //
    public int area(int len, int breadth){                      //
         int res = len * breadth;                               //
         return res;                                            //
    }                                                           //
    public double area(double radius){                          //
        return (Math.PI*radius*radius);
    }
    public int area(int side){
        return side*side;
    }
}

public class useAreaStaticPolymorphism {
    public static void main(String[] args){
        areaOfShapes obj = new areaOfShapes();
        // method name same but behaviour different on different arguments
        System.out.println("The area of cube is " + obj.area(7));
        System.out.println("The area of circle is " + obj.area(14.1));
        System.out.println("The area of rectangle is " + obj.area(10,12));
    }
}
