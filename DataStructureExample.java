a Java program that uses data structures concept:

import java.util.*;

public class DataStructureExample {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = new ArrayList<>();
        
        // Add some numbers to the list
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        
        // Print the list
        System.out.println("List of numbers: " + numbers);
        
        // Create a set of strings
        Set<String> names = new HashSet<>();
        
        // Add some names to the set
        names.add("John");
        names.add("Mary");
        names.add("David");
        
        // Print the set
        System.out.println("Set of names: " + names);
        
        // Create a map of strings and integers
        Map<String, Integer> ages = new HashMap<>();
        
        // Add some ages to the map
        ages.put("John", 25);
        ages.put("Mary", 30);
        ages.put("David", 35);
        
        // Print the map
        System.out.println("Map of ages: " + ages);
    }
}


Find the output