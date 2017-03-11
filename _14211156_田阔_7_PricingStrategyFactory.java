package homework7;

import java.util.ArrayList;
import java.util.HashMap;

public class _14211156_ÌïÀ«_7_PricingStrategyFactory {
	private static _14211156_ÌïÀ«_7_PricingStrategyFactory instance;
	private _14211156_ÌïÀ«_7_StrategyCatalog catalog;
	
	public static synchronized _14211156_ÌïÀ«_7_PricingStrategyFactory getInstance(){
		if ( instance == null )
			instance = new _14211156_ÌïÀ«_7_PricingStrategyFactory();
		return instance;
	}
	
	public _14211156_ÌïÀ«_7_IPricingStrategy getPricingStrategy(int bookType){
		_14211156_ÌïÀ«_7_IPricingStrategy strategy = null;
		_14211156_ÌïÀ«_7_Strategy cata = null;
		ArrayList< _14211156_ÌïÀ«_7_IPricingStrategy > str = new ArrayList< _14211156_ÌïÀ«_7_IPricingStrategy >();
		HashMap< Integer, _14211156_ÌïÀ«_7_Strategy > strategies = new HashMap< Integer, _14211156_ÌïÀ«_7_Strategy >();
		strategies = catalog.getlist();
		
		if ( strategies.get(bookType)!=  null ){
			cata = strategies.get(bookType);
			if ( cata.getstype().equals("FlatRate")){
				strategy = new _14211156_ÌïÀ«_7_FlatRateStrategy(Double.parseDouble(cata.getdiscount()));
			}
			else if ( cata.getstype().equals("Percentage") ){
				strategy = new _14211156_ÌïÀ«_7_PercentageStrategy(Integer.parseInt(cata.getdiscount()));
			}
			else if ( cata.getstype().equals("Composite")){
				String compont = cata.getdiscount();
				String[] list1 = compont.split("\\|");
				for ( int i = 0; i < list1.length; i++ ){
					for ( int type = 1; type <= 3; type ++ ){
						if ( strategies.get(type) != null && strategies.get(type).getnum().equals(list1[i])){
							if( strategies.get(type).getstype().equals("FlatRate")){
								strategy = new _14211156_ÌïÀ«_7_FlatRateStrategy(Double.parseDouble(strategies.get(type).getdiscount()));
								str.add(strategy);
							}
							else if ( strategies.get(type).getstype().equals("Percentage")){
								strategy = new _14211156_ÌïÀ«_7_PercentageStrategy(Integer.parseInt(strategies.get(type).getdiscount()));
								str.add(strategy);
							}
						}
					}
				}
				_14211156_ÌïÀ«_7_IPricingStrategy comp = new _14211156_ÌïÀ«_7_CompositeStrategy(str);
				return comp;
			}
		}
		else{
			strategy = new _14211156_ÌïÀ«_7_NoDiscountStrategy();
		}
		return strategy;
	}
	
	public void setcatalog( _14211156_ÌïÀ«_7_StrategyCatalog catalog ){
		this.catalog = catalog;
	}
}
