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
public class SalaryPlusBonusEmployee extends Employee {
    
     private double annualSalary;
    private double annualBonus;

    public SalaryPlusBonusEmployee(double annualSalary, double annualBonus, int employeeID, String employeeName, String employeeJobTitle) {
        super(employeeID, employeeName, employeeJobTitle);
        this.annualBonus = annualBonus;
        this.annualSalary = annualSalary;
    }
    
    public double getTotalSalary(){
        return annualSalary + annualBonus;
    }
    
    /**
     * @return the annualBonus
     */
    public double getAnnualBonus() {
        return annualBonus;
    }

    /**
     * @param annualBonus the annualBonus to set
     */
    public void setAnnualBonus(double annualBonus) {
        this.annualBonus = annualBonus;
    }

    /**
     * @return the annualSalary
     */
    public double getAnnualSalary() {
        return annualSalary;
    }

    /**
     * @param annualSalary the annualSalary to set
     */
    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }
}
