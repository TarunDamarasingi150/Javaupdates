package collectionPractice;

import javax.swing.text.html.parser.Entity;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class FileManager {
    public static void main(String[] args) throws IOException {
        File file = new File("dbConfig.properties");
        if(!file.exists()){
            file.createNewFile();
            System.out.println(file.exists());
        } else {
            System.out.println(file.exists());
        }

        Properties prop = new Properties();
        prop.setProperty("url", "localhost");
        prop.setProperty("user","Password");
        prop.setProperty("Device","Browser");
        FileOutputStream fos = new FileOutputStream(file);
        prop.store(fos,"New Prop File Created !");

        //Set<String> keys = prop.stringPropertyNames();
        Set<Object> keys = prop.keySet();
        System.out.println(keys);
        Collection<Object> values = prop.values();
        System.out.println(values);
        System.out.println(prop.getProperty("url"));

        //how to get data from files
        //by using Loops
        for(Object key : prop.keySet()){
            System.out.println(key+" "+prop.getProperty((String)key));
        }
        //by using direct print statement with variable name
        System.out.println(prop);

    }
}
