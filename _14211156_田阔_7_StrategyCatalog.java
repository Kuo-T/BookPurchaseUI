package homework7;

import java.util.ArrayList;
import java.util.HashMap;

public class _14211156_ÌïÀ«_7_StrategyCatalog {
	private HashMap<Integer, _14211156_ÌïÀ«_7_Strategy> list;
	
	public _14211156_ÌïÀ«_7_StrategyCatalog(){
		list = null;
	}
	
	public void setstrategies( HashMap< Integer, _14211156_ÌïÀ«_7_Strategy> list ){
		this.list = list;
	}
	
	public HashMap< Integer, _14211156_ÌïÀ«_7_Strategy > getlist (){
		return this.list;
	}
	
	public void add( int btype, _14211156_ÌïÀ«_7_Strategy strategy){
		list.put(btype, strategy);
	}
}
