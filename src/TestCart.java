import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCart {
	//ShoppingCart cart1 = new ShoppingCart();
    Book ex ;
    
    @Before
    public void setUp() {
    	ex = new Book();
    }
    
    
	@Test
	//test 1
	public void test1() { assertTrue( ShoppingCart.GETProductCount() ==0.0  ); }
	
	
	@Test
	//test 2
	public void test2() {
	   ex = new Book("JavaBook",127.0,1);
	   ShoppingCart.addBOOK(ex);
	   assertTrue(ShoppingCart.GETProductCount()==127.0);	
	   assertTrue(ShoppingCart.GETCount()== 1);
	}


	@Test
	//test 3
	public void test3() {
	ShoppingCart.cleanCart();
	ex = new Book("JavaBook",127.0,1);
	ShoppingCart.addBOOK(ex);
	ex = new Book("web design book",100.0,1);
	ShoppingCart.addBOOK(ex);

	 
	 assertTrue(ShoppingCart.GETProductCount()==227.0);	
	 assertTrue(ShoppingCart.GETCount()== 2);
	
	
	
	
	
	
	
	}
	
	
	
	
	
}
