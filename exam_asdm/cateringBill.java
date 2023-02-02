
public class cateringBill {
	private int plateCount;
	private int ratePerPlate;
	
	public cateringBill(int plateCount, int ratePerPlate) {
		super();
		this.plateCount = plateCount;
		this.ratePerPlate = ratePerPlate;
	}


	
	
	
	public int generateBill() {
		int plateNumber=plateCount;
		int rateOfPlate=ratePerPlate;
		
		int TotalBill=plateNumber*rateOfPlate;
		return TotalBill;
		
		
		
	}
	
	
	public int generateBill(int discountPercent) {
	
	int TotalBillWithDiscount=generateBill()-((generateBill()*discountPercent/100));
	return TotalBillWithDiscount;
	
	}


	public int getPlateCount() {
		return plateCount;
	}


	public void setPlateCount(int plateCount) {
		this.plateCount = plateCount;
	}


	public int getRatePerPlate() {
		return ratePerPlate;
	}


	public void setRatePerPlate(int ratePerPlate) {
		this.ratePerPlate = ratePerPlate;
	}
	
	}


