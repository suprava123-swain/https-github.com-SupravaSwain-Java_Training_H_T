import java.util.*;  
class User{  
 public static void main(String args[]){  
 TreeSet<String> set=new TreeSet<String>();  
         set.add("name");  
         set.add("empid");  
         set.add("age");  
         System.out.println("Traversing element through Iterator in descending order");  
         Iterator i=set.descendingIterator();  
         while(i.hasNext())  
         {  
             System.out.println(i.next());  
         }  
           
 } 
