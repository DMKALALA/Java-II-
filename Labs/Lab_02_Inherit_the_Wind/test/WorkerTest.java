import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WorkerTest {
    Worker w1,w2,w3;
    @BeforeEach
    void setup(){
        w1 = new Worker("Jason","Tod","Mr.","003",1963,12);
        w2 = new Worker("Tim","Drake","Mr.","004",1976,400);
        w3 = new Worker("Dick","Grayson","Mr.","005",1953,31);
    }
    @Test
    void calculateWeeklyPay() {
        assertEquals(480,w1.calculateWeeklyPay(40));
    }
    @Test
    void displayWeeklyPay() {
        assertEquals("Regular Pay: 480.0(40.0 hours) Overtime: 0.0(0.0 hours) Total: 480.0(40.0 hours)",w1.displayWeeklyPay(40));
    }
    @Test
    void displayWeeklyPay2() {
        assertEquals("Regular Pay: 480.0(40.0 hours) Overtime: 120.0(10.0 hours) Total: 600.0(50.0 hours)",w1.displayWeeklyPay(50));
    }
}