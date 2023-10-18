the use of Object-Oriented Programming (OOP) concepts:

java
// Define a class called "Person"
class Person {
    // Instance variables
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Method to display information about the person
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Create an instance of Person class
        Person person1 = new Person("John", 25);

        // Display information about the person
        person1.displayInfo();

        // Update the person's name and age
        person1.setName("Jane");
        person1.setAge(30);

        // Display updated information about the person
        person1.displayInfo();
    }
}
Find the output