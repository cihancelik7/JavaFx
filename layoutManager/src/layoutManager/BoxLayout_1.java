package layoutManager;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;

public class BoxLayout_1 extends Frame {
	JButton buttons[];
	public BoxLayout_1() {
		buttons = new JButton[8]; // array olusturuldu
		
		for(int i = 0; i< buttons.length; i++) {
			buttons[i] = new JButton("Button "+(i+1));
			add(buttons[i]);
		}
		addWindowListener( new WindowListener() {
								// hata vermesinin sebebi gereksiz methodlar var onlari sildigimiz icin veriyor fakat calistirir.
		

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0); // swing kutuphanesindeki frame olusturmadigimiz icin exit icin windowlistener ya da adapter eklemek gerekir
			}


		
			
		});
		setLayout(new BoxLayout(this,BoxLayout.PAGE_AXIS));
		setSize(350,350);
		setVisible(true);

	}

	public static void main(String[] args) {
		// x ve y eksesine gore buttonlari siralayabiliriz

		new BoxLayout_1();
	}

}
