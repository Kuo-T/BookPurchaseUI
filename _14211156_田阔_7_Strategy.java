package homework7;

public class _14211156_ÌïÀ«_7_Strategy {
	private String num;
	private String name;
	private String stype;
	private int btype;
	private String discount;
	
	public void setstrategy( String num, String name, String stype, int btype, String discount ){
		this.num = num;
		this.name = name;
		this.stype = stype;
		this.btype = btype;
		this.discount = discount;
	}
	public String getnum(){
		return this.num;
	}
	public String getname(){
		return this.name;
	}
	
	public String getstype(){
		return this.stype;
	}
	
	public int getbtype(){
		return this.btype;
	}
	
	public String getdiscount(){
		return this.discount;
	}
}
