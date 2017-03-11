package homework7;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class _14211156_ÌïÀ«_7_MainUI {
	
	private _14211156_ÌïÀ«_7_Controller controller;
	private _14211156_ÌïÀ«_7_BookCatalog books;
	private _14211156_ÌïÀ«_7_StrategyCatalog strategies;
	
	public void setcontroller( _14211156_ÌïÀ«_7_Controller controller ){
		this.controller = controller;
	}
	
	public void setbooks( _14211156_ÌïÀ«_7_BookCatalog books ){
		this.books = books;
	}
	
	public _14211156_ÌïÀ«_7_Controller getcontroller(){
		return controller;
	}
	
	public _14211156_ÌïÀ«_7_BookCatalog getbooks(){
		return books;
	}
	public void setMainUI(){
		JFrame mainui =  new JFrame("MainUI");
		mainui.setLocation(200, 200);
		mainui.setSize(500, 500);
		
		JButton AddBook = new JButton("AddBook");
		JButton Strategies = new JButton("Strategies");
		JButton Buy = new JButton("Buy");
		mainui.add(AddBook);
		mainui.add(Strategies);
		mainui.add(Buy);
		mainui.setLayout(new GridLayout(3, 1));
		mainui.setVisible(true);
		
		AddBook.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				_14211156_ÌïÀ«_7_AddBookUI addbookui = new _14211156_ÌïÀ«_7_AddBookUI();
				addbookui.addbook(getcontroller(), getbooks());
			}			
		});
		Strategies.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				JFrame sui = new JFrame ("StrategiesUI");
				sui.setLocation(250, 250);
				sui.setSize(400, 400);
				
				JButton addstrategy = new JButton("AddStrategy");
				JButton deletestrategy = new JButton("DeleteStrategy");
				JButton updatestrategy = new JButton("UpdateStrategy");
				JButton searchstrategy = new JButton("SearchStrategy");
				
				sui.add(addstrategy);
				sui.add(deletestrategy);
				sui.add(updatestrategy);
				sui.add(searchstrategy);
				sui.setLayout(new GridLayout(4, 1));
				sui.setVisible(true);
				
				_14211156_ÌïÀ«_7_StrategiesUI strategiesui = new _14211156_ÌïÀ«_7_StrategiesUI();
				
				addstrategy.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
						strategiesui.addstrategy(getcontroller());
					}
				});
				deletestrategy.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
						strategiesui.deletestrategy(getcontroller());
					}
				});
				updatestrategy.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
						strategiesui.updatestrategy(getcontroller());
					}
				});
				searchstrategy.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
						strategiesui.searchstrategy(getcontroller());
					}
				});
				
			}			
		});
		Buy.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				_14211156_ÌïÀ«_7_BuyUI buyui = new _14211156_ÌïÀ«_7_BuyUI();
				buyui.buybook(getcontroller());
			}			
		});
	}
	public void create(){
		_14211156_ÌïÀ«_7_Controller controller = new _14211156_ÌïÀ«_7_Controller();
		this.setcontroller(controller);
//		controller.createStrategyCatalog();
	}
}
