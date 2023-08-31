/*Create a Java program to add two matrices and print the result. Use two dimensional 
array. Get the input from user and apply the necessary conditions. */

import java.util.Scanner;
public class add_matrice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows,cols;
        System.out.print("Enter the number of rows: ");
        rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        cols = sc.nextInt();
        int[][] mat1 = new int[rows][cols];
        int[][] mat2 = new int[rows][cols];
        System.out.println("Enter elements for Matrix 1:");
        for (int i = 0;i<rows;i++) {
            for (int j=0;j<cols;j++) {
                mat1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter elements for Matrix 2:");
        for (int i = 0;i<rows;i++) {
            for (int j=0;j<cols;j++) {
                mat2[i][j] = sc.nextInt();
            }
        }
        System.out.println("The sum of the both matrices is :");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(mat1[i][j]+mat2[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
