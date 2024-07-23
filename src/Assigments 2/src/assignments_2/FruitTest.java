package assignments_2;
            class Fruit{
            	public void smell(){
            		System.out.println("Fruit smells");
            	}
            }
           class Apple extends Fruit{
        	   public void smell(){
        		   System.out.println("Apple smells like chemical");
        	   }
           }
            
public class FruitTest {


	public static void main(String[] args) {
	            Apple a= new Apple();
	            Fruit a1= new Fruit();
	            
	            a.smell();
	            a1.smell();
	}

}
