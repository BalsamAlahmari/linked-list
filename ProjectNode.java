/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication121;

/**
 *
 * @author balso
 */
public class ProjectNode {
    String name,phNumber,firstDayOfWork,address; 
    double salary,workHours; 
    final int  ID; 
    ProjectNode next; 
 
    public ProjectNode(String name, int ID, String phNumber, 
            String firstDayOfWork, String address,  
            double salary, double workHours) 
        { 
        this.name = name; 
        this.ID = ID; 
        this.phNumber = phNumber; 
        this.firstDayOfWork = firstDayOfWork; 
        this.address = address; 
        this.salary = salary; 
        this.workHours = workHours; 
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setPhNumber(String phNumber) {
        this.phNumber = phNumber;
    }

    public void setFirstDayOfWork(String firstDayOfWork) {
        this.firstDayOfWork = firstDayOfWork;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setWorkHours(double workHours) {
        this.workHours = workHours;
    }

    public String getName() {
        return name;
    }

    public String getPhNumber() {
        return phNumber;
    }

    public String getFirstDayOfWork() {
        return firstDayOfWork;
    }

    public String getAddress() {
        return address;
    }

    public double getSalary() {
        return salary;
    }

    public double getWorkHours() {
        return workHours;
    }

    public int getID() {
        return ID;
    }
    
}
