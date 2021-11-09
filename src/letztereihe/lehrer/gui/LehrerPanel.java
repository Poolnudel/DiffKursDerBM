package letztereihe.lehrer.gui;

import java.awt.Color;
import java.awt.Rectangle;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class LehrerPanel extends JPanel /*implements ActionListener*/{
	
	public LehrerPanel(/*String title,Rectangle bounds*/) {
		super();
		setBounds(50, 50, 100, 100);
		setBackground(Color.lightGray);
		setLayout(null);
		setVisible(true);
		
	}
}
