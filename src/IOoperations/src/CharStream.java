
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;



public class CharStream{
	 public static void main(String[] args) {
		  FileReader fis = null;
			try {
				fis = new FileReader("E://drake equation.txt");
				 int data = fis.read();
				   while (data != -1) {
				    System.out.print((char) data);
				    data = fis.read();
			}
			}catch (FileNotFoundException e) {
				  System.out.println("File is not available");
				
			}catch (IOException e) {
				   System.out.println("Exception");
			  } finally {
				  try {
					    while (fis != null) {
					     fis.close();
					    }
					    System.out.println("over");
					   } catch (IOException e) {
					    System.out.println("Exception while closing");
					   }
					  }
					 }
		} 
	 
	 
