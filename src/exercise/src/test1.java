             public class Device {
	public void status(){
		System.out.println("device is online");
	}

}
class Mobile extends Device{
	
}
class Laptop extends Device{
	
}
public class Devicetest1 {

	
	public static void main(String[] args) {
		Device d=new Mobile();
		d.status();
		d=new Laptop();
		d.status();

	}

}
