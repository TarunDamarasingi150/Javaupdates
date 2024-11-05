package assignment;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class assignementCRUDoperationsSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> crudset = new HashSet<>();
        boolean exitcrudset = false;

        while (!exitcrudset) {
            System.out.println("Enter the Operation with Number");
            System.out.println("1.Create - 2.Read  3.Delete 4.Exit");
            int operation = scanner.nextInt();
            scanner.nextLine();

            switch (operation) {
                case 1:
                    System.out.println("Enter the number of elements in set");
                    int n = scanner.nextInt();
                    for (int i = 0; i < n; i++) {
                        System.out.println("Enter the value for creating Set");
                        while (!scanner.hasNextInt()) {
                            System.out.println("please enter Integers");
                            scanner.next();
                        }
                        int value = scanner.nextInt();
                        crudset.add(value);
                    }
                    System.out.println("Your Set: " + crudset);
                    break;

                case 2:
                    System.out.println("The elements in the set are: " + crudset);
                    break;

                case 3:
                    System.out.println("Enter the value to delete from the set");
                    while (!scanner.hasNextInt()) {
                        System.out.println("please enter Integers");
                        scanner.next();
                    }
                    int valueToDelete = scanner.nextInt();
                    if (crudset.remove(valueToDelete)) {
                        System.out.println("Value " + valueToDelete + " removed from the set.");
                    } else {
                        System.out.println("Value " + valueToDelete + " not found in the set.");
                    }
                    System.out.println("Your Set: " + crudset);
                    break;

                case 4:
                    exitcrudset = true;
                    break;

                default:
                    System.out.println("Invalid Input");
            }
        }
    }
}
