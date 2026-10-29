package edu.zuj.oop.week3.lec2;

import java.util.Scanner;

public class NumberStatistics {
    public static void main(String[] args) {
                Scanner s=new Scanner(System.in);

                
                
        System.out.print("Enter How Many numbers : ");
                int n=s.nextInt();
                
                int a[]=new int[n];
                for (int i = 0; i < a.length; i++) {
                    System.out.print("Enter the value of "+(i+1)+" : ");
                    a[i]=s.nextInt();
        }
                int sum=0;
                int max=a[0];
                int min=a[0];
                double avg=0;
                
                System.out.println("==============================");
                
                System.out.print("sum = ");
                
                for (int i = 0; i < a.length; i++) {
            sum+=a[i];
                    
        }
                System.out.println(sum);
                
                System.out.print("max = ");
                for (int i = 0; i < a.length; i++) {
            if(a[i]>max){max=a[i];}
        }
                System.out.println(max);
                
                
                
                System.out.print("min = ");
                for (int i = 0; i < a.length; i++) {
            if(a[i]<min){min=a[i];}
        }
                System.out.println(min);
                
                
                
                System.out.print("avg = ");
                 avg=(double)sum/(double)a.length;
                 System.out.println(avg);
                
                System.out.println("==============================");



        System.out.print("the array is : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }



                
                
    }
}
