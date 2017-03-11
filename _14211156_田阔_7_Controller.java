package homework7;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class _14211156_ÌïÀ«_7_Controller {
	
	private _14211156_ÌïÀ«_7_BookCatalog books;
	private _14211156_ÌïÀ«_7_StrategyCatalog strategies;
	private _14211156_ÌïÀ«_7_PricingStrategyFactory factory;
	private _14211156_ÌïÀ«_7_Sale sale;
	private _14211156_ÌïÀ«_7_ShoppingCarUI shoppingcarui;
	
	public  _14211156_ÌïÀ«_7_Controller(){
		books = new _14211156_ÌïÀ«_7_BookCatalog();
		strategies = new _14211156_ÌïÀ«_7_StrategyCatalog();
		factory = new _14211156_ÌïÀ«_7_PricingStrategyFactory();
		sale = new _14211156_ÌïÀ«_7_Sale();
		ArrayList<_14211156_ÌïÀ«_7_ProductSpecification> prods = new ArrayList<_14211156_ÌïÀ«_7_ProductSpecification>();
		HashMap <Integer, _14211156_ÌïÀ«_7_Strategy> list = new HashMap <Integer, _14211156_ÌïÀ«_7_Strategy>();
		ArrayList<_14211156_ÌïÀ«_7_SaleLineItem> items = new ArrayList<_14211156_ÌïÀ«_7_SaleLineItem>();
		books.setbooks(prods);
		strategies.setstrategies(list);
		factory.setcatalog(strategies);
		sale.setitems(items);
	}
	
	public _14211156_ÌïÀ«_7_BookCatalog createStrategyCatalog(){
		_14211156_ÌïÀ«_7_BookCatalog books = new _14211156_ÌïÀ«_7_BookCatalog();
		ArrayList<_14211156_ÌïÀ«_7_ProductSpecification> prods = new ArrayList<_14211156_ÌïÀ«_7_ProductSpecification>();
		books.setbooks(prods);
		return books;
	}
	public int addbook( _14211156_ÌïÀ«_7_ProductSpecification prod ){
		ArrayList<_14211156_ÌïÀ«_7_ProductSpecification> prods = new ArrayList<_14211156_ÌïÀ«_7_ProductSpecification>();
		prods = books.getbooks();
		
		if ( books.search(prod.getisbn()) == 0 ){
			prods.add(prod);
			books.setbooks(prods);
			return 1;
		}
		return 0;
	}
	
	public int addStrategy( int btype, _14211156_ÌïÀ«_7_Strategy strategy ){
		HashMap <Integer, _14211156_ÌïÀ«_7_Strategy> tlist = new HashMap <Integer, _14211156_ÌïÀ«_7_Strategy>();
		tlist = strategies.getlist();
		
		if(tlist.containsKey(btype)){
			return 0;
		}
		else{
			tlist.put(btype, strategy);
			strategies.setstrategies(tlist);
			factory.setcatalog(strategies);
			return 1;
		}
	}
	
	public void createShoppingCarUI(){
		ArrayList<_14211156_ÌïÀ«_7_ProductSpecification> prods = new ArrayList<_14211156_ÌïÀ«_7_ProductSpecification>();
		prods = books.getbooks();
		JFrame booklist = new JFrame("BookList");
		booklist.setLocation(250, 250);
		booklist.setSize(500, 500);
		
		JTextArea book = new JTextArea();
		for ( int i = 0; i < prods.size(); i++ ){
			book.append("ISBN: "+prods.get(i).getisbn()+"Title: "+prods.get(i).gettitle()+ "Price: "+String.valueOf(prods.get(i).getPrice())+"Type: "+String.valueOf(prods.get(i).getType())+'\n');
		}
		booklist.add(book);
		booklist.setVisible(true);
		shoppingcarui = new _14211156_ÌïÀ«_7_ShoppingCarUI();
		sale.registerObserver(shoppingcarui);
	}
	
	public _14211156_ÌïÀ«_7_ProductSpecification buyBook( String isbn, int num ){
		
		ArrayList<_14211156_ÌïÀ«_7_ProductSpecification> prods = new ArrayList<_14211156_ÌïÀ«_7_ProductSpecification>();
		_14211156_ÌïÀ«_7_ProductSpecification prod = new _14211156_ÌïÀ«_7_ProductSpecification();
		prods = books.getbooks();
		

		ArrayList<_14211156_ÌïÀ«_7_SaleLineItem> items = sale.getitem();
		
		_14211156_ÌïÀ«_7_SaleLineItem item = new _14211156_ÌïÀ«_7_SaleLineItem();
		if ( books.search(isbn) == 1 ){
			for ( int i = 0; i < prods.size(); i++ ){
				if ( isbn.equals(prods.get(i).getisbn())){
					prod = prods.get(i);
					break;
				}
			}
		}
		else return null;
		item.setproSpec(prod);
		item.setcopies(num);
		item.setstrategy(factory.getPricingStrategy(prod.getType()));
		items.add(item);
		sale.setitems(items);
		sale.notifyObserver();
		return prod;
	}
	
	public int deleteStrategy( String isbn ){
		HashMap <Integer, _14211156_ÌïÀ«_7_Strategy> tlist = new HashMap <Integer, _14211156_ÌïÀ«_7_Strategy>();
		tlist = strategies.getlist();
		
		for(Entry<Integer, _14211156_ÌïÀ«_7_Strategy> entry : tlist.entrySet()){
			if ( isbn.equals(entry.getValue().getnum())){
				tlist.remove(entry.getKey());
				strategies.setstrategies(tlist);
				return 1;
			}
		}
		return 0;
	}
	
	public int updateStrategy(String oldnum, _14211156_ÌïÀ«_7_Strategy newstra){
		HashMap<Integer, _14211156_ÌïÀ«_7_Strategy> tlist = new HashMap<Integer, _14211156_ÌïÀ«_7_Strategy>();
		_14211156_ÌïÀ«_7_Strategy str =new _14211156_ÌïÀ«_7_Strategy();
		tlist = strategies.getlist();
		if ( (str = searchStrategy(oldnum)) != null ){
			tlist.remove(str.getbtype());
			str = newstra;
			tlist.put(str.getbtype(), str);
			strategies.setstrategies(tlist);
			return 1;
		}
		else return 0;
	}
	
	public _14211156_ÌïÀ«_7_Strategy searchStrategy( String num ){
		HashMap<Integer, _14211156_ÌïÀ«_7_Strategy> tlist = new HashMap<Integer, _14211156_ÌïÀ«_7_Strategy>();
		tlist = strategies.getlist();
		for(Entry<Integer, _14211156_ÌïÀ«_7_Strategy> entry : tlist.entrySet()){
			if ( num.equals(entry.getValue().getnum())){
				return entry.getValue();
			}
		}
		return null;
	}
}
