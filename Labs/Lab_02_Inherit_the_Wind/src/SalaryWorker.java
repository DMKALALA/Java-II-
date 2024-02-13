public class SalaryWorker extends Worker{
    private double annualSalary;

    public SalaryWorker(String firstname, String lastname, String title, String ID, int YOB, double hourlyPayRate, double annualSalary) {
        super(firstname, lastname, title, ID, YOB, hourlyPayRate);
        this.annualSalary = annualSalary;
    }
    @Override
    public double calculateWeeklyPay(double hoursWorked){
        return annualSalary/52;
    }
    @Override
    public String displayWeeklyPay(double hoursWorked){
        return "Total weekly pay: " + (annualSalary/52);
    }

}