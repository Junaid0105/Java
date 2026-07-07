package GetterSetter;

public class Student {
    private int roll;
    private String name;
    private double percentage;

    public void setRoll(int rollNumber){ // setter method to set roll number        //
        roll = rollNumber;
    }
    public void setName(String n){//  setter method to set name
        name = n;
    }
    public void setPercentage(double per){ // setter method to set percentage
        percentage = per;
    }


    // setter methods to set the instance variable
    public int getRoll(){ //
        return roll;
    }
    public String getName(){
        return name;
    }
    public double getPercentage(){
        return percentage;
    }

}
