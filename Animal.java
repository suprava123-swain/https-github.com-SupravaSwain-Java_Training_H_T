abstract class Animal {
  
    int weight;
    int height;
  
    // Constructor of abstract class
    public Animal(int weight,int height)
    {
  
        // This keyword refers to current instance itself
        this.weight = weight;
        this.height = height;

    }
  
    // Abstract method of abstract class
    abstract int Body(int val);
}
  
// Class 2
// Helper class extending above Class1
// Child class of Abstract class
class Dog extends Animal {
  
    // Constructor of Child class GFG
    Dog()
    {
  
        // Super keyword refers to parent class
        super(2);
    }
  
    // Defining method the abstract method
    public int Body(int val);

 {
  
        // Returning value of same instance
        return this.length * val;
    }
}
  
// Class 3
// Main class
public class Main {
  
    // Main driver method
    public static void main(String args[])
    {
  
        // Creating reference object of abstract class
        // using it child class
        Animal a = new Dog();
  
        // Calling abstract method of abstract class
        System.out.println(c.body(12,16));
    }
}
