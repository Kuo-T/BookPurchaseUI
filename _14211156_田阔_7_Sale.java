package homework7;

import java.util.ArrayList;

public class _14211156_ÌïÀ«_7_Sale implements _14211156_ÌïÀ«_7_Subject{
	private ArrayList<_14211156_ÌïÀ«_7_SaleLineItem> items;
	private ArrayList<_14211156_ÌïÀ«_7_Observer> list = new ArrayList<_14211156_ÌïÀ«_7_Observer>();
	
	public void setitems( ArrayList<_14211156_ÌïÀ«_7_SaleLineItem> items ){
		this.items = items;
	}
	
	public ArrayList<_14211156_ÌïÀ«_7_SaleLineItem> getitem (){
		return items;
	}
	
	public double getTotal(){
		double total = 0;
		for ( int i = 0; i < items.size(); i++ ){
			total += (items.get(i).getcopies())*(items.get(i).getstrategy().getSubTotal(items.get(i)));
		}
		return total;
	}
	
	 public void registerObserver(_14211156_ÌïÀ«_7_Observer ob){
	        list.add(ob);
	 }

	    @Override
	 public void removeObserver(_14211156_ÌïÀ«_7_Observer ob){
	        list.remove(ob);
	 }

	    @Override
	 public void notifyObserver(){
	     for ( _14211156_ÌïÀ«_7_Observer ob : list){
	            ob.update(this);
	        }
	 }

}
