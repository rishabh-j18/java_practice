/*Design a Java program to get ‘n’ numbers and store them in an array. Find the count 
of numbers which are divisible by 3. Display it*/

import java.util.Scanner;
public class div_by_3 {

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n, count=0;
        System.out.println("Enter how many numbers do you want: ");
        n=inp.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            int temp;
            System.out.print("Enter number "+(i+1)+" value \t");
            temp=inp.nextInt();
            if(temp%3==0&&temp>0){
                arr[count]=temp;
                count++;
            }
            else
                continue;          
        }
        System.out.println("The Numbers Divisible by 3 are:");
        for(int i=0;i<count;i++){
            System.out.println(arr[i]);
        }

    }
}