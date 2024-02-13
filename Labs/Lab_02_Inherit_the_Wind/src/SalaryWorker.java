public class SalaryWorker extends Worker {
    private double annualSalary;

    public SalaryWorker(String firstName, String lastName, String title, int YOB, double hourlyPayRate, double annualSalary) {
        super(firstName, lastName, title, YOB, hourlyPayRate);
        this.annualSalary = annualSalary;
    }
    public String toCSVDataRecord(){
        return  getFormalName() +  "," + getIDNum()  +  "," + getYOB() +"," +this.annualSalary;
    }
    @Override
    public double calculateWeeklyPay(double hoursWorked) {
        return annualSalary / 52;
    }

    @Override
    public String displayWeeklyPay(double hoursWorked) {
        double weeklyPay = calculateWeeklyPay(hoursWorked);
        return String.format("Weekly Pay (fraction of yearly salary): %.2f", weeklyPay);
    }

}