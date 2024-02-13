public class Worker extends Person {
    private double hourlyPayRate;

    public Worker(String firstName, String lastName, String title, int YOB, double hourlyPayRate) {
        super(firstName, lastName, title, YOB);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double calculateWeeklyPay(double hoursWorked) {
        double regularHours = Math.min(40, hoursWorked);
        double overtimeHours = Math.max(0, hoursWorked - 40);
        double totalPay = (regularHours * hourlyPayRate) + (overtimeHours * hourlyPayRate * 1.5);
        return totalPay;
    }

    public String displayWeeklyPay(double hoursWorked) {
        double regularHours = Math.min(40, hoursWorked);
        double overtimeHours = Math.max(0, hoursWorked - 40);
        double regularPay = regularHours * hourlyPayRate;
        double overtimePay = overtimeHours * hourlyPayRate * 1.5;
        double totalPay = regularPay + overtimePay;
        return String.format("Weekly Pay: Total=%.2f, Regular=%.2f (%.2f hours), Overtime=%.2f (%.2f hours)",
                totalPay, regularPay, regularHours, overtimePay, overtimeHours);
    }
    public String toCSVDataRecord(){
        return  getFormalName() +  "," + getIDNum()  +  "," + getYOB();
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    @Override
    public String getFormalName() {
        return super.getFormalName();
    }

    @Override
    public int getYOB() {
        return super.getYOB();
    }
}