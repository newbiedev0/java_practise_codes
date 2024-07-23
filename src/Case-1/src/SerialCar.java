import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class SerialCar {

	
	public static void main(String[] args) {
		Car c = new Car();
        c.setModel("suv");
        c.setPrice(100000);
        System.out.println(c.getModel()+" "+c.getPrice());
        FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("E://serialcar.txt");
			ObjectOutputStream obs = new ObjectOutputStream(fos);
			obs.writeObject(c);
		}catch (IOException e) {
			System.out.println("serialized");
		}finally{
		    	if (fos!=null)
					try {
						fos.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
		    	 
		    	 }
  }
	
}
