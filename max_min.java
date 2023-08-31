/* Write a Java program to find the minimum and maximum value of an array which can 
store ‘n’ numbers. */

import java.util.Scanner;
public class max_min {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n,max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        System.out.println("Enter how many numbers do you want: ");
        n=inp.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the values of arrays :");
        for(int i=0;i<n;i++){
            arr[i]=inp.nextInt();
            if(arr[i]>max)
                max=arr[i];
            else if(arr[i]<min)
                min=arr[i];
        }
        System.out.println("The maximum number is :"+max);
        System.out.println("The minimum number is :"+min);
    }
}
