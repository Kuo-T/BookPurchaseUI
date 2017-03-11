package homework7;

public class _14211156_ÌïÀ«_7_PercentageStrategy implements _14211156_ÌïÀ«_7_IPricingStrategy{
	private int discountPercentage;
	
	public _14211156_ÌïÀ«_7_PercentageStrategy( int discount ){
		this.discountPercentage = discount;
	}
	public double getdiscount(){
		return this.discountPercentage;
	}
	public double getSubTotal( _14211156_ÌïÀ«_7_SaleLineItem item ){
		System.out.println(item.getSubTotal()*(1-(double)discountPercentage/100));
		return item.getSubTotal()*(1-(double)discountPercentage/100);
	}
}
