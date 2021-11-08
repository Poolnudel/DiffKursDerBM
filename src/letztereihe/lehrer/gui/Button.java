package letztereihe.lehrer.gui;

import javax.swing.JButton;

@SuppressWarnings("serial")
public class Button extends JButton {
	/**
	 * @param x starting position x axis
	 * @param y starting position y axis
	 * @param weidth weidth of the button 
	 * @param height height of the button
	 */
	public Button(int x, int y, int weidth, int height) {
		super();
		setBounds(x, y, weidth, height);

	}
}
