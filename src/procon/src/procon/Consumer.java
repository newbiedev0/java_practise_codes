package procon;
public class Consumer extends Thread {
	   private Holder holder;
	   
	   public Consumer(Holder c) {
	      holder = c;
	   }
	   
	   public void run() {
	      
	      for (int i = 1; i < 10; i++) {
	         holder.get();
	         System.out.println("Consumer got: "+ i);
	         try {
	            sleep((int)(Math.random() * 100));
	         } catch (InterruptedException e) { }
	      }
	   }
	}

