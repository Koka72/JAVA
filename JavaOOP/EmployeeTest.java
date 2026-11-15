
package edu.zuj.oop.week6.lecture1;

import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1=new Employee(333, "Ahmed", 22, 2121, 2444);
        System.out.println(e1);
        System.out.println(e1.CalculateTotalSalary());
        Scanner s=new Scanner(System.in);
        
        
        Employee e2=new Employee();
        System.out.println("id = ");
        e2.setId(s.nextInt());
        System.out.println("Allownces = ");
        e2.setAllownces(s.nextInt());
        System.out.println("Basic = ");
        e2.setBasic(s.nextInt());
        System.out.println("Deductions = ");
        e2.setDeductions(s.nextByte());
        System.out.println("Name = ");
        e2.setName(s.next());
        System.out.println(e2);
        System.out.println(e1.CalculateTotalSalary());
    }
  
}
