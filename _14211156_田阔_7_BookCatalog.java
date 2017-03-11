package homework7;

import java.util.ArrayList;

public class _14211156_ÌïÀ«_7_BookCatalog {
	private ArrayList<_14211156_ÌïÀ«_7_ProductSpecification> books;
	
	public _14211156_ÌïÀ«_7_BookCatalog(){
		books = null;
	}
	public void setbooks(ArrayList<_14211156_ÌïÀ«_7_ProductSpecification> books){
		this.books = books;
	}
	
	public ArrayList<_14211156_ÌïÀ«_7_ProductSpecification> getbooks (){
		return this.books;
	}
	
	public int search( String isbn ){
		for( int i = 0; i < books.size(); i++  ){
			if ( books.get(i).getisbn().equals(isbn) )
				return 1;
		}
		return 0;
	}
	
	public void add( _14211156_ÌïÀ«_7_ProductSpecification prod ){
		books.add(prod);
	}
	
}
