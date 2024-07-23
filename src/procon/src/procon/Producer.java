package procon;

public class Producer extends Thread {
	   private Holder holder;
	   
	   public Producer(Holder c) {
	      holder = c;
	   }
	   
	   public void run() {
		   int value=0;
	      for (int i = 1; i <= 10; i++) {
	       holder.put(value);
	         try {
	        	 sleep((int)(Math.random() * 100));
	         } catch (InterruptedException e) { }
	      }
	   }
	}
