/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myinterface;

/**
 *
 * @author Joe
 */
public class SalariedEmployee implements Employee {
   private int employeeID;
    private String employeeFullName;
    private double annualSalary;

    public SalariedEmployee(String employeeFullName, int employeeID, double annualSalary) {
        this.employeeFullName = employeeFullName;
        this.employeeID = employeeID;
        this.annualSalary = annualSalary;
    }

    @Override
    public double getAnnualWages() {
        return annualSalary;
    }
    
    @Override
    public String getEmployeeName() {
        return employeeFullName; 
    }
    
    @Override
    public int getEmployeeID() {
        return employeeID;
    }
}
