public class Worker extends Person{
    private double hourlyPayRate;

    public Worker(String firstname, String lastname, String title, String ID, int YOB, double hourlyPayRate ) {
        super(firstname, lastname, title, ID, YOB);
        this.hourlyPayRate = hourlyPayRate;
    }

    private double hoursWorked;

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double calculateWeeklyPay(double hoursWorked){
        if(hoursWorked <= 40){
            return hoursWorked*hourlyPayRate;
        }else{
            return (hourlyPayRate*1.5)*hoursWorked;
        }
    }

    public String displayWeeklyPay(double hoursWorked){
        if(hoursWorked <= 40) {
            return "Regular Pay: "+(hoursWorked*hourlyPayRate)+"("+hoursWorked+ " hours) Overtime: 0.0(0.0 hours) " + "Total: " + (hoursWorked*hourlyPayRate)+"("+hoursWorked+ " hours)";
        }else{
            return "Regular Pay: "+(40*hourlyPayRate)+"(40.0 hours) Overtime: " +((hoursWorked-40)*hourlyPayRate)+"("+(hoursWorked-40) + " hours) " + "Total: " + (hoursWorked*hourlyPayRate)+"("+hoursWorked+ " hours)";
        }
    }

}