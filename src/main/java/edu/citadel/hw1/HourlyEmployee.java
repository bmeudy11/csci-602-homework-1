package edu.citadel.hw1;

import java.time.LocalDate;


//represents employee who is paid hourly
public class HourlyEmployee extends Employee {
    private double wageRate;
    private double hoursWorked;

    /**
     * Public constructor that initializes all four fields (two
     * declared in this class and two inherited from class `Employee`)
     *
     * @param name
     * @param hireDate
     * @param wageRate
     * @param hoursWorked
     */
    public HourlyEmployee(String name, LocalDate hireDate, double wageRate, double hoursWorked)
    {
        //call the Employee constructor to initialize name and hireDate
        super(name, hireDate);

        //initialize HourlyEmployee
        this.wageRate = wageRate;
        this.hoursWorked = hoursWorked;
    }

    //getter for wageRate
    public double getWageRate() {
        return wageRate;
    }

    //getter for hoursWorked
    public double getHoursWorked() {
        return hoursWorked;
    }

    /**
     * Public method `getMonthlyPay()` that overrides the method from the superclass
     * For this class monthly pay is computed as `wageRate` times hoursWorked
     * @return total monthly pay as double
     */
    @Override
    public double getMonthlyPay() {
        return hoursWorked * wageRate;
    }

    /**
     * Public method `toString()` that returns a string of the form
     * overrides the default toString() to return custom string
     * @return string `"HourlyEmployee[name=John Doe, hireDate=2009-05-21, wageRate=50.5, hoursWorked=160.0]"`
     */
    @Override
    public String toString() {
        return "HourlyEmployee[name=" + getName() + ", hireDate=" + getHireDate() +
                ", wageRate=" + wageRate + ", hoursWorked=" + hoursWorked + "]";
    }

    /**
     * Public methods `hashCode()`, overrides the hashCode method
     * @param object to compare against
     * @return has code integer based on all fields
     */


    /**
     * Public methods `equals()`, overrides the equals method
     * @return if objects are equal = true, else false
     */
}
