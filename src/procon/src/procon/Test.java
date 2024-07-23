package procon;

public class Test {
	   public static void main(String[] args) {
	      Holder c = new Holder();
	      Producer p1 = new Producer(c);
	      Consumer c1 = new Consumer(c);
	      p1.start(); 
	      c1.start();
	   }
	}