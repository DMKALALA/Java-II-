import java.util.ArrayList;

public class InheritanceDemo {
    public static void main(String[] args) {
        ArrayList<Worker> workers = new ArrayList<>();
        workers.add(new Worker("John", "Doe", "001", "Mr.", 1980, 20.0));
        workers.add(new Worker("Jane", "Doe", "002", "Mrs.", 1985, 25.0));
        workers.add(new Worker("Jim", "Smith", "003", "Mr.", 1975, 30.0));
        workers.add(new SalaryWorker("Alice", "Johnson", "004", "Ms.", 1990, 15.0, 60000));
        workers.add(new SalaryWorker("Bob", "Williams", "005", "Mr.", 1982, 18.0, 80000));
        workers.add(new SalaryWorker("Carol", "Brown", "006", "Dr.", 1988, 12.0, 90000));

        int[] weeklyHours = {40, 50, 40};

        for (int week = 1; week <= 3; week++) {
            System.out.println("Week " + week + " Pay:");
            for (Worker worker : workers) {
                double hoursWorked = weeklyHours[week - 1];
                System.out.println(worker.formalName() + ": " + worker.displayWeeklyPay(hoursWorked));
            }
            System.out.println();
        }
    }
}