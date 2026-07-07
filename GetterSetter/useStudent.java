package GetterSetter;

public class useStudent {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.setRoll(101);
        s1.setName("Junaid");
        s1.setPercentage(97.9);

        System.out.println("Roll no.: " + s1.getRoll());
        System.out.println("Name: " + s1.getName());
        System.out.println("Percentage: " + s1.getPercentage());

    }
}
