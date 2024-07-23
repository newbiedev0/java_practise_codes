public class LambdaTest2 {
   public static void main(String[] args) {

      Runnable r = () -> {
         System.out.println("This is a new thread created by Lambda expression");
      };

     Thread t = new Thread(r);
      t.start();
   }
}


