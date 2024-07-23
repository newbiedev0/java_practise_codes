
public class LambdaTest {

    public static void main(String[] args) {
           Thread thread = new Thread(() -> {
            System.out.println("This is a new thread.");});
        
         try {
            thread.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }
        
      
        System.out.println("The new thread has finished.");
    }
}
