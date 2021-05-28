package testPackage;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//import com.stackroute.oops.Book;

import cart.Model.Basket;
import cart.Model.Product;
import cart.Services.ProductServices;



public class BasketTest {
	  private Basket b;
	  private ProductServices ps;
	  private Product p;
	  

	    @BeforeEach
	    public void setUp() {
	        b=new Basket();
	    }

	    @AfterEach
	    public void tearDown() {
	       b = null;
	    }
	    
	    @Test
	    public void addProduct() {
	    	Product p=new Product(1,"grapes",34,2);
	    	assertTrue(b.addProductToBasket(p));
	    	
	    }
	    @Test
	    public void removeProduct() {
	    	Product p=new Product(1,"grapes",34,2);
	    	b.addProductToBasket(p);
	    	assertTrue(b.removeFromBasket(p));
	    	
	    }
	    
	    @Test
	    public void getObjectOfProduct() {
	    	Product p=new Product(1,"grapes",34,2);
	    	b.addProductToBasket(p);
	    	 Product  pi=b.getProductByProductNoObj(1);
	    	 
	    	 assertEquals(p,pi);
	    }
	    @Test
	    public void getObjectOfProductasNull() {
	    	Product p=new Product(1,"grapes",34,2);
	    	b.addProductToBasket(p);
	    	b.removeFromBasket(p);
	    	 Product  pi=b.getProductByProductNoObj(1);
	    	 
	    	 assertNotEquals(p,pi);
	    }
	    
	    @Test
	    public void getListasNull() {
	    	Product p=null;
	    	b.addProductToBasket(p);
	    	
	    	 //Product  pi=b.getProductByProductNoObj(1);
	    	 
 
	    	 assertNull(p);
	    }
	    
	    
}
