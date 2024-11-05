package fileInputOutputOperations;

import java.io.*;

public class FileIOExample {
    public static void main(String[] args) {
        File file = new File("output.txt");

        try {
            // Create a new file
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getAbsolutePath());
            } else {
                System.out.println("File already exists.");
            }

            // Write data to the file
            try (FileOutputStream fos = new FileOutputStream(file)) {
                String data = "Hello, world!";
                fos.write(data.getBytes());
            }

            // Read data from the file
            try (FileInputStream fis = new FileInputStream(file)) {
                byte[] buffer = new byte[(int) file.length()];
                int bytesRead = fis.read(buffer);
                String readData = new String(buffer, 0, bytesRead);
                System.out.println("Read data: " + readData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
