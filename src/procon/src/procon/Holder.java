package procon;

public class Holder {
	   private int contents;
	   private boolean flag = false;
	   
	   public synchronized int get() {
	      while (flag == false) {
	         try {
	            wait();
	         }
	         catch (InterruptedException e) {
	         }
	      }
	      flag = false;
	      notify();
	      return contents;
	   }
	   
	   public synchronized void put(int value) {
	      while (flag == true) {
	         try {
	            wait();
	         }
	         catch (InterruptedException e) {
	         } 
	      }
	      contents = value;
	      flag = true;
	      notify();
	   }
	}
