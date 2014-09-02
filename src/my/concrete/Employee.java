/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package my.concrete;

/**
 *
 * @author Joe
 */
public class Employee{
    
    private int employeeID;
    private String employeeName;
    private String employeeJobTitle;

    public Employee(int employeeID, String employeeName, String employeeJobTitle) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.employeeJobTitle = employeeJobTitle;
    }

    /**
     * @return the employeeID
     */
    public int getEmployeeID() {
        return employeeID;
    }

    /**
     * @param employeeID the employeeID to set
     */
    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    /**
     * @return the employeeName
     */
    public String getEmployeeName() {
        return employeeName;
    }

    /**
     * @param employeeName the employeeName to set
     */
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    /**
     * @return the employeeJobTitle
     */
    public String getEmployeeJobTitle() {
        return employeeJobTitle;
    }

    /**
     * @param employeeJobTitle the employeeJobTitle to set
     */
    public void setEmployeeJobTitle(String employeeJobTitle) {
        this.employeeJobTitle = employeeJobTitle;
    }
    
    
    
    
    
    
}
