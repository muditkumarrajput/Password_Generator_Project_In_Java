package test_files;
//java Program to create a slider with min and
//max value and major and minor ticks painted.
import javax.swing.event.*;
import java.awt.*;
import javax.swing.*;
class demo_slider extends JFrame implements ChangeListener {

	// frame
	static JFrame f;

	// slider
	static JSlider b;

	// label
	static JLabel l;

	// main class
	public static void main(String[] args)
	{
		// create a new frame
		f = new JFrame("frame");

		// create a object
		demo_slider s = new demo_slider();

		// create label
		l = new JLabel();

		// create a panel
		JPanel p = new JPanel();

		// create a slider
		b = new JSlider(0, 200, 120);

		// paint the ticks and tracks
		b.setPaintTrack(true);
		b.setPaintTicks(true);
		b.setPaintLabels(true);

		// set spacing
		b.setMajorTickSpacing(50);
		b.setMinorTickSpacing(1);

		// setChangeListener
		b.addChangeListener(s);

		// add slider to panel
		p.add(b);
		p.add(l);

		f.add(p);

		// set the text of label
		l.setText("value of Slider is =" + b.getValue());

		// set the size of frame
		f.setSize(300, 300);

		f.show();
	}

	// if JSlider value is changed
	public void stateChanged(ChangeEvent e)
	{
		l.setText("value of Slider is =" + b.getValue());
	}
}
