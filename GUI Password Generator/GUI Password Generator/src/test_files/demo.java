package test_files;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.metal.MetalCheckBoxIcon;

public class demo extends JFrame implements ChangeListener, ItemListener {
	static JFrame f;
	static JSlider b;
	static JLabel ls;
	static JCheckBox c1,c2,c3,c4;
	static JTextField tp;
	public static void main(String[] args) {
	//frame
	f=new JFrame("Password Generator"); 
	// object of class
	demo ob=new demo();
	ls=new JLabel();
	JPanel p = new JPanel();
	p.setBounds(400,100,400,48);
	b = new JSlider(0, 32, 8);
	// paint the ticks and tracks
	b.setPaintTrack(true);
	b.setPaintTicks(true);
	b.setPaintLabels(true);
	// set spacing
	b.setMajorTickSpacing(4);
	b.setMinorTickSpacing(1);
	// setChangeListener
	b.addChangeListener(ob);
	// add slider to panel
	p.add(b);
	p.add(ls);
	f.add(p);
	// set the text of label
	ls.setText("value = " + b.getValue());
	
	
	//heading
	JLabel l=new JLabel("PASSWORD GENERATOR");
	l.setBounds(350,10,500,50);
	l.setFont(new Font("Serif", Font.BOLD, 30));
	l.setForeground(Color.RED);
	f.add(l);
	//length
	JLabel l1=new JLabel("Password Length: ");
	l1.setBounds(100,100,500,30);
	l1.setFont(new Font("Serif", Font.BOLD, 20));
	l1.setForeground(Color.blue);
	f.add(l1);
	//length value
	

	
	//Symbols include or not
	JLabel l2=new JLabel("Is Password Include Symbols:");
	l2.setBounds(100,150,500,30);
	l2.setFont(new Font("Serif", Font.BOLD, 20));
	l2.setForeground(Color.blue);
	f.add(l2);
	// check of symbol
	c1 = new JCheckBox("e.g. @#$%...", true);
	c1.setBounds(400,150,200,30);
	c1.setFont(new Font("Serif", Font.BOLD, 20));
	c1.setIcon (new MetalCheckBoxIcon() {
	    protected int getControlSize() { return 30; }
	});
	f.add(c1);
	c1.addItemListener(ob);
	
	
	
	//numbers include or not
	JLabel l3=new JLabel("Is Password Include Numbers: ");
	l3.setBounds(100, 200, 500, 30);
	l3.setFont(new Font("Serif", Font.BOLD, 20));
	l3.setForeground(Color.blue);
	f.add(l3);
	// check for numbers
	c2 = new JCheckBox("e.g. 01234...", true);
	c2.setBounds(400,200,200,30);
	c2.setFont(new Font("Serif", Font.BOLD, 20));
	c2.setIcon (new MetalCheckBoxIcon() {
	    protected int getControlSize() { return 30; }
	});
	f.add(c2);
	c2.addItemListener(ob);
	
	// Uppercase characters
	JLabel l4=new JLabel("Is Password Include Uppercase:");
	l4.setBounds(100, 250, 500, 30);
	l4.setFont(new Font("Serif", Font.BOLD, 20));
	l4.setForeground(Color.blue);
	f.add(l4);
	// check for Upparcase
	c3 = new JCheckBox("e.g. ABC...", true);
	c3.setBounds(400,250,200,30);
	c3.setFont(new Font("Serif", Font.BOLD, 20));
	c3.setIcon (new MetalCheckBoxIcon() {
	    protected int getControlSize() { return 30; }
	});
	f.add(c3);
	c3.addItemListener(ob);
	
	//LowerCase characters
	JLabel l5=new JLabel("Is Password Include Lowercase:");
	l5.setBounds(100, 300, 500, 30);
	l5.setFont(new Font("Serif", Font.BOLD, 20));
	l5.setForeground(Color.blue);
	f.add(l5);
	// check for lowercase
	c4 = new JCheckBox("e.g. abc...", true);
	c4.setBounds(400,300,200,30);
	c4.setFont(new Font("Serif", Font.BOLD, 20));
	c4.setIcon (new MetalCheckBoxIcon() {
	    protected int getControlSize() { return 30; }
	});
	f.add(c4);
	c4.addItemListener(ob);
	
	//Button
	JButton bt=new JButton("Generate password");
	bt.setBounds(350, 500, 200,50);
	bt.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			tp.setText("Button Clicked");  
		          
		}
		}); 
	f.add(bt);
	//result
	JLabel result= new JLabel("Password=");
	result.setBounds(100,400,500,30);
	result.setFont(new Font("Serif", Font.BOLD, 20));
	result.setForeground(Color.red);
	
	tp =new JTextField("Your Password ");
	tp.setBounds(400,400,200,30);
	tp.setFont(new Font("Serif", Font.BOLD, 20));
	tp.setForeground(Color.red);
	
	
	JPanel pr=new JPanel();
	pr.setBounds(100,400,720,60);
	pr.add(result);
	pr.add(tp);
	f.add(pr);
	
	
	JLabel r= new JLabel("Password=");
	r.setBounds(10,10,10,10);
	f.add(r);
	//frame
	f.setVisible(true);
	f.setLayout(null);
	f.getContentPane().setBackground(Color.LIGHT_GRAY);
	f.setSize(1080,720);
}
	public void stateChanged(ChangeEvent e)
	{
		ls.setText("value = " + b.getValue());
	}
	public void itemStateChanged(ItemEvent e)
	{
		// if the state of checkbox1 is changed
		if (e.getSource() == c1) {
			if (e.getStateChange() == 1)
				tp.setText("C1");
			else
				tp.setText("!C1");
		}

		// if the state of checkbox2 is changed
		else if(e.getSource() == c2){
			if (e.getStateChange() == 1)
				tp.setText("C2");
			else
				tp.setText("!C2");
		}
		else if(e.getSource() == c3){
			if (e.getStateChange() == 1)
				tp.setText("C3");
			else
				tp.setText("!C3");
		}
		else {
			if (e.getStateChange() == 1)
				tp.setText("C4");
			else
				tp.setText("!C4");
		}
	}
}
	
	

