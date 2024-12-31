import java.io.*;

public class filecopier {

    public static void main(String[] args) {
        try {
            // Source file path
            String sourceFilePath = "source.txt"; 
            // Destination file path
            String destinationFilePath = "destination.txt"; 

            // Create input stream from source file
            FileInputStream inputStream = new FileInputStream(sourceFilePath);

            // Create output stream to destination file
            FileOutputStream outputStream = new FileOutputStream(destinationFilePath);

            // Buffer for efficient copying
            byte[] buffer = new byte[1024]; 
            int bytesRead;

            // Read data from source and write to destination
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }

            // Close streams to release resources
            inputStream.close();
            outputStream.close();

            System.out.println("File copied successfully!");

        } catch (IOException e) {
            System.err.println("Error copying file: " + e.getMessage());
        }
    }
}
