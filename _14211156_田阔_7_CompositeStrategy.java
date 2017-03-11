package homework7;

import java.util.ArrayList;

public class _14211156_ÌïÀ«_7_CompositeStrategy implements _14211156_ÌïÀ«_7_IPricingStrategy{
	private ArrayList< _14211156_ÌïÀ«_7_IPricingStrategy > strategies;
	
	public _14211156_ÌïÀ«_7_CompositeStrategy( ArrayList<_14211156_ÌïÀ«_7_IPricingStrategy> strategies ){
		this.strategies = strategies;
	}
	public ArrayList<_14211156_ÌïÀ«_7_IPricingStrategy> getdiscount(){
		return this.strategies;
	}
	public double getSubTotal(_14211156_ÌïÀ«_7_SaleLineItem item){
		double min = 99999;
		double temp;
		for ( int i = 0; i < strategies.size(); i++ ){
			temp = strategies.get(i).getSubTotal(item);
			if ( temp < min ) min = temp;
		}
		return min;
	}
}
