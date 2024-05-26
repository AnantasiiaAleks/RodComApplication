package interfaces;

import java.io.FileWriter;
import java.io.IOException;

public interface WriteToFile {
    default void writeToFile(String text, String filePath) {
        try {

            FileWriter fileWriter = new FileWriter(filePath);
            fileWriter.write(text + "\n");
            fileWriter.close();
            System.out.println("File is created successfully with the content.");
        }
        catch (IOException e) {
            System.out.print("Writting error");
        }
    }
}
