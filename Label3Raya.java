package tresEnRaya;

import java.awt.Font;

import javax.swing.JLabel;

public class Label3Raya extends JLabel {

	int idLabel;

	public Label3Raya(String texto,int x, int y, int w, int h, int id) {

		idLabel = 0;
		setBounds(x, y, w, h);
		setText(texto);
		Font fuente2 = new Font("arial", Font.BOLD, 15);
		setFont(fuente2);
	}
	
}
