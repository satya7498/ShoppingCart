package testPackage;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import cart.Model.Product;

public class ProductTest {
	
	
    private Product prod;

    @BeforeEach
    public void setUp() {
       prod = new Product(1,"apple",20,2);
    }

    @AfterEach
    public void tearDown() {
       prod = null;
    }
    
   /* @Test
    public void givenProductDetails() {
        String prodDetails = prod.toString();
        String expectedDetails = 
        "Product [pid='1', pname='apple', price='20', qty='2']";
		assertEquals(prodDetails,expectedDetails);
          }*/
    
    @Test
    public void givenValidProperty() {
        assertEquals(1, prod.getPid());
        assertEquals("apple", prod.getPname());
        assertEquals(20, prod.getPrice());
        assertEquals(2, prod.getQty());
    }

    @Test
    public void givenProductObject() {
    	prod.setPname("mango");
    	prod.setPrice(34);
        assertEquals("mango",prod.getPname());
        assertEquals(34,prod.getPrice());
    }
    
   


}
