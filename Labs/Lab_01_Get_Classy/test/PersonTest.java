import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    private Person person;

    @BeforeEach
    void setUp() {
        // Create a Person instance for testing
        person = new Person("ID123", "John", "Doe", "Mr.", 1990);
    }

    @Test
    void testParameterizedConstructor() {
        assertEquals("ID123", person.getIDNum());
        assertEquals("John", person.getFirstName());
        assertEquals("Doe", person.getLastName());
        assertEquals("Mr.", person.getTitle());
        assertEquals(1990, person.getYOB());
    }

    @Test
    void testAlternateConstructor() {
        Person newPerson = new Person("Jane", "Smith", "Ms.", 1985);
        assertNotNull(newPerson.getIDNum()); // Assuming IDNum is generated in the constructor
        assertEquals("Jane", newPerson.getFirstName());
        assertEquals("Smith", newPerson.getLastName());
        assertEquals("Ms.", newPerson.getTitle());
        assertEquals(1985, newPerson.getYOB());
    }

    @Test
    void testGetAge() {
        assertEquals(String.valueOf(Calendar.getInstance().get(Calendar.YEAR) - 1990), person.getAge());
    }

    @Test
    void testToCSVDataRecord() {
        assertEquals("ID123,John,Doe,Mr.,1990", person.toCSVDataRecord());
    }

    @Test
    void testFullName() {
        assertEquals("John                Doe", person.fullName());
    }

    @Test
    void testFormalName() {
        assertEquals("Mr.                John                Doe", person.formalName());
    }

    @Test
    void testToString() {
        assertEquals("Person{IDNum='ID123', firstName='John', lastName='Doe', title='Mr.', YOB=1990}", person.toString());
    }

    @Test
    void testSetIDSeed() {
        Person.setIDSeed(5);
        assertEquals(5, Person.getIDSeed());
    }

    @Test
    void testGenIDNum() {
        assertEquals("000001", person.genIDNum());
    }

    @Test
    void testSetIDNum() {
        person.setIDNum("ID456");
        assertEquals("ID456", person.getIDNum());
    }

    @Test
    void testSetFirstName() {
        person.setFirstName("Jane");
        assertEquals("Jane", person.getFirstName());
    }

    @Test
    void testSetLastName() {
        person.setLastName("Smith");
        assertEquals("Smith", person.getLastName());
    }

    @Test
    void testSetTitle() {
        person.setTitle("Ms.");
        assertEquals("Ms.", person.getTitle());
    }

    @Test
    void testSetYOB() {
        person.setYOB(1985);
        assertEquals(1985, person.getYOB());
    }
}
