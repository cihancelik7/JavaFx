package layoutManager;

import java.awt.*;

import java.awt.event.*;
import java.awt.event.*;

import javax.swing.*;

public class CardLayout_1 extends JFrame implements ActionListener{
CardLayout cardLayout;
JButton b1,b2,b3;
Container container;

	public CardLayout_1()  {
	container = getContentPane();
	cardLayout = new CardLayout(40,30); // 40 soldan ve sagdan olan bosluk 30 ise yukaridan ve asagidan
	container.setLayout(cardLayout);
	
	b1 = new JButton("Siparisler");
	b2 = new JButton("Ciro");
	b3 = new JButton("Kar");
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	
	container.add(b1);
	container.add(b2);
	container.add(b3);
}

	public static void main(String[] args) {
		CardLayout_1 a = new CardLayout_1();
		a.setSize(400,400);
		a.setVisible(true);
		a.setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
			cardLayout.next(container);
			
		
	}

}
