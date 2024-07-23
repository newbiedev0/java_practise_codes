package Assignment5.src;

import java.io.*;


//some file stream operations and copying the contents of the source file to destination file
public class Test4 {
    public static void main(String[] args) {
        String sourceFileName = "source.txt";
        String destFileName = "dest.txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(sourceFileName));
            BufferedWriter writer = new BufferedWriter(new FileWriter(destFileName));
            String line;

            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            reader.close();
            writer.close();

            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("Error while copying file: " + e.getMessage());
        }
    }
}

