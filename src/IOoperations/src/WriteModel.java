
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteModel {

	public static void main(String[] args) {
		
		try {
			FileOutputStream fos = new FileOutputStream("E://Einstien eqn.txt");
			String s = "first popular equation";
			fos.write(s.getBytes());
			System.out.println("saved");
		} catch (FileNotFoundException e) {
			System.out.println("File is not available");
		} catch (IOException e) {
			System.out.println("Exception while writing");
		}

	}

}