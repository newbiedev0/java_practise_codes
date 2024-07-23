
  class Mobile {
	private String brand;
	private int price;
	private int androidVersion;
	private String camera;
	
	public void setBrand(String brand){
		this.brand=brand;
	}
	public void setPrice(int price){
		this.price=price;
	}
	public void setAndroidVersion(int androidVersion){
		this.androidVersion=androidVersion;
	}
	public void setCamera(String camera){
		this.camera=camera;
	}
	public String getBrand(){
		return brand;
	}
	public int getPrice(){
		return price;
	}
	public int getAndroidVersion(){
		return androidVersion;
	}
	public String getCamera(){
		return camera;
	}
	public void call(){
		System.out.println("mobile is calling");
	}
	

}

public class MobileTEST1 {

	
	public static void main(String[] args) {
		Mobile mob=new Mobile();
		mob.setBrand("samsung");
		mob.setPrice(20000);
		mob.setAndroidVersion(11);
		mob.setCamera("32MP");
		
		mob.call();
		System.out.println(mob.getBrand());
		System.out.println(mob.getPrice());
		System.out.println(mob.getAndroidVersion());
		System.out.println(mob.getCamera());
	}

}

