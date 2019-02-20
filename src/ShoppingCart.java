import java.util.*;
import java.awt.*;

public class ShoppingCart {

	//static float TotalCount ; 
    static ArrayList<Book> cart= new ArrayList<Book>() ;
	
    public static void addBOOK(Book R ) { cart.add(R);  }
    public static double GETProductCount() {
		// TODO Auto-generated method stub
		double TEMP = 0.0 ;
    	if( cart.isEmpty() ) {return 0 ;}
		for (int i = 0 ; i<cart.size() ; i++) {
		TEMP += cart.get(i).getprice() * cart.get(i).getcount() ;
		}
		
		return TEMP ; 
	}
    public static int GETCount() {    
	int CX = 0 ;
	if( cart.isEmpty() )
		return 0 ;
	else 
		for (int i = 0 ; i<cart.size() ; i++) {CX +=cart.get(i).getcount();}		
		return CX;
    }



public static void cleanCart() {
	System.out.print("hello");
	if( cart.isEmpty() ) {return ;}
	cart.clear();
	return ;
	
}



}


