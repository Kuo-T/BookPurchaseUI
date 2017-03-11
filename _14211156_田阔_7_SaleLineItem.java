package homework7;

public class _14211156_ÌïÀ«_7_SaleLineItem {
	private int copies;
	private _14211156_ÌïÀ«_7_ProductSpecification prodSpec;
	private _14211156_ÌïÀ«_7_IPricingStrategy strategy;
	
	public void setcopies( int copies ){
		this.copies = copies;
	}
	
	public void setproSpec( _14211156_ÌïÀ«_7_ProductSpecification ps ){
		this.prodSpec = ps;
	}
	
	public void setstrategy( _14211156_ÌïÀ«_7_IPricingStrategy str ){
		this.strategy = str;
	}
	
	public int getcopies(){
		return copies;
	}
	
	public int getType(){
		return prodSpec.getType();
	}
	
	public String gettitle(){
		return prodSpec.gettitle();
	}
	
	public _14211156_ÌïÀ«_7_IPricingStrategy getstrategy(){
		return strategy;
	}
	
	public double getSubTotal(){
		return prodSpec.getPrice();
	}
}
