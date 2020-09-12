import java.awt.*
import java.awt.event.*;
import javax.swing.*;
class OnlineQuiz extends JFrame implements ActionListener
{
	JLabel l;
	JRadioButton rb[] = new JRadioButton[5];
	JButton b1,b2;
	ButtonGroup bg;
	int count=0,current=0,x=1,y=1,now=0;
	int m[]=new int[10];
	OnlineQuiz(String s)
	{
		super(s);
		l = new JLabel();
		add(l);
		bg = new ButtonGroup();
		for(int i=0;i<5;i++)
		{
			rb[i] = new JRadioButton();
			add(rb[i]);
			bg.add(rb[i]);
		}
		b1 = new JButton("Next");
		b2 = new JButton("Bookmark");
		b1.addActionListener(this);
		b2.addActionListener(this);
		add.b1();
		add.(b2);
		set();
		l.setBounds(30,40,450,20);
		rb[0].setBounds(50,80,100,20);
		rb[1].setBounds(50,110,100,20);
		rb[2].setBounds(50,140,100,20);
		rb[3].setBounds(50,170,100,20);
		b1.setBounds(100,240,100,30);
		b2.setBounds(270,240,100,30);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setLocation(250,100);
		setVisible(true);
		setSize(600,350);
		
		
	}
	
}
