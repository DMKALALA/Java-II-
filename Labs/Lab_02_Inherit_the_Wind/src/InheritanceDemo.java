import java.io.IOException;
import java.util.ArrayList;

public class InheritanceDemo {
    public static void main(String[] args) {
        ArrayList<Worker> totalWorkers = new ArrayList<>();

        totalWorkers.add(new SalaryWorker("Bill", "Lateman", "Mr.", "000", 1984, 0,50000));
        totalWorkers.add(new SalaryWorker("Human","Name","Mr.","001",1990,0,50000));
        totalWorkers.add(new SalaryWorker("Julian","Spears","Officer","002",1985,0,50000));
        totalWorkers.add(new Worker("Jason","Tod","Mr.","003",1963,30));
        totalWorkers.add(new Worker("Tim","Drake","Mr.","004",1976,30));
        totalWorkers.add(new Worker("Dick","Grayson","Mr.","005",1953,30));
        System.out.println();
        System.out.println("Week 1:");
        for (Worker totalWorker : totalWorkers) {
            String moneyWeek = totalWorker.displayWeeklyPay(40);
            System.out.println(totalWorker.getformalname()+":");
            System.out.println(moneyWeek);
        }
        System.out.println();
        System.out.println("Week 2:");
        for (Worker totalWorker : totalWorkers) {
            String moneyWeek = totalWorker.displayWeeklyPay(50);
            System.out.println(totalWorker.getformalname()+":");
            System.out.println(moneyWeek);
        }
        System.out.println();
        System.out.println("Week 3:");
        for (Worker totalWorker : totalWorkers) {
            String moneyWeek = totalWorker.displayWeeklyPay(40);
            System.out.println(totalWorker.getformalname()+":");
            System.out.println(moneyWeek);
        }
    }
}