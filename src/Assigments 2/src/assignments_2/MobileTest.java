package assignments_2;
           class Mobile{
        	  public String modelName;
        	  public int androidVersion;
        	  public int cost;
        	  public int rating;
           
        	 
        	public Mobile(String modelName,int androidVersion,int cost,int rating){
        		this.modelName=modelName;
        		this.androidVersion=androidVersion;
        		this.cost=cost;
        		this.rating=rating;
        		
        	}
        	public Mobile(int cost,String modelName){
        	this.cost=cost;
        	this.modelName=modelName;
           }
        	public Mobile(String modelName,int rating){
        		this.modelName=modelName;
        		this.rating=rating;
        	}
        	public Mobile(int cost,int androidVersion){
        		this.cost=cost;
        		this.androidVersion=androidVersion;
        	}
        	public String getModelName(){
        		return modelName;
        		
        	}
        	public int getAndroidVersion(){
        		return androidVersion;
        	}
        	public int getCost(){
        		return cost;
        	}
        	public int getRating(){
        		return rating;
        	}
        	public void call(){
        		System.out.println("mobile is calling");
        	}
           }	
        	
        	
    	
public class MobileTest {

	public static void main(String[] args) {
		Mobile m=new Mobile("galaxy",11,30000,5);
		
		
		System.out.println(m.getModelName());
		System.out.println(m.getAndroidVersion());
		System.out.println(m.getCost());
		m.call();
		
	}

}
