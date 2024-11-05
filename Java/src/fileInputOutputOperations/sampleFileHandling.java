package fileInputOutputOperations;

import java.io.*;
import java.util.Scanner;

public class sampleFileHandling {
    public static void main(String[] args) throws IOException {

        //we can read the file data by using these, we can use anything based on out interest
        // streams which useful for read the data called "Input Streams"
        // FileInputStream, Scanner, FileReader, BufferReader

        //now create file in Java by using - FileInputStream

        File file = new File("./sample.txt");
        if (!file.exists())
            file.createNewFile();

        FileInputStream fis = new FileInputStream(file);
        int asciicode;
        while ((asciicode = fis.read())!= -1){
            System.out.print((char)asciicode);
        }

        fis.close();
        System.out.println();
        System.out.println("-----------------------------------------------------------");


        //reading file by using Scanner method


        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()){
            System.out.println(" - "+scanner.nextLine());
        }

        System.out.println("________________________________________________");
        //reading file by FileReader method

        FileReader fr = new FileReader(file);
        String text = new String();
        while((asciicode = fr.read())!= -1){
            text += String.valueOf((char) asciicode);

        }
        System.out.println();
        System.out.println(text);
        fr.close();

        System.out.println("________________________________________________");
        //reading file by BufferReader method
        fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String text1 = new String();
        while ((asciicode = br.read()) != -1){
            text1 += String.valueOf((char) asciicode);
        }
        System.out.println(text1);
        System.out.println("________________________________________________");
        fr.close();
        br.close();

        // FileOutputStream & FileWriter are almost same, BufferReader is different compare with previous one


        FileWriter fileWriter = new FileWriter("output.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        bufferedWriter.write("This is the first line of data.");
                bufferedWriter.newLine();
        bufferedWriter.write("This is the second line of data.");
                bufferedWriter.newLine();
        bufferedWriter.write("Today");
        bufferedWriter.close();
        fileWriter.close();

        System.out.println("Data written to file successfully.");


    }
}
