package testPackage;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



import cart.Model.Basket;
import cart.Model.Product;
import cart.Services.ProductServices;

public class ProductServiceTest {
	private Basket b;
	  private ProductServices ps;
	  private Product p;
	  

	    @BeforeEach
	    public void setUp() {
	        ps=new ProductServices ();
	        b=new Basket();
	    }

	    @AfterEach
	    public void tearDown() {
	       ps = null;
	       b=null;
	    }
	    
	    @Test
	    public void givenObjectCreated() {
	        final Product pr = ProductServices.createProduct(1, "pen", 20, 2);

	        assertNotNull(pr);
	        assertEquals("pen", pr.getPname());
	    }
	    
	    @Test
	    public void calculateProduct() {
	    	Product p=new Product(1,"grapes",34,2);
	    	b.addProductToBasket(p);
	    	assertEquals(34,b.calculate());
	    	
	    }
	    
	   
	    
	    
}
