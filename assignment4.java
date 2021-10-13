package com.javaBootcamp;

import java.util.Scanner;

class Factory{
    int machine;
    int labourer;

    public void manufacturing(){
        System.out.println("Inside Manufacturing function using Object!");
    }
    public void working(){
        System.out.println("Of course this code is wokring :)");
    }
}
public class assignment4 {
    public static int linearSearch(int arr[],int key){
        int idx=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == key){
                idx=i;
            }
        }
        return idx;
    }
    public static int binarySearch(int arr[],int search){
        int first = 0;
        int last = arr.length-1;
        while(first<=last){
            int mid = (first+last)/2;
            if(arr[mid] == search) return mid;
            else if(search>arr[mid]) first = mid+1;
            else if(search<arr[mid]) last = mid-1;
        }
        return -1;
    }
    public static void main(String args[]){
        // Question 1

        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the key to search in the array:-> ");
        int n = sc.nextInt();
        int arr[] = {10, 89, 24, 65, 11,56, 21};
        System.out.println("Index: "+linearSearch(arr,n));
        */


        // Question 2

        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the key to search in the array:-> ");
        int n = sc.nextInt();
        int arr[] = {10,20,25,30,55,65,90};
        System.out.println("Index: "+binarySearch(arr,n));
        */


        // Question 3

        /*
        Factory fac1 = new Factory();
        fac1.labourer=2;
        fac1.machine=2;
        fac1.manufacturing();
        fac1.working();
        */
    }
}
