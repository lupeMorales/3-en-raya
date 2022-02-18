package tresEnRaya;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Image;
import javax.swing.JLabel;

public class Panel3Raya extends JPanel {

	Button3Raya button00, button01, button02, button10, button11, button12, button20, button21, button22, reset;
	Label3Raya player1, player2, scoreP1, scoreP2;
	public static Panel3Raya panel3RayaImplements;

	public Panel3Raya() {
		super();

		panel3RayaImplements = this;
		setLayout(null);
		fillThePanel();

	}

	public void fillThePanel() {

		scoreP1 = new Label3Raya("0", 50, 340, 90, 20, 0);
		add(scoreP1);

		scoreP2 = new Label3Raya("0", 205, 340, 90, 20, 0);
		add(scoreP2);

		player1 = new Label3Raya("", 50, 295, 40, 40, 0);
		add(player1);
		ImageIcon p1 = new ImageIcon("/Users/Lupe/eclipse-workspace/perrito.png");
		player1.setIcon(new ImageIcon(
				p1.getImage().getScaledInstance(player1.getWidth(), player1.getHeight(), Image.SCALE_SMOOTH)));

		player2 = new Label3Raya("", 205, 293, 40, 40, 0);
		add(player2);
		ImageIcon p2 = new ImageIcon("/Users/Lupe/eclipse-workspace/gatito.png");
		player2.setIcon(new ImageIcon(
				p2.getImage().getScaledInstance(player2.getWidth(), player2.getHeight(), Image.SCALE_SMOOTH)));

		button00 = new Button3Raya(0,"",39, 60);
		add(button00);

		button01 = new Button3Raya(1,"",110, 60);
		add(button01);

		button02 = new Button3Raya(2,"",182, 60);
		add(button02);

		button10 = new Button3Raya(3,"",39, 131);
		add(button10);

		button11 = new Button3Raya(4,"",110, 131);
		add(button11);

		button12 = new Button3Raya(5,"",182, 131);
		add(button12);

		button20 = new Button3Raya(6,"",39, 202);
		add(button20);
		button21 = new Button3Raya(7,"",110, 202);
		add(button21);
		button22 = new Button3Raya(8,"",182, 202);
		add(button22);
		
		reset = new Button3Raya(9,"RESET", 118, 320, 70, 20);
		add(reset);

	}

}
