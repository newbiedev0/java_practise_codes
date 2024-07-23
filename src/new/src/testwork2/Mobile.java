package testwork2;


public class Mobile {
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