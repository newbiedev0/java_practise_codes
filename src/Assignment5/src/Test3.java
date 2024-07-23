package Assignment5.src;
import java.io.*;

//This code to entering the input as creating the text file
//using new inbuilt classes and functions
public class Test3 {
    public static void main(String[] args) {
        try {
            BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter text: ");
            String input = keyboard.readLine();
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write(input);
            writer.close();
            System.out.println("Text written to output.txt");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}

