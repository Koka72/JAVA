
package edu.zuj.oop.week6.lecture1;

public class Employee {
    private int id;
    private String name;
    private int basic;
    private int deductions;
    private int allownces;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + name + ", basic=" + basic + ", deductions=" + deductions + ", allownces=" + allownces + '}';
    }

    public Employee(int id, String name, int basic, int deductions, int allownces) {
        this.id = id;
        this.name = name;
        this.basic = basic;
        this.deductions = deductions;
        this.allownces = allownces;
    }

    public Employee() {
    }

    public void setBasic(int basic) {
        this.basic = basic;
    }
    
    public int CalculateTotalSalary(){
        int salary=basic+allownces-deductions;
            return salary;
    }

    public void setDeductions(int deductions) {
        this.deductions = deductions;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBasic() {
        return basic;
    }

    public int getDeductions() {
        return deductions;
    }

    public int getAllownces() {
        return allownces;
    }

    public void setAllownces(int allownces) {
        this.allownces = allownces;
    }
    
    
    
}
