package edu.zuj.oop.week3.lec1;

import java.util.Scanner;

public class PrintPrimaryNumbers {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        
        System.out.print("enter the number : ");
        int n=s.nextInt();

         for (int i = 1; i < n; i++) {
         int counter = 0;

         for (int j = 1; j <= i; j++) {
         if(i%j==0) {
            counter++;
        }
    }

         if(counter==2) {
        System.out.println(i+" is a primary number");
    }
}
    
    
    
    
    
    
    
    }}

