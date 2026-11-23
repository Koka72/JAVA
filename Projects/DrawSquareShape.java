package edu.zuj.oop.week3.lec1;

import java.util.Scanner;

public class DrawSquareShape {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter the amount of * : ");
        int n=s.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
    }
    
}
