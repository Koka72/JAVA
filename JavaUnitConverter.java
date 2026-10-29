package edu.zuj.oop.week2.lec2;

import java.util.Scanner;

public class JavaUnitConverter {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        System.out.print("Enter a number : ");
        double x=s.nextDouble();
        
        System.out.println("1- Convert from CM to Inche");
        System.out.println("2- Convert from Inche to CM");
        System.out.println("3- Convert from M to Feet");
        System.out.println("4- Convert from Feet to M");
        System.out.println("5- Convert from Dunum to Hectare");
        System.out.println("6- Convert from Hectare to Dunum");
        System.out.println("7- convert from C° to F°");
        System.out.println("8- Convert from F° to C°");
        
        System.out.print("Choose the operation : ");
        int ch=s.nextInt();
        double result=0;
        switch (ch) {
            case 1:
                result=x/2.54;
                break;
            case 2:
                result=x*2.54;
                break;
            case 3:
                result=x*3.281;
                break;
            case 4:
                result=x/3.281;
                break;
            case 5:
                result=x/10.0;
                break;
            case 6:
                result=x*10.0;
                break;
            case 7:
                result=((x*1.8)+32);
                break;
            case 8:
                result=((x-32)*(5.0/9.0));
                break;
            default:
                System.out.println("Invalid operation!!");
                break;
        }
        if(ch>0&&ch<9){System.out.println("result = "+result);}
    }
}
