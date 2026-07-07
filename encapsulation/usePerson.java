package encapsulation;

class Person {
    // Private instance variables (data hiding)
    private String name;
    private int age;

    // Public getter method for 'name' (read access)
    public String getName() {
        return name;
    }

    // Public setter method for 'name' (write access with potential validation)
    public void setName(String name) {
        // Optional validation logic can be added here
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        }
    }

    // Public getter method for 'age'
    public int getAge() {
        return age;
    }

    // Public setter method for 'age' with validation
    public void setAge(int age) {
        // Ensures age is within a valid range before setting
        if (age > 0 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("Invalid age provided: Age must be between 1 and 120.");
        }
    }
}


public class usePerson {
    public static void main(String[] args){
        Person obj1 = new Person();
        obj1.setName("Junaid");
        System.out.println(obj1.getName());
    }
}
