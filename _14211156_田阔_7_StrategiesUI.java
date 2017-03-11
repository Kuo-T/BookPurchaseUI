package homework7;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class _14211156_ÌïÀ«_7_StrategiesUI {
	
	public void addstrategy(_14211156_ÌïÀ«_7_Controller controller){
		JFrame addstrategyui;
		addstrategyui = new JFrame("AddStrategyUI");
		addstrategyui.setLocation(300, 100);
		addstrategyui.setSize(600, 500);
		JButton simple = new JButton("Simple");
		JButton composite = new JButton("Composite");
		addstrategyui.add(composite);
		addstrategyui.add(simple);
		addstrategyui.setLayout(new GridLayout());
		addstrategyui.setVisible(true);
		
		simple.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				JFrame addsimple = new JFrame("SimpleStrategyUI");
				addsimple.setLocation(300, 300);
				addsimple.setSize(600, 300);
				JTextField num = new JTextField();
				JTextField name = new JTextField();
				JTextField stype = new JTextField();
				JTextField btype = new JTextField();
				JTextField discount = new JTextField();
				JButton add = new JButton("Add!");
				
				JLabel nu = new JLabel("StrategyNum:");
				JLabel na = new JLabel("StrategyName:");
				JLabel sty = new JLabel("StrategyType:");
				JLabel bty = new JLabel("BookType:");
				JLabel dis = new JLabel("Discount:");
				
				addsimple.add(nu);
				addsimple.add(num);
				addsimple.add(na);
				addsimple.add(name);
				addsimple.add(sty);
				addsimple.add(stype);
				addsimple.add(bty);
				addsimple.add(btype);
				addsimple.add(dis);
				addsimple.add(discount);
				addsimple.add(add);
				addsimple.setLayout(new GridLayout(6,1));
				addsimple.setVisible(true);
				
				_14211156_ÌïÀ«_7_Strategy simple = new _14211156_ÌïÀ«_7_Strategy();
				
				add.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
						simple.setstrategy(num.getText(), name.getText(), stype.getText(), Integer.parseInt(btype.getText()), discount.getText());
						if(controller.addStrategy(Integer.parseInt(btype.getText()), simple)==1){
							JFrame success = new JFrame();
							JLabel su = new JLabel("Add new simple strategy successfully!");
							success.setLocation(450, 450);
							success.setSize(450, 100);
							success.add(su);
							success.setLayout(new GridLayout());
							success.setVisible(true);
						}
					}
				});
			}
		});
		
		composite.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				JFrame addcomposite = new JFrame("CompositeStrategyUI");
				addcomposite.setLocation(300, 300);
				addcomposite.setSize(600, 300);
				JTextField num = new JTextField();
				JTextField name = new JTextField();
				JTextField stype = new JTextField();
				JTextField btype = new JTextField();
				JTextField combine = new JTextField();
				JButton add = new JButton("Add!");
				
				JLabel nu = new JLabel("StrategyNum:");
				JLabel na = new JLabel("StrategyName:");
				JLabel sty = new JLabel("StrategyType:");
				JLabel bty = new JLabel("BookType:");
				JLabel comb = new JLabel("Composite:");
				
				addcomposite.add(nu);
				addcomposite.add(num);
				addcomposite.add(na);
				addcomposite.add(name);
				addcomposite.add(sty);
				addcomposite.add(stype);
				addcomposite.add(bty);
				addcomposite.add(btype);
				addcomposite.add(comb);
				addcomposite.add(combine);
				addcomposite.add(add);
				addcomposite.setLayout(new GridLayout(6,1));
				addcomposite.setVisible(true);
				
				_14211156_ÌïÀ«_7_Strategy composite = new _14211156_ÌïÀ«_7_Strategy();
				
				add.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
						composite.setstrategy(num.getText(), name.getText(), stype.getText(), Integer.parseInt(btype.getText()), combine.getText());
						if(controller.addStrategy(Integer.parseInt(btype.getText()), composite)==1){
							JFrame success = new JFrame();
							JLabel su = new JLabel("Add new composite strategy successfully!");
							success.setLocation(450, 450);
							success.setSize(450, 100);
							success.add(su);
							success.setLayout(new GridLayout());
							success.setVisible(true);
						}
					}
				});
			}
		});
	}
	
	public void deletestrategy(_14211156_ÌïÀ«_7_Controller controller){
		JFrame deletestrategyui;
		deletestrategyui = new JFrame("DeleteStrategyUI");
		deletestrategyui.setLocation(300, 100);
		deletestrategyui.setSize(400, 150);
		
		JLabel l1 = new JLabel("Please input the number of the strategy you want to delete.");
		JPanel p1 = new JPanel();
		JLabel l2 = new JLabel("Strategy number:");
		JTextField t1 = new JTextField();
		JButton b1 = new JButton("Delete!");
		
		p1.add(l2);
		p1.add(t1);
		p1.setLayout(new GridLayout(1,2));
		
		deletestrategyui.add(l1);
		deletestrategyui.add(p1);
		deletestrategyui.add(b1);
		deletestrategyui.setLayout(new GridLayout(3, 1));
		deletestrategyui.setVisible(true);
		
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String num = t1.getText();
				if(controller.deleteStrategy(num) == 1){
					JFrame success = new JFrame();
					JLabel su = new JLabel("Delete strategy successfully!");
					success.setLocation(450, 450);
					success.setSize(450, 100);
					success.add(su);
					success.setLayout(new GridLayout());
					success.setVisible(true);
				}
			}
		});
	}
	
	public void updatestrategy(_14211156_ÌïÀ«_7_Controller controller){
		JFrame updatestrategyui;
		updatestrategyui = new JFrame("UpdateStrategyUI");
		updatestrategyui.setLocation(300, 100);
		updatestrategyui.setSize(600, 300);
		
		JTextField old = new JTextField();
		JTextField num = new JTextField();
		JTextField name = new JTextField();
		JTextField stype = new JTextField();
		JTextField btype = new JTextField();
		JTextField discount = new JTextField();
		JButton update = new JButton("Update!");
		
		JLabel oldnu = new JLabel("OldStrategyNum:");
		JLabel nu = new JLabel("NewStrategyNum:");
		JLabel na = new JLabel("NewStrategyName:");
		JLabel sty = new JLabel("NewStrategyType:");
		JLabel bty = new JLabel("NewBookType:");
		JLabel dis = new JLabel("Discount or Composite:");
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		JPanel p4 = new JPanel();
		JPanel p5 = new JPanel();
		JPanel p6 = new JPanel();
		JPanel p7 = new JPanel();
		JPanel p8 = new JPanel();
		
		p1.add(nu);
		p1.add(num);
		p2.add(na);
		p2.add(name);
		p3.add(sty);
		p3.add(stype);
		p4.add(bty);
		p4.add(btype);
		p5.add(dis);
		p5.add(discount);
		p6.add(oldnu);
		p6.add(old);
		p1.setLayout(new GridLayout(1, 2));
		p2.setLayout(new GridLayout(1, 2));
		p3.setLayout(new GridLayout(1, 2));
		p4.setLayout(new GridLayout(1, 2));
		p5.setLayout(new GridLayout(1, 2));
		p6.setLayout(new GridLayout(1, 2));


		updatestrategyui.add(p6);
		updatestrategyui.add(p1);
		updatestrategyui.add(p2);
		updatestrategyui.add(p3);
		updatestrategyui.add(p4);
		updatestrategyui.add(p5);
		updatestrategyui.add(update);
		updatestrategyui.setLayout(new GridLayout(8, 1));
		updatestrategyui.setVisible(true);
		
		update.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String num1 = old.getText();
				_14211156_ÌïÀ«_7_Strategy newstra = new _14211156_ÌïÀ«_7_Strategy();
				newstra.setstrategy(num.getText(), name.getText(), stype.getText(), Integer.parseInt(btype.getText()), discount.getText());
				if(controller.updateStrategy(num1, newstra) == 1){
					JFrame success = new JFrame();
					JLabel su = new JLabel("Update strategy successfully!");
					success.setLocation(450, 450);
					success.setSize(450, 100);
					success.add(su);
					success.setLayout(new GridLayout());
					success.setVisible(true);
				}
			}
		});
		
		
	}
	
	public void searchstrategy(_14211156_ÌïÀ«_7_Controller controller){
		JFrame searchstrategyui;
		searchstrategyui = new JFrame("SearchStrategyUI");
		searchstrategyui.setLocation(300, 100);
		searchstrategyui.setSize(500, 150);
		
		JLabel l1 = new JLabel("StrategyNum:");
		JTextField t1 = new JTextField();
		JButton b1 = new JButton ("Search!");
		
		JPanel p1 = new JPanel();
		p1.add(l1);
		p1.add(t1);
		p1.setLayout(new GridLayout(1,2));
		
		searchstrategyui.add(p1);
		searchstrategyui.add(b1);
		searchstrategyui.setLayout(new GridLayout(2,1));
		searchstrategyui.setVisible(true);
		
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String num1 = t1.getText();
				_14211156_ÌïÀ«_7_Strategy strategy;
				if ( (strategy = controller.searchStrategy(num1)) != null ){
					 JFrame result = new JFrame("SearchResult");
					 JTextField num = new JTextField();
					 JTextField name = new JTextField();
					 JTextField stype = new JTextField();
					 JTextField btype = new JTextField();
					 JTextField combine = new JTextField();
					 
					 JLabel nu = new JLabel("StrategyNum:");
					 JLabel na = new JLabel("StrategyName:");
					 JLabel sty = new JLabel("StrategyType:");
					 JLabel bty = new JLabel("BookType:");
					 JLabel dis = new JLabel("Discount:");
					 result.setLocation(300, 250);
					 result.setSize(1200, 300);
					 result.setVisible(true);

					 num.setText(strategy.getnum());
					 name.setText(strategy.getname());
					 stype.setText(strategy.getstype());
					 btype.setText(String.valueOf(strategy.getbtype()));
					 combine.setText(strategy.getdiscount());
					 
					 result.add(nu);
					 result.add(num);
					 result.add(na);
					 result.add(name);
					 result.add(sty);
					 result.add(stype);
					 result.add(bty);
					 result.add(btype);
					 result.add(dis);
					 result.add(combine);
					 
					 result.setLayout(new GridLayout(5, 1));
				}
			}
		});
	}
}
