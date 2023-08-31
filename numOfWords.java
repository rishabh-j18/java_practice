/* Write a Java program to find the number of words in a given string. Display the number 
of words in the given string. */
import java.util.Scanner;
public class numOfWords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String:");
        String str=sc.nextLine();
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' ')
                count++;
        }
        System.out.println("Total words are : "+(count+1));
    }
}
