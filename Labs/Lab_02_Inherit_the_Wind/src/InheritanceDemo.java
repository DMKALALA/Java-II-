import java.util.ArrayList;
import java.util.Scanner;

public class InheritanceDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Worker> workers = new ArrayList<>();
        boolean done = false;


        do {
            String firstName = SafeInput.getNonZeroLenString(in, "What is your first name");
            String lastName = SafeInput.getNonZeroLenString(in, "What is your last name");
            String title = SafeInput.getNonZeroLenString(in, "What is your Title?");
            int YOB = SafeInput.getRangedInt(in, "What is the date of your birth ", 1000, 3000);
            double hourlyPayRate = SafeInput.getDouble(in, "What is your hourly pay rate");
            String workerType = SafeInput.getNonZeroLenString(in, "What type of worker? [SalaryWorker or Worker]");

            if (workerType.equalsIgnoreCase("worker")) {
                Worker worker = new Worker(firstName, lastName, title, YOB, hourlyPayRate);
                workers.add(worker);
            } else if (workerType.equalsIgnoreCase("salary worker")) {
                double hoursWorked = SafeInput.getDouble(in, "What is your hours worked");
                SalaryWorker salaryWorker = new SalaryWorker(firstName, lastName, title, YOB, hourlyPayRate, annualSalary);
                workers.add(salaryWorker);
            }

            done = SafeInput.getYNConfirm(in, "Are you done adding data?");
            System.out.println();
        } while (!done);

        int[] weeklyHours = {40, 50, 40};

        for (int week = 1; week <= 3; week++) {
            System.out.println("Week " + week + " Pay:");
            for (Worker worker : workers) {
                double hoursWorked = weeklyHours[week - 1];
                System.out.println(worker.toCSVDataRecord() + ": " + worker.displayWeeklyPay(hoursWorked));
            }
            System.out.println();
        }



    }
}
