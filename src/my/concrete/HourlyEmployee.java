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
public class HourlyEmployee extends Employee  {

    private double hourlyRate;
    private double totalHrsForYear;

    public HourlyEmployee(double hourlyRate, double totalHrsForYear, int employeeID, String employeeName, String employeeJobTitle) {
        super(employeeID, employeeName, employeeJobTitle);
        this.hourlyRate = hourlyRate;
        this.totalHrsForYear = totalHrsForYear;
    }    

    public double getAnnualWages() {
        return hourlyRate * totalHrsForYear;
    }
    
}
