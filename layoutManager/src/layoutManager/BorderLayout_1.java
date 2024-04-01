package layoutManager;

import javax.swing.*;
import java.awt.*;


public class BorderLayout_1 {
	
JFrame frame;
public BorderLayout_1() {
	frame = new JFrame("Border Layout");
	
	JButton button = new JButton("North");
	JButton button1 = new JButton("South");
	JButton button2 = new JButton("East");
	JButton button3 = new JButton("West");
	JButton button4 = new JButton("Center");
	
	frame.add(button,BorderLayout.CENTER);
	frame.add(button1,BorderLayout.NORTH);
	frame.add(button2,BorderLayout.SOUTH);
	frame.add(button3,BorderLayout.EAST);
	frame.add(button4,BorderLayout.WEST);
	
	frame.setSize(550,550);
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// x ya basinca programi otomatik akpamayi saglar

}

	public static void main(String[] args) {
		new BorderLayout_1();

	}

}
