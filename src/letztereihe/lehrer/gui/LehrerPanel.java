package letztereihe.lehrer.gui;

import java.awt.Color;
import java.awt.Rectangle;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

public class LehrerPanel extends JPanel implements ActionListener{
	
	public LehrerPanel(Rectangle bounds) {
		super();
		
		setBounds(bounds);
		setBackground(Color.lightGray);
		setLayout(null);
		
	}
}
