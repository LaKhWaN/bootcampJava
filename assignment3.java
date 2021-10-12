package com.javaBootcamp;

import java.util.Scanner;

public class assignment3 {
    public static void main(String args[]){
        // Code to get 1D Array as input
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++){
            arr[i] = sc.nextInt();
        }
        // Question 1

        // int total=0;
        // for(int i=0;i<5;i++) total+= arr[i];
        // System.out.println("Average:-> "+total/5);


        // Question 2

        // int min=arr[0];
        // int max=arr[0];
        // for(int i=0;i<5;i++){
        //     if(arr[i] < min) min=arr[i];
        //     if(arr[i] > max) max=arr[i];
        // }

        // System.out.println("Maximum: "+max+"\nMinimum: "+min);


        // Question 3
        // for(int i=0;i<5;i++){
        //     if(arr[i]%2==0) System.out.print(arr[i]+" ");
        // }

        // Question 4
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter number row here: ");
        // int row = sc.nextInt();
        // System.out.print("Enter number columns here: ");
        // int col = sc.nextInt();
        // int arr1[][] = new int[row][col];
        // for(int i=0;i<row;i++){
        //     for(int j=0;j<col;j++){
        //         arr1[i][j] = sc.nextInt();
        //     }
        // }
        // for(int i=0;i<row;i++){
        //     System.out.print("| ");
        //     for(int j=0;j<col;j++){
        //         System.out.print(arr1[i][j]+" ");
        //     }
        //     System.out.println("|");
        // }


        // Question 5 (Bubble Sort)

        // System.out.print("Unsorted array: ");
        // for(int i=0;i<5;i++) System.out.print(arr[i]+" ");
        // System.out.println();
        // for(int j=0;j<5;j++){
        //     for(int i=0;i<4;i++){
        //         if(arr[i] > arr[i+1]){
        //             int temp=arr[i];
        //             arr[i] = arr[i+1];
        //             arr[i+1] = temp;
        //         }
        //     }
        // }
        // System.out.print("Sorted array: ");
        // for(int i=0;i<5;i++) System.out.print(arr[i]+" ");


        // Question 6 (Selection Sort)

        // System.out.print("Unsorted array: ");
        // for(int i=0;i<5;i++) System.out.print(arr[i]+" ");
        // for(int i=0;i<5;i++){
        //     int idx=i;
        //     for(int j=i+1;j<5;j++){
        //         if(arr[idx] > arr[j]) idx=j;
        //     }
        //     int temp=arr[i];
        //     arr[i] = arr[idx];
        //     arr[idx] = temp;
        // }
        // System.out.print("\nSorted array: ");
        // for(int i=0;i<5;i++) System.out.print(arr[i]+" ");
    }
}
