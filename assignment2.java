package com.javaBootcamp;

class area {
    public static double circle(int r){
        double area;
        area = 3.14*r*r;
        return area;
    }
    public static double rectangle(int l, int b){
        double area;
        area = l*b;
        return area;
    }
    public static double square(int s){
        double area;
        area = s*s;
        return area;
    }
}

public class assignment2 {
    // Question 2
    public static void printTable(int n){
        for(int i=1; i<=10;i++) System.out.println(n+" X "+i+" = "+n*i);
    }
    // Question 3
    public static void fibonacci(int n){
        int n1 = 0;
        int n2 = 1;
        int temp=0;
        System.out.print(n1+" ");
        for(int i=1;i<=n;i++){
            System.out.print(n2+" ");
            temp = n2;
            n2 = n1 + n2;
            n1 = temp;
        }
    }
    // Question 4
    public static boolean evenOrOdd(int n){
        if(n%2 == 0) return true;
        else return false;
    }
    public static void main(String args[]){
        // Question 1
        System.out.println(area.circle(5));
        System.out.println(area.rectangle(2,4));
        System.out.println(area.square(5));


        // Question 2
        // printTable(7);

        // Question 3
        // fibonacci(12);

        // Question 4
        // System.out.println(evenOrOdd(10));
          
    }
}
