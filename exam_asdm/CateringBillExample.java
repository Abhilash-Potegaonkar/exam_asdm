
public class CateringBillExample
        {

	    public static void main(String[] args)
	    {
	    	cateringBill b1 = new cateringBill(500, 50);
	    	
	    	int bill = b1.generateBill();
	    	System.out.println(bill);
	    	
	    	int biiWithDiscount = b1.generateBill(5);
	    	System.out.println(biiWithDiscount);
	     }

         }
