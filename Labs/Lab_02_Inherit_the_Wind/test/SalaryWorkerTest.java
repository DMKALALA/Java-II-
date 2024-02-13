import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SalaryWorkerTest {
    SalaryWorker sW1, sW2, sW3;
    @BeforeEach
    void setup(){
        sW1 = new SalaryWorker("Human","Name","Mr.","001",1990,14,52000);
        sW2 = new SalaryWorker("Julian","Spears","Officer","002",1985,46,50000);
        sW3 = new SalaryWorker("Bill", "Lateman", "Mr.", "000", 1984, 0,50000);
    }
    @Test
    void calculateWeeklyPay() {
        assertEquals(1000,sW1.calculateWeeklyPay(40));
    }
    @Test
    void displayWeeklyPay(){
        assertEquals("Total weekly pay: 961.5384615384615",sW2.displayWeeklyPay(40));
    }
}