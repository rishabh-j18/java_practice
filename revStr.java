/* Write a Java program to get a string as input. Reverse the given string and store the 
result in a new string. */

import java.util.Scanner;
public class revStr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String :\t");
        String str=sc.nextLine();
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        System.out.println("Reversed string is :\t"+rev);
    }
}
