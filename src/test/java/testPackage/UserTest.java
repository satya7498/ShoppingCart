package testPackage;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import cart.Model.UserInfo;


public class UserTest {
	
	 private UserInfo u;

    @BeforeEach
    public void setUp() {
       u = new  UserInfo("satya",123456);
    }

    @AfterEach
    public void tearDown() {
       u= null;
    }
  
    
    @Test
    public void notNullCaseCheck() {
    	assertNotNull(u.getUserName());
    	assertNotNull(u.getMobNo());
    }
    
   /* @Test
    public void givenUserDetails() {
    	u = new  UserInfo("satya",123456);
        String userDetails = u.toString();
        String expectedDetails = "userName= 'satya' , mobNo= '123456'";
        
		assertEquals(userDetails,expectedDetails);
          }*/
    
    
    @Test
    public void givenObjectPropertiesAreSet() {
        assertEquals("satya",u.getUserName());
        assertEquals(123456, u.getMobNo());
        }
}
