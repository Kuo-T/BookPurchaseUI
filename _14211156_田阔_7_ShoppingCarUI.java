package homework7;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class _14211156_ÌïÀ«_7_ShoppingCarUI implements _14211156_ÌïÀ«_7_Observer{
	private JFrame shoppingcarui;
	public _14211156_ÌïÀ«_7_ShoppingCarUI(){
		shoppingcarui = new JFrame("ShoppingCarUI");
		shoppingcarui.setLocation(800, 300);
		shoppingcarui.setSize(400, 400);
	}
	
	public void update ( _14211156_ÌïÀ«_7_Sale sale ){
		shoppingcarui.getContentPane().removeAll();
		ArrayList<_14211156_ÌïÀ«_7_SaleLineItem> items;
		items = sale.getitem();
		JTextArea area = new JTextArea();
		JTextArea area1 = null;
		for( int i = 0; i < items.size(); i++ ){
			area.setSize(400, 300);
			area.append("BookTitle:" + items.get(i).gettitle() + '\t'+"Amount:"+String.valueOf(items.get(i).getcopies())+'\n');
		}
		shoppingcarui.add(area);
		area1 = new JTextArea();
		area1.setSize(400, 100);
		area1.setText("Total:"+sale.getTotal());
		shoppingcarui.add(area1);
		shoppingcarui.setLayout(new GridLayout(2, 1));
		shoppingcarui.setVisible(true);
//		System.out.println(sale.getTotal());
	}
}
