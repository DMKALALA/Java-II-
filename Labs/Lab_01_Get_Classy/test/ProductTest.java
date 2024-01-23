import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    private Product product;

    @BeforeEach
    void setUp() {
        // Create a Product instance for testing
        product = new Product("000001", "Laptop", "High-performance laptop", 1200.0);
    }

    @Test
    void testParameterizedConstructor() {
        assertEquals("000001", product.getIDNum());
        assertEquals("Laptop", product.getName());
        assertEquals("High-performance laptop", product.getDescription());
        assertEquals(1200.0, product.getCost(), 0.001);
    }

    @Test
    void testAlternateConstructor() {
        Product newProduct = new Product("Printer", "Color printer", 300.0);
        assertNotNull(newProduct.getIDNum()); // Assuming IDNum is generated in the constructor
        assertEquals("Printer", newProduct.getName());
        assertEquals("Color printer", newProduct.getDescription());
        assertEquals(300.0, newProduct.getCost(), 0.001);
    }

    @Test
    void testToCSVDataRecord() {
        assertEquals("000001,Laptop,High-performance laptop,1200.0", product.toCSVDataRecord());
    }

    @Test
    void testSetIDSeed() {
        Product.setIDSeed(5);
        assertEquals(5, Product.getIDSeed());
    }

    @Test
    void testGenIDNum() {
        // Assuming initial seed is 1
        assertEquals("000001", product.genIDNum());
    }

    @Test
    void testToString() {
        assertEquals("Product{IDNum='000001', name='Laptop', Description='High-performance laptop', Cost=1200.0}", product.toString());
    }

    @Test
    void testSetIDNum() {
        product.setIDNum("000001");
        assertEquals("000001", product.getIDNum());
    }

    @Test
    void testSetName() {
        product.setName("Desktop");
        assertEquals("Desktop", product.getName());
    }

    @Test
    void testSetDescription() {
        product.setDescription("Powerful desktop computer");
        assertEquals("Powerful desktop computer", product.getDescription());
    }

    @Test
    void testSetCost() {
        product.setCost(1500.0);
        assertEquals(1500.0, product.getCost(), 0.001);
    }
}
