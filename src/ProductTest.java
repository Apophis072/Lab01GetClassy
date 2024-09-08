import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest
{
    Product p1, p2;

    @BeforeEach
    void setUp()
    {
        p1 = new Product("000001", "T-Shirt", "Cotton T-Shirt", 7.99);
        p2 = new Product("000002", "Coat", "Clothing",59.99);
    }

    @Test
    void setID()
    {
        p1.setID("000003");
        assertEquals("000003",p1.getID());

    }

    @Test
    void setName()
    {
        p2.setName("Hanger");
        assertEquals("Hanger", p2.getName());
    }

    @Test
    void setDescription()
    {
        p1.setDescription("Food");
        assertEquals("Food",p1.getDescription());
    }

    @Test
    void setCost()
    {
        p2.setCost(500.00);
        assertEquals(500.00,p2.getCost());

    }
}