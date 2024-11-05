package assignment;

import java.util.ArrayList;
import java.util.Arrays;

public class JavaTasks {

    public static void main(String[] args) {
        //1.WAP to print sum & average of elements present in list.

        Integer[] problem1 = {4,5,0,9,8,10};
        ArrayList<Integer> values = new ArrayList<>(Arrays.asList(problem1));
        //System.out.println(values);
        int sum = 0;
        for(Integer eachnum : values){
            sum += eachnum;
        }
        int average = 0;
        average = sum/values.size();
        System.out.println("Sum: "+sum + "Average: "+average);



        //2.WAP to print sum of even numbers in a list

        int evenSum = 0;
        for(Integer evenNum : values){
            if (evenNum%2 == 0){
                evenSum += evenNum;
            }
        }
        System.out.println("Sum of even numbers of given list:" + evenSum);

        //3. WAP to split a list into a two lists

        ArrayList<Integer>  halfList1 = new ArrayList<>(Arrays.asList(problem1).subList(0,3));
        ArrayList<Integer> halflist2 = new ArrayList<>(Arrays.asList(problem1).subList(3,problem1.length));
        System.out.println(halflist2);
        System.out.println(halfList1);

        //4. merging 2 strings a single string

        ArrayList<Integer> mergedString = new ArrayList<>(halfList1);
        //System.out.println(mergedString);
        mergedString.addAll(halflist2); // used addAll beacuse, we entered a collection of elements
        System.out.println(mergedString);


        //5.WAP to print the repeated /duplicate elements along with its repetition count
        String [] Items = {"baby","ball","soap","baby", "shampoo", "chalk", "soap","makeup","baby","lotion"};
        ArrayList<String> ItemsList = new ArrayList<>(Arrays.asList(Items));
        System.out.println(ItemsList);



    }
}
