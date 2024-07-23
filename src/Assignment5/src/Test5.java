package Assignment5.src;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Test5 {
	public static void main(String[] args) {
		String fileName = "example.txt";
		String filePath = "C:/data/";
		File file = new File(filePath + fileName);

		try {
			if (!file.exists()) {
				file.createNewFile();
			}

			FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);

			BufferedWriter bw = new BufferedWriter(fw);

			bw.write("This is some text to append to the file.");

			bw.close();

			System.out.println("Data successfully appended to file");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
