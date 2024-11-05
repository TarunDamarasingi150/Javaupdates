package assignment;

import java.util.ArrayList;
import java.util.Scanner;

class KeyValue {
    int key;
    String value;

    KeyValue(int key, String value) {
        this.key = key;
        this.value = value;
    }
}

public class assignmentCRUDoperationsArrayList {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<KeyValue> crudList = new ArrayList<>();
        boolean exitcrudList = false;

        while (!exitcrudList) {
            System.out.println("Enter the Operation with number. 1.Create - 2.Read - 3.Update - 4.Delete - 5.Exit");
            int operation = scanner.nextInt();
            scanner.nextLine();

            switch (operation) {
                case 1:
                    System.out.println("Create Key, Value Pair");
                    System.out.println("Enter key (Integer Only): ");
                    while (!scanner.hasNextInt()){
                        System.out.println("Invalid Input");
                        scanner.nextInt();
                    }

                    int key = scanner.nextInt();
                    System.out.println("Enter value:");
                    String value = scanner.nextLine();
                    crudList.add(new KeyValue(key,value));
                    System.out.println("Data Entered in crud List "+key+" : "+ value);
                    break;

                case 2:
                    System.out.println("Read Data");
                    System.out.println("Enter key");

                    while (!scanner.hasNextInt()) {
                        System.out.println("Invalid Input");
                        scanner.next();
                    }

                    key = scanner.nextInt();
                    KeyValue kv = null;
                    for (KeyValue item : crudList) {
                        if (item.key == key) {
                            kv = item;
                            break;
                        }
                    }
                    if (kv != null) {
                        System.out.println("Data: " + kv.key + " : " + kv.value);
                    } else {
                        System.out.println("Key Not Found !");
                    }
                    break;

                case 3:
                    System.out.println("Update Data");
                    System.out.println("Enter Key");

                    while (!scanner.hasNextInt()) {
                        System.out.println("Invalid Input");
                        scanner.next();
                    }

                    key = scanner.nextInt();
                    scanner.nextLine();
                    kv = null;
                    for (KeyValue item : crudList) {
                        if (item.key == key) {
                            kv = item;
                            break;
                        }
                    }
                    if (kv != null) {
                        System.out.println("Enter New value");
                        value = scanner.nextLine();
                        kv.value = value;
                        System.out.println("Data Updated " + kv.key + " : " + kv.value);
                    } else {
                        System.out.println("Key Not found");
                    }
                    break;

                case 4:
                    if(crudList.isEmpty()){
                        System.out.println("No Data");
                    }
                    else{

                    }
                    System.out.println("Delete the Data, you want");
                    System.out.println("Enter key (integer): ");

                    while (!scanner.hasNextInt()) {
                        System.out.println("Invalid Input");
                        scanner.next();
                    }

                    key = scanner.nextInt();
                    kv = null;
                    for (KeyValue item : crudList) {
                        if (item.key == key) {
                            kv = item;
                            break;
                        }
                    }
                    if (kv != null) {
                        crudList.remove(kv);
                        System.out.println("The Data deleted for the key " + key);
                    } else {
                        System.out.println("Key Not Found");
                    }
                    break;

                case 5:
                    exitcrudList = true;
                    break;
                default:
                    System.out.println("Please Try Again !");
            }
        }

        scanner.close();
    }
}
