package homework7;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class _14211156_ÌïÀ«_7_AddBookUI {
	private _14211156_ÌïÀ«_7_ProductSpecification prod;
	
	public void addbook(_14211156_ÌïÀ«_7_Controller controller, _14211156_ÌïÀ«_7_BookCatalog bcatalog){
		JFrame addbookui;
		addbookui = new JFrame("AddBookUI");
		addbookui.setLocation(300, 300);
		addbookui.setSize(400, 400);
		JPanel pisbn = new JPanel();
		JTextField isbn = new JTextField();
		isbn.setSize(100, 30);
		JPanel pprice = new JPanel();
		JTextField price = new JTextField();
		JPanel ptitle = new JPanel();
		JTextField title = new JTextField();
		JPanel ptype = new JPanel();
		JTextField type = new JTextField();
		JButton add = new JButton("Add!");
		
		JLabel is = new JLabel("isbn:");
		JLabel p = new JLabel("price:");
		JLabel ti = new JLabel("title:");
		JLabel ty = new JLabel("type:");
		pisbn.add(is);
		pisbn.add(isbn);
		pisbn.setLayout(new GridLayout(1, 2));
		pprice.add(p);
		pprice.add(price);
		pprice.setLayout(new GridLayout(1, 2));
		ptitle.add(ti);
		ptitle.add(title);
		ptitle.setLayout(new GridLayout(1, 2));
		ptype.add(ty);
		ptype.add(type);
		ptype.setLayout(new GridLayout(1, 2));
		
		addbookui.add(pisbn);
		addbookui.add(pprice);
		addbookui.add(ptitle);
		addbookui.add(ptype);
		addbookui.add(add);
		addbookui.setLayout(new GridLayout(5,1));
		addbookui.setVisible(true);
		
		prod = new _14211156_ÌïÀ«_7_ProductSpecification();
		
		add.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				prod.setisbn(isbn.getText());
				prod.setprice(Double.parseDouble(price.getText()));
				prod.settitle(title.getText());
				prod.settype(Integer.parseInt(type.getText()));
				if(controller.addbook(prod)==1){
					JFrame success = new JFrame();
					JLabel su = new JLabel("Add new book successfully!");
					success.setLocation(450, 450);
					success.setSize(450, 100);
					success.add(su);
					success.setLayout(new GridLayout());
					success.setVisible(true);
				}
			}
		});
	}
}
