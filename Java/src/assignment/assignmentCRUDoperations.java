package assignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class assignmentCRUDoperations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Map<Integer, String> crudmap = new HashMap<>();
        boolean exitcrudmap = false;

        while(!exitcrudmap){
            System.out.println("Enter the Operation with number. 1.Create - 2.Read - 3.Update - 4.Delete - 5.Exit");
            int operation = scanner.nextInt();
            scanner.nextLine();

            switch (operation){
                case 1:
                    System.out.println("create a Key, value pair");
                    System.out.println("Enter Key (Integer only): ");

                    while(!scanner.hasNextInt()){
                        System.out.println("Invalid Input");
                        scanner.next();
                    }

                    int key = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter Value: ");
                    String value = scanner.nextLine();
                    crudmap.put(key, value);
                    System.out.println("Data entered in CRUDMAP " + key + " : " + value);
                    break;
                case 2:
                    System.out.println("Read Data");
                    System.out.println("Enter key");

                    while (!scanner.hasNextInt()){
                        System.out.println("Invalid Input");
                        scanner.next();
                    }

                    key = scanner.nextInt();
                    value = crudmap.get(key);
                    if(value != null){
                        System.out.println("Data: "+key+" : "+value);
                    }else {
                        System.out.println("Key Not Found !");
                    }
                    break;

                case 3:
                    System.out.println("Update Data");
                    System.out.println("Enter Key");

                    while(!scanner.hasNextInt()){
                        System.out.println("Invalid Input");
                        scanner.next();
                    }

                    key = scanner.nextInt();
                    scanner.nextLine();
                    if (crudmap.containsKey(key)){
                        System.out.println("Enter New value");
                        value = scanner.nextLine();
                        crudmap.put(key, value);
                        System.out.println("Data Updated" + key + " : "+ value);
                    }else{
                        System.out.println("Key Not found");
                    }
                    break;

                case 4:
                    System.out.println("Delete the Data, you want");
                    System.out.println("Enter key (integer): ");

                    while (!scanner.hasNextInt()){
                        System.out.println("Invalid Input");
                        scanner.next();
                    }

                    key = scanner.nextInt();
                    if(crudmap.containsKey(key)){
                        crudmap.remove(key);
                        System.out.println("the Data deleted for the key" + key);
                    }else{
                        System.out.println("Key Not Found");

                    }
                    break;

                case 5:
                    exitcrudmap = true;
                    break;
                default:
                    System.out.println("Please Try Again !");
            }
        }

        scanner.close();
    }
}
