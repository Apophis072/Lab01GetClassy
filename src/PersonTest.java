import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person p1, p2;

    @BeforeEach
    void setUp()
    {
        p1 = new Person("00000A", "Bob", "Tester1", "Mr.",1955);
        p2 = new Person("00000B", "Sally", "Tester2", "Mrs.",1975);
        Person.setIDSeed(0);
    }

    @org.junit.jupiter.api.Test
    void setID()
    {
       p1.setID("00000B");
        assertEquals("00000B", p1.getID());
    }

    @org.junit.jupiter.api.Test
    void setFirstName()
    {
        p1.setFirstName("Sally");
        assertEquals("Sally", p1.getFirstName());
    }

    @org.junit.jupiter.api.Test
    void setLastName()
    {
        p2.setLastName("Tester2");
        assertEquals("Tester2", p2.getLastName());
    }

    @org.junit.jupiter.api.Test
    void setTitle()
    {
        p1.setTitle("Mister");
        assertEquals("Mister", p1.getTitle());
    }

    @org.junit.jupiter.api.Test
    void setBirthYear()
    {
        p1.setbirthYear(1975);
        assertEquals(1975, p1.getbirthYear());
    }

    @org.junit.jupiter.api.Test
    void setIDSeed()
    {
        Person.setIDSeed(4);
        assertEquals(4, Person.getIDSeed());
    }

    @org.junit.jupiter.api.Test
    void fullName()
    {
        p2.setLastName("Johnson");
        p2.setFullName(p2.getFirstName());
        p2.setFullName(p2.getLastName());
        assertEquals("Sally Johnson", p2.getFullName());
    }

    @org.junit.jupiter.api.Test
    void formalName()
    {
        p1.setLastName("Smith");
        p1.setFormalName(p1.getTitle());
        p1.setFormalName(p1.getLastName());
        assertEquals("Mr. Smith", p1.getFormalName());
    }

    @org.junit.jupiter.api.Test
    void getAge()
    {
        p1.setGetAge(p1.getbirthYear());
        assertEquals(69, p1.getGetAge());
    }

    @org.junit.jupiter.api.Test
    void getFutureAge()
    {
        p1.setFutureAge(2055);
        assertEquals(100, p1.getFutureAge());
    }
}