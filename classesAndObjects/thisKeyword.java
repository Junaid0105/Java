package classesAndObjects;

public class thisKeyword {
    int age;



    public void main(String[] args){
        otherMethod(4);

    }
    public void otherMethod(int age){
        this.age = age;
        System.out.println(age);
    }
}
