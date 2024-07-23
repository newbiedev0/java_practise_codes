
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class CharStream1 {

	public static void main(String[] args) {
		
		try {
			FileWriter fos = new FileWriter("E://newdawn.txt");
			String s = "trying new things is fun";
			fos.write(s);
			System.out.println("saved");
		} catch (FileNotFoundException e) {
			System.out.println("File is not available");
		} catch (IOException e) {
			System.out.println("Exception while writing");
		}

	}

}
