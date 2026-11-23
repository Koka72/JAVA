
package edu.zuj.oop.week7.lecture1.newpackage;

public class GearBox {
    private boolean automatic;
    private int gearcount;

    public GearBox() {
    }

    public GearBox(boolean automatic, int gearcount) {
        this.automatic = automatic;
        this.gearcount = gearcount;
    }

    public boolean isAutomatic() {
        return automatic;
    }

    public int getGearcount() {
        return gearcount;
    }

    public void setAutomatic(boolean automatic) {
        this.automatic = automatic;
    }

    public void setGearcount(int gearcount) {
        this.gearcount = gearcount;
    }

    @Override
    public String toString() {
        return "GearBox{" + "automatic=" + automatic + ", gearcount=" + gearcount + '}';
    }
    
    
}
