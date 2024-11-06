package assignment;

import java.util.Scanner;

public class assignmentTwo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = scanner.nextLine();
        String LargestPalindrome = "";

        for (int i=0; i<str.length(); i++){

            String Palindrome1 = findPalindrome(str,i,i);
            String Palindrome2 = findPalindrome(str,i,i+1);

            if (Palindrome1.length() > LargestPalindrome.length()){
                LargestPalindrome = Palindrome1;
            }
            if(Palindrome2.length() > LargestPalindrome.length()){
                LargestPalindrome = Palindrome2;
            }

        }
        System.out.println("The largest Palindrome of Given String is : "+ LargestPalindrome);
    }

    public static String findPalindrome(String str,int leftside,int rightside){
            while(leftside >=0 && rightside < str.length() && str.charAt(leftside) == str.charAt(rightside)){
                leftside --;
                rightside ++;
            }
            return str.substring(leftside+1,rightside);
    }
}

