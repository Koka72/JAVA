
package edu.zuj.oop.week7.lecture1.newpackage;

public class CarFactory {
    public static void main(String[] args) {
        Engine e1=new Engine(8, 5409, 500);
        GearBox g1=new GearBox(true, 7);
        Car c1=new Car();
        c1.setColor("Red");
        c1.setEngine(e1);
        c1.setMake("Shelby GT500");
        c1.setYear(2009);
        
        System.out.println(c1);
    }
}
