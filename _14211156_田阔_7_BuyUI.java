package homework7;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class _14211156_ÌïÀ«_7_BuyUI {
	
	public void buybook( _14211156_ÌïÀ«_7_Controller controller){
		JFrame buyui = new JFrame("BuyUI");
		JFrame shoppingcarui = new JFrame("ShoppingCarUI");
		
		buyui.setLocation(750, 300);
		buyui.setSize(500, 300);
		
		JLabel is = new JLabel("isbn");
		JLabel nu = new JLabel("num");
		JButton buy = new JButton("Buy!");
		JTextField isbn = new JTextField();
		JTextField num = new JTextField();
		
		buyui.add(is);
		buyui.add(isbn);
		buyui.add(nu);
		buyui.add(num);
		buyui.add(buy);
		buyui.setLayout(new GridLayout(3, 2));
		buyui.setVisible(true);
		
		controller.createShoppingCarUI();
		buy.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String isbn1 = isbn.getText();
				int num1 = Integer.parseInt(num.getText());
				controller.buyBook(isbn1, num1);
			}
		});
	}
}
