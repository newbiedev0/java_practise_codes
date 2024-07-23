
            class Fruit {
	public void sell(){
		System.out.println("fruit is sold");
	}

}
   class Orange extends Fruit{
	   
   }
   class Lemon extends Fruit{
	   
   }
      
public class FruitTest {

	
	public static void main(String[] args) {
		
			   Fruit F = new Fruit();
			   F.sell();
			   F=new Orange();
			   F.sell();
			   F=new Lemon();
			   F.sell();
			   
		   }
	}