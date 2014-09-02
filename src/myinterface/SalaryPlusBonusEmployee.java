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
public class SalaryPlusBonusEmployee implements Employee {
    private int employeeID;
    private double annualSalary;
    private double annualBonus;
    private String employeeFullName;

    public SalaryPlusBonusEmployee(String employeeFullName, int employeeID, double annualSalary, double annualBonus) {
        this.employeeFullName = employeeFullName;
        this.employeeID = employeeID;
        this.annualSalary = annualSalary;
        this.annualBonus = annualBonus;
    }

    @Override
    public double getAnnualWages() {
        return annualBonus + annualSalary;
    }

    @Override
    public String getEmployeeName() {
        return employeeFullName;
    }

    @Override
    public int getEmployeeID() {
        return employeeID;
    }

    public String getEmployeeFullName() {
        return employeeFullName;
    }

    public void setEmployeeFullName(String employeeFullName) {
        this.employeeFullName = employeeFullName;
    }
    
}
