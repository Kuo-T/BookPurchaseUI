package homework7;

public class _14211156_ÌïÀ«_7_FlatRateStrategy implements _14211156_ÌïÀ«_7_IPricingStrategy{
	private double discountPerBook;
	
	public _14211156_ÌïÀ«_7_FlatRateStrategy( double discount ){
		this.discountPerBook = discount;
	}
	public double getdiscount(){
		return this.discountPerBook;
	}
	public double getSubTotal(_14211156_ÌïÀ«_7_SaleLineItem item){
		System.out.println((item.getSubTotal()) - discountPerBook);
		return (item.getSubTotal()) - discountPerBook;
	}
}
