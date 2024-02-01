public class Worker extends Person {
    private double hourlyPayRate;

    public Worker(String firstName, String lastName, String ID, String title, int YOB, double hourlyPayRate) {
        super(firstName, lastName, ID, title, YOB);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double calculateWeeklyPay(double hoursWorked) {
        double totalPay;
        if (hoursWorked > 40) {
            double overtimeHours = hoursWorked - 40;
            totalPay = (hourlyPayRate * 40) + (hourlyPayRate * 1.5 * overtimeHours);
        } else {
            totalPay = hourlyPayRate * hoursWorked;
        }
        return totalPay;
    }

    public String displayWeeklyPay(double hoursWorked) {
        double totalPay = calculateWeeklyPay(hoursWorked);
        return String.format("Weekly Pay: %.2f", totalPay);
    }
}