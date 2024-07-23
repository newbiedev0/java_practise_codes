
           class Device {
	public void status(){
		System.out.println("device is online");
	}

}
class Mobile extends Device{
	
}
class Laptop extends Device{
	
}
public class DeviceTest {

	
	public static void main(String[] args) {
		Device d=new Mobile();
		d.status();
		d=new Laptop();
		d.status();

	}

}

