
package edu.zuj.oop.week7.lecture1.newpackage;

public class Engine {
    
    private int celender;
    private int capacity;
    private int hp;

    public Engine() {
    }

    public Engine(int celender, int capacity, int hp) {
        this.celender = celender;
        this.capacity = capacity;
        this.hp = hp;
    }

    public int getCelender() {
        return celender;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getHp() {
        return hp;
    }

    public void setCelender(int celender) {
        this.celender = celender;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "Engine{" + "celender=" + celender + ", capacity=" + capacity + ", hp=" + hp + '}';
    }
    
    
}
