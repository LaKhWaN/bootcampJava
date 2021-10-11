package com.javaBootcamp;
import java.util.Scanner;

public class assignment1 {
    public static void main(String args[]){
        // Question 1. uncomment it
        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n:-> ");
        int n = sc.nextInt();
        System.out.print("Enter 1 (Print sum)\n2 (Print product)\nHere:-> ");
        int c = sc.nextInt();
        if(c==1){
            int total=0;
            for(int i=1; i<=n;i++) total = total+i;
            System.out.println("Sum ->"+total);
        } else if(c==2){
            int total=1;
            for(int i=1;i<=n;i++) total = total*i;
            System.out.println("Product->"+total);
        }
        */

        // Question 2.
        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x:-> ");
        int x = sc.nextInt();
        for(int i=1;i<=x;i++){
            if(((3*i)+2)%4 !=0)
            System.out.print((3*i)+2+" ");
        }
        */

        // Question 3.
        /*
        String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:-> ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int k=i-1;k<i+i-1;k++){
                System.out.print(alphabets.charAt(k));
            }
            System.out.println("");
        }
        */  

        // Question 4.

        /*Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1:-> ");
        int num1 = sc.nextInt();
        System.out.print("Enter num1:-> "); 
        int num2 = sc.nextInt();
        System.out.print("Enter operator :-> "); 
        String op = sc.next();
        switch (op) {
            case "+":
                System.out.println(num1+num2);
                break;
            case "-":
                System.out.println(num1-num2);
                break;
            case "*":
                System.out.println(num1*num2);
                break;
            case "/":
                System.out.println(num1/num2);
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }
        */

    }
}
