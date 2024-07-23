package part1;

      abstract class Aircraft{
    	  public void fly(){
    		  System.out.println("Aircraft is flying");
    	  }
          public abstract void climb();    //abstract is used to hide definition of a method and
                                           //object cannot be instantiated from abstracted class
        	  
          }
          class Flight extends Aircraft{                                       //abstract methods also inherited 
        	       public void climb(){                      //either give abstract to sub class
        		  System.out.println("flight climb faster"); //or define the method using overriding
        	  }
          }        
          class HeliCopter extends Aircraft{
        	       
        	       public void climb(){
        	      System.out.println("helicopter climb slower than flight");
        	       }
           }
           class BalloonFlight extends Aircraft{
        	        public void climb(){
        	       System.out.println("ballon flight climb slower than helicpter");
        	        }
           }
          
          

public class AircraftTest {


	public static void main(String[] args) {
		Aircraft a=new Flight();
		a.fly();
		a.climb();
		
		a=new Flight();
		a.fly();
		a.climb();
		
		a=new HeliCopter();
		a.fly();
		a.climb();
		
		a=new BalloonFlight();
		a.fly();
		a.climb();
		
		
	}

}
