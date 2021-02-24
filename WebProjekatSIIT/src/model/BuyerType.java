package model;

public class BuyerType {
	private BuyerTypeName buyerTypeName;
	private double discount;
	private int requiredPoints;
	
	
	
	public BuyerType() {
		super();
	}

	
	public BuyerType(BuyerTypeName buyerTypeName, double discount, int requiredPoints) {
		super();
		this.buyerTypeName = buyerTypeName;
		this.discount = discount;
		this.requiredPoints = requiredPoints;
	}


	public BuyerTypeName getBuyerTypeName() {
		return buyerTypeName;
	}

	public void setBuyerTypeName(BuyerTypeName buyerTypeName) {
		this.buyerTypeName = buyerTypeName;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public int getRequiredPoints() {
		return requiredPoints;
	}

	public void setRequiredPoints(int requiredPoints) {
		this.requiredPoints = requiredPoints;
	}
	
	
	

}
