package fileInputOutputOperations;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class imagereader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the path of the image: ");
        String imagePath = scanner.nextLine();

        try (FileInputStream fis = new FileInputStream(imagePath)) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            int totalBytes = 0;

            while ((bytesRead = fis.read(buffer)) != -1) {
                totalBytes += bytesRead;
            }

            System.out.println("The image has " + totalBytes + " bytes.");
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
