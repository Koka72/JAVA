package edu.zuj.oop.week3.lec1;

import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
                Scanner s=new Scanner(System.in);

                
                
                System.out.print("enter * : ");
int n = s.nextInt();

for (int i = 1; i <= n; i++) {
    for (int j = i; j < n; j++) {
        System.out.print(" ");
    }
    for (int j = 1; j <= 2 * i - 1; j++) {
        System.out.print("*");
    }
    System.out.println();
}

for (int i = n - 1; i >= 1; i--) {
    for (int j = i; j < n; j++) {
        System.out.print(" ");
    }
    for (int j = 1; j <= 2 * i - 1; j++) {
        System.out.print("*");
    }
    System.out.println();
}
                
                
                
                
                
    }
  
}
