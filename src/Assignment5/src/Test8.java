package Assignment5.src;


// when i create a string object and assign strings to the object variable
//i use parseInt method to for the string and catch the exception thrown
public class Test8{
   public static void main(String[] args) {
      String str = "abc"; 
      
      try {
         int num = Integer.parseInt(str); 
         System.out.println(num);
      } catch (NumberFormatException e) {
         System.out.println("Caught NumberFormatException: " + e.getMessage());
      }
   }
}
