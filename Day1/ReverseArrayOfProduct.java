#1.
a) Change Singleton example, so that existing object is returned when invoked multiple times, instead of null.




class SingletonEx {
   private static SingletonEx obj;



  private SingletonEx() {      
   }



  public static SingletonEx getInstance() {
      if(obj == null) {
         obj = new SingletonEx();
      }
       return obj;
   }



  public void display() {
       System.out.println("Singleton Object is Created.");
   }
}



class Main {
   public static void main(String[] args) {
      SingletonEx obj1;
      obj1= SingletonEx.getInstance();
      
      obj1.display();
   }
}
