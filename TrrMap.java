

// Java Program to demonstrate descendingMap() method
  
import java.util.*;
  
public class Country {
    public static void main(String[] args)
    {
  
        // Declaring the tree map of Integer and String
        TreeMap<String, String> treemap
            = new TreeMap<String, String>();
  
        // Add the mappings to the tree map using put()
        treemap.put("BBSR", "orissa");
        treemap.put("New Delhi", "India");
        treemap.put("Patna", "Bihar");
       
        // store the descending order of mappings in dmap
        NavigableMap dmap = treemap.descendingMap();
  
        // print the mappings
        System.out.println(
            "List of statename in reverse order: " + dmap);
    }
}
