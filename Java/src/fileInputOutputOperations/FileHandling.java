package fileInputOutputOperations;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

public class FileHandling {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\Asus\\OneDrive\\Desktop\\TestFiles\\resume.txt");
        System.out.println(f.createNewFile());
        System.out.println(f.isHidden());
        System.out.println(f.canRead());
        System.out.println(f.canWrite());
        //For creating folders also done by using File method only.
        // for file creating we use f.createNewFile
        // for Folder creating we use f.mkdir(), for multiple folders we use f.mkdirs()
//
//        for(String filename:f.list()){
//            System.out.println(filename);
//        }

        System.out.println(Arrays.toString(f.listFiles()));
        System.out.println(f.getParent());
        File f2 = new File(f.getParent()+"/resume2.docx");
       // File f3 = new File(f.getParent()+"/resume3.xlsx");
        System.out.println(f2.createNewFile());
      //  System.out.println(f3.createNewFile());
        System.out.println(new Date(f.lastModified()));
        System.out.println(f.isDirectory());
        System.out.println(f.isFile());
    }
}


