import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class CarTest {

	public static void main(String[] args) {
		Car c = new TataCar();
		Tyre tyre = c.getTyre();
		System.out.println(tyre.getBrand() + ":" + tyre.getPrice());
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("E://CarTest.txt");
			ObjectOutputStream obs = new ObjectOutputStream(fos);
			obs.writeObject(c);
		} catch (IOException e) {
			System.out.println("caught IO exception");
		} finally {
			if (fos != null)
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}

		}
	}

}
