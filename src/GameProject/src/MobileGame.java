class Mobile{
	   private String GAME;
	   public void setGAME(String GAME){
		   this.GAME=GAME;
	   }
	   public String getGAME(){
		   return GAME;
	   }
	   public void play(){
		   System.out.println("normal");
	   }
}
abstract class Game extends Mobile{
	  public abstract void play();
}
class TempleRun extends Game{
	  public void play(){
		  System.out.println("played using swipe");
	  }
}
class Chess extends Game{
	public void play(){
		  System.out.println("played using drag and drop");
	}
}
	

public class MobileGame {
              
	public static void main(String[] args) {
		Mobile M=new Mobile();
		M.play();
		M=new TempleRun();
		M.play();
		M=new Chess();
		M.play();
	}

}
