package overriding;

public class FullStackDeveloper extends FrontEndDeveloper{
    public void mySkills(){// this method override the parent class method
                            // so this method will run when we call mySkills method (Child class method)
        super.mySkills();
        System.out.println("I know Python, Node.js, Express.js, NoSQL.....");
    }
}
