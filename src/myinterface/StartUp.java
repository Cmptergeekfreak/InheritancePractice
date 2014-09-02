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
public class StartUp {
  
     public static void main(String[] args) {

        HourlyEmployee employeeOne = new HourlyEmployee("Bob", 12, 10, 10);
        SalariedEmployee salaryOne = new SalariedEmployee("Sue", 34, 1000);
        SalaryPlusBonusEmployee salaryBonusOne = new SalaryPlusBonusEmployee("Diana", 56, 1000, 500);
        
        Employee[] employee = {employeeOne, salaryOne, salaryBonusOne};
        
        for(Employee e : employee){
            System.out.println("Employee Name: " + e.getEmployeeName());
            System.out.println("Employee ID: " + e.getEmployeeID());
            System.out.println("Employee Income: " + e.getAnnualWages());
            System.out.println("");
        }
        
    }
    
}
