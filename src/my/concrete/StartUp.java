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
public class StartUp {
    
    public static void main(String[] args) {
          
        
        
        HourlyEmployee emp = new HourlyEmployee(10, 10, 1234, "Bob", "Fin Tech");
        SalariedEmployee sEmp = new SalariedEmployee(1000, 5678, "Sue", "Press");
        SalaryPlusBonusEmployee sbEmp = new SalaryPlusBonusEmployee(1000, 500, 9011, "Diana", "Computer Programmer");

        System.out.println("Employee ID: " + emp.getEmployeeName() + "\nEmployee Name: " + emp.getEmployeeName()
                + "\nEmployee Job: " + emp.getEmployeeJobTitle() + "\nEmployee Wage: " + emp.getAnnualWages());
        System.out.println("");
        System.out.println("Employee ID: " + sEmp.getEmployeeID() + "\nEmployee Name: " + sEmp.getEmployeeName()
                + "\nEmployee Job: " + sEmp.getEmployeeJobTitle() + "\nEmployee Salary: " + sEmp.getAnnualSalary());
        System.out.println("");
        System.out.println("Employee ID: " + sbEmp.getEmployeeID() + "\nEmployee Name: " + sbEmp.getEmployeeName()
                + "\nEmployee Job: " + sbEmp.getEmployeeJobTitle() + "\nEmployee Salary With Bonus: " + sbEmp.getTotalSalary());
    }
}
