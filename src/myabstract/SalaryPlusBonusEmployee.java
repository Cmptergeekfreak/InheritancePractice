/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myabstract;

/**
 *
 * @author Joe
 */
public class SalaryPlusBonusEmployee extends Employee {
  private double annualBonus;
    

    public SalaryPlusBonusEmployee(double annualBonus) {
        this.annualBonus = annualBonus;
    }

    @Override
    public void getAnnualWages() {
       
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
    
}
