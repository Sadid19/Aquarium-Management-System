package Classes;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FTank extends JFrame implements ActionListener
{
	private JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
	private JButton b1,b2,b3,b4,b5,b6,b7,b8;
	private JPanel p1;
	private Home home;
	private Login login;
	
	public FTank(Home home,Login login)
	{
		super(" Fish Tank ");
		this.home=home;
		this.login=login;
		this.setSize(800,630);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLayout(null);
		
		
		
		p1 = new JPanel();
		p1.setBounds(0,0,800,630);
		//p1.setBackground(Color.decode("#99eaff"));
		p1.setBackground(Color.WHITE);
		this.setLocationRelativeTo(null);
		p1.setLayout(null);
	
    //JLabel			
		l2 = new JLabel("EXCLUSIVE COLLECTION -> FISH TANK");
		l2.setBounds(18,60,500,25);
		l2.setFont(new Font("Segoe UI",Font.BOLD,20));
		p1.add(l2);
		
		l3 = new JLabel();
		l3.setBounds(150,300,500,15);
		l3.setFont(new Font("Segoe UI",Font.PLAIN,15));
		p1.add(l3);
		
		l4 = new JLabel();
		l4.setBounds(190,320,200,15);
		l4.setFont(new Font("Segoe UI",Font.PLAIN,15));
		p1.add(l4);
		
		l5 = new JLabel();
		l5.setBounds(490,300,500,15);
		l5.setFont(new Font("Segoe UI",Font.PLAIN,15));
		p1.add(l5);
		
		l7 = new JLabel();
		l7.setBounds(510,320,200,15);
		l7.setFont(new Font("Segoe UI",Font.PLAIN,15));
		p1.add(l7);
		
		l6 = new JLabel();
		l6.setBounds(170,535,500,15);
		l6.setFont(new Font("Segoe UI",Font.PLAIN,15));
		p1.add(l6);
		
		l8 = new JLabel();
		l8.setBounds(200,555,500,15);
		l8.setFont(new Font("Segoe UI",Font.PLAIN,15));
		p1.add(l8);
		
		l1 = new JLabel();
		l1.setBounds(490,535,500,16);
		l1.setFont(new Font("Segoe UI",Font.PLAIN,15));
		p1.add(l1);
		
		l9 = new JLabel();
		l9.setBounds(510,555,500,15);
		l9.setFont(new Font("Segoe UI",Font.PLAIN,15));
		p1.add(l9);
		
		
	//JButton(as Image)
	    ImageIcon icon1 = new ImageIcon("Images/back.png");
		b1 = new JButton(icon1);
		b1.setBounds(18,20,35,35);
		b1.addActionListener(this);
		b1.setFocusPainted(false);
        b1.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b1.setContentAreaFilled(false);
	    b1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		p1.add(b1);	
		
		
		/*ImageIcon icon2 = new ImageIcon("Images/cart.png");
		b3 = new JButton(icon2);
		b3.setBounds(720,25,30,30);
	    //b3.addActionListener(this);
	    b3.setFocusable(false);
	    b3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	    p1.add(b3);*/
		
		ImageIcon icon3 = new ImageIcon("Images/set1.jpg");
		b4 = new JButton(icon3);
		b4.setBounds(140,110,200,184);
	    b4.addActionListener(this);
	    b4.setFocusable(false);
	    b4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	    p1.add(b4);
		
		ImageIcon icon4 = new ImageIcon("Images/set2.jpg");
		b5 = new JButton(icon4);
		b5.setBounds(460,110,200,184);
	    b5.addActionListener(this);
	    b5.setFocusable(false);
	    b5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	    p1.add(b5);
	
		ImageIcon icon6 = new ImageIcon("Images/set5.jpg");
		b6 = new JButton(icon6);
		b6.setBounds(140,350,200,184);
	    b6.addActionListener(this);
	    b6.setFocusable(false);
	    b6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	    p1.add(b6);
		
		ImageIcon icon7 = new ImageIcon("Images/set6.jpg");
		b7 = new JButton(icon7);
		b7.setBounds(460,350,200,184);
	    b7.addActionListener(this);
	    b7.setFocusable(false);
	    b7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	    p1.add(b7);
		for(int i=0; i<home.info.length; i++)
				{
					
					if(home.info[i]!=null)
					{
						 String sp[] = home.info[i].split("/");
						 if(sp[1].equals("17"))
						 {
						    l3.setText(sp[0]);
							l4.setText("BDT "+sp[2]+"tk");
							
						 }
						else if(sp[1].equals("18"))
						 {
						    l5.setText(sp[0]);
							l7.setText("BDT "+sp[2]+"tk");
							
						 }
						 else if(sp[1].equals("19"))
						 {
						    l6.setText(sp[0]);
							l8.setText("BDT "+sp[2]+"tk");
							
						 }
						  else if(sp[1].equals("20"))
						 {
						    l1.setText(sp[0]);
							l9.setText("BDT "+sp[2]+"tk");
							
						 }
					}
					
				}
		this.add(p1);
        setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==b1)
		{
         this.dispose();
		 home.setVisible(true);
		}
		if(e.getSource()==b4)
		{ 
	        home.a=17;
           this.setVisible(false);
		   new Buy(this,home);
		}
		if(e.getSource()==b5)
		{
          home.a=18;
           this.setVisible(false);
		   new Buy(this,home);
		}
		if(e.getSource()==b6)
		{
           home.a=19;
           this.setVisible(false);
		   new Buy(this,home);
		}
		if(e.getSource()==b7)
		{
           home.a=20;
           this.setVisible(false);
		   new Buy(this,home);
		}
	}
 
		
}