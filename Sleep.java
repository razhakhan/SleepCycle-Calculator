import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Sleep {
	JFrame f;
	JButton b1;
	JLabel l3;
	JLabel l4;
	JLabel l5;
	JLabel l6;
	JButton b2;
	JLabel l7;
	JButton b3;
	int a,b;
	JPanel p2;
	JPanel p1;
	JLabel l1;
	JLabel label1;
	JLabel label2;
	JScrollBar hour;
	JScrollBar min;
	int c;
	int d;
	JPanel p3;
	Sleep() {
		f=new JFrame();

		p2=new JPanel();
		p2.setBackground(Color.yellow);
		l3=new JLabel();
		l3.setText("***************** RAZHA'S SLEEP CYCLE CALCULATOR *****************");
		l4=new JLabel();
		l4.setText("Tired of waking up exhausted ???");
		l5=new JLabel("This Application calculates sleep cycles and finds the best time to wake up");
		l6=new JLabel("Waking you up at the most perfect time, feeling rested!");
		p2.add(l3); p2.add(l4); p2.add(l5); p2.add(l6);
		p2.setBounds(700,100,500,100);


		b1=new JButton("I WANT TO SLEEP AT");
		b1.setBackground(Color.orange);
		b1.setBounds(800,350,300,150);


		p1=new JPanel();
		p1.setBackground(Color.pink);
		l1=new JLabel("Select Time (HH-MM)");
            	label1 = new JLabel();          
    		label1.setHorizontalAlignment(JLabel.CENTER);    
    		label1.setSize(400,100);  
		label2 = new JLabel();          
    		label2.setHorizontalAlignment(JLabel.CENTER);    
    		label2.setSize(400,100);  
    		hour=new JScrollBar(JScrollBar.VERTICAL, 2, 0, 0, 23);  
    		min=new JScrollBar(JScrollBar.VERTICAL, 2, 0, 0, 59);  
		hour.addAdjustmentListener(new AdjustmentListener() {  
    			public void adjustmentValueChanged(AdjustmentEvent e) {  
				c=hour.getValue();
       				label1.setText("Hours : "+ c); 
				a=c;
    			}
 		});
		min.addAdjustmentListener(new AdjustmentListener() {  
    			public void adjustmentValueChanged(AdjustmentEvent e) {  
				d=min.getValue();
       				label2.setText("Minutes : "+ d);
				b=d;
    			}
 		});	
		p1.add(l1); p1.add(hour); p1.add(min); p1.add(label1); p1.add(label2);
		p1.setBounds(780,550,340,80);
		p1.setVisible(false);



		
		b3=new JButton("EXIT");
		b3.setBounds(900,800,100,50);
		b3.setBackground(Color.green);
		b3.setVisible(false);
		b3.addActionListener(new ActionListener() {
  			public void actionPerformed(ActionEvent e) {
     				System.exit(0);
  			}
		});

		b2=new JButton("SUBMIT");
		b2.setBounds(900,650,100,50);
		b2.setBackground(Color.green);
		b2.setVisible(false);
		b2.addActionListener(new ActionListener() {
  			public void actionPerformed(ActionEvent e) {
				cream(a,b);
     				b2.setVisible(false);
				b1.setVisible(false);
				p1.setVisible(false);
				b3.setVisible(true);
  			}
		});

		b1.addActionListener(new ActionListener() {
  			public void actionPerformed(ActionEvent e) {
     				p1.setVisible(true);
				b2.setVisible(true);	
  			} 
		});


		f.add(b1);
		f.add(b2);
		f.add(p1);
		f.add(p2);
		f.add(b3);
		f.setSize(400,400);
		f.getContentPane().setBackground(Color.BLUE);
		f.setLayout(null);
		f.setVisible(true);
	}
	void cream(int a,int b) {
			l7=new JLabel("THE BEST TIMES TO WAKE UP ARE : ");
			DefaultListModel<String> lx = new DefaultListModel<>();  
          		lx.addElement((((a+1)+(b+44)/60)%24) +":"+((b+44)%60)+"        -       "+"Nap for 1 hr 44 min");  
          		lx.addElement(((a+3)+(b+14)/60)%24+":"+((b+14)%60)+"        -       "+"Nap for 3 hrs 14 min");  
          		lx.addElement(((a+4)+(b+44)/60)%24+":"+((b+44)%60)+"        -       "+"Nap for 4 hrs 44 min");  
          		lx.addElement(((a+6)+(b+14)/60)%24+":"+((b+14)%60)+"        -       "+"Nap for 6 hrs 14 min");  
			lx.addElement(((a+7)+(b+44)/60)%24+":"+((b+44)%60)+"        -       "+"Nap for 7 hrs 44 min   (Best)");
			lx.addElement(((a+9)+(b+14)/60)%24+":"+((b+14)%60)+"        -       "+"Nap for 9 hrs 14 min   (Best)");
			lx.addElement(((a+10)+(b+44)/60)%24+":"+((b+44)%60)+"      -       "+"Nap for 10 hrs 44 min (Best)");
			lx.addElement(((a+12)+(b+14)/60)%24+":"+((b+14)%60)+"      -       "+"Nap for 12 hrs 14 min");
          		JList<String> list = new JList<>(lx);
			list.setFixedCellHeight(48);
    			list.setFixedCellWidth(250);
			list.setBackground(Color.cyan);
			p3=new JPanel();
			p3.setBackground(Color.orange);
			p3.setBounds(800,350,300,420);
			p3.add(l7);
			p3.add(list);
			p3.setVisible(true);
			f.add(p3);
	}
	
	public static void main(String args[])
	{
		new Sleep();		
	}
}