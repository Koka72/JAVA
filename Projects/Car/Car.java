
package edu.zuj.oop.week7.lecture1.newpackage;

public class Car {
    private String make;
    private int year;
    private Engine engine;
    private String color;
    private GearBox gearbox;

    public Car() {
    }

    public Car(String make, int year, Engine engine, String color, GearBox gearbox) {
        this.make = make;
        this.year = year;
        this.engine = engine;
        this.color = color;
        this.gearbox = gearbox;
    }

    public String getMake() {
        return make;
    }

    public int getYear() {
        return year;
    }

    public Engine getEngine() {
        return engine;
    }

    public String getColor() {
        return color;
    }

    public GearBox getGearbox() {
        return gearbox;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setGearbox(GearBox gearbox) {
        this.gearbox = gearbox;
    }

    @Override
    public String toString() {
        return "Car{" + "make=" + make + ", year=" + year + ", engine=" + engine + ", color=" + color + ", gearbox=" + gearbox + '}';
    }
    
    

   
}
