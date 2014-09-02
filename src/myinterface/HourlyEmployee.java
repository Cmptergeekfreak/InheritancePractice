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
public final class HourlyEmployee implements Employee {
    
      private int employeeID;
    private String employeeFullName;
    private double hourlyRate;
    private double totalHrsForYear;
    
    
    public HourlyEmployee(String employeeFullName, int employeeID, double hourlyRate, double totalHrsForYear) {
        this.employeeFullName = employeeFullName;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.totalHrsForYear = totalHrsForYear;
    }

    @Override
    public final double getAnnualWages() {
        return hourlyRate * totalHrsForYear;
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
