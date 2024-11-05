package assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//Sorting of Elements

public class assignmentSorting {
    public static void main(String[] args) {


        //if you want to sort the alphabets then use "String" in place of Integer & use nextline in place of nextInt

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Count of elements:");
        int n = scanner.nextInt();
        System.out.println("Now enter the Items for Sorting in Ascending & Descending Order");
        ArrayList<Integer> elements = new ArrayList<>();
        System.out.println("Enter the Elements: ");
        for(int i=0; i<n; i++){
            elements.add(scanner.nextInt());
        };

        //ascending order
        Collections.sort(elements);
        System.out.println("Ascending Order"+ elements);

        //descending order
        Collections.sort(elements, Collections.reverseOrder());
        System.out.println("Descending Order" + elements);
    }
}
