import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    Person p1, p2, p3, p4, p5, p6;
    @BeforeEach
    void setup(){
        p1 = new Person("Bob","Tester1","mr.","00000A",1985);
        p2 = new Person("Sal","Tester2","mr.","00000B",1975);
        p3 = new Person("Tim","Tester3","mrs.","00000C",1983);
        p4 = new Person("Lilly","Tester4","mrs.","00000D",1984);
        p5 = new Person("Henlo","Tester5","esq.","00000E",1991);
        p6 = new Person("Herbert","Tester6","ma'am","00000F",1965);
    }
    @Test
    void getID() {assertEquals("00000A",p1.getID());}
    @Test
    void getFirstname() {assertEquals("Sal",p2.getFirstname());}
    @Test
    void getLastname() {assertEquals("Tester3",p3.getLastname());}
    @Test
    void getTitle() {assertEquals("mrs.",p4.getTitle());}
    @Test
    void getYOB() {assertEquals(1991,p5.getYOB());}

    @Test
    void setID() {
        p1.setID("00000A");
        assertEquals("00000A",p1.getID());
    }
    @Test
    void setFirstname() {
        p1.setFirstname("Sal");
        assertEquals("Sal",p1.getFirstname());
    }
    @Test
    void setLastname() {
        p1.setLastname("Tester3");
        assertEquals("Tester3",p1.getLastname());
    }
    @Test
    void setTitle() {
        p1.setTitle("mrs.");
        assertEquals("mrs.",p1.getTitle());
    }
    @Test
    void setYOB() {
        p1.setYOB(1991);
        assertEquals(1991,p1.getYOB());
    }
    @Test
    void getformalname() {
        assertEquals("mr. Bob Tester1",p1.getformalname());
    }
    @Test
    void getfullname() {
        assertEquals("Sal Tester2",p2.getfullname());
    }
    @Test
    void getAge() {
        assertEquals(40,p3.getAge());
    }
    @Test
    void getAge2() {
        assertEquals(1,p3.getAge(1984));
    }
}