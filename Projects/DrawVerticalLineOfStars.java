package edu.zuj.oop.week3.lec1;

import java.util.Scanner;

public class DrawVerticalLineOfStars {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        System.out.print("Enter n: ");
int n = s.nextInt();

for (int i = 0; i < n; i++) {
    for (int j = 1; j < n; j++) {
        System.out.print("*");
    }
    System.out.println("*");
}
        
    
    
    
    
    
    
    
    
    
    }
    
}
