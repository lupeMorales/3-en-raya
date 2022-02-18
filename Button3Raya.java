package tresEnRaya;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;

public class Button3Raya extends JButton implements ActionListener {

	public int buttonId;

	public Button3Raya(int id, String txt, int x, int y) {

		buttonId = id;
		setText(txt);
		setSize(70, 70);
		setLocation(x, y);
		setBorder(BorderFactory.createLineBorder(Color.black, 2, false));
		setBackground(Color.white);
		setOpaque(true);
		setSelected(false);
		addActionListener(this);

	}

	public Button3Raya(int id, String txt, int x, int y, int w, int h) {
		buttonId = id;

		setText(txt);
		setBounds(x, y, w, h);
		setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 2, false));
		setBackground(Color.LIGHT_GRAY);
		setOpaque(true);
		setSelected(false);
		addActionListener(this);

	}

	public int getButtonId() {
		return buttonId;
	}

	public void setButtonId(int buttonId) {
		this.buttonId = buttonId;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (buttonId == 0) {
			Manager.managerImplements.elejirPosicion(0, 0);

		}
		if (buttonId == 1) {
			Manager.managerImplements.elejirPosicion(0, 1);

		}
		if (buttonId == 2) {
			Manager.managerImplements.elejirPosicion(0, 2);

		}

		if (buttonId == 3) {
			Manager.managerImplements.elejirPosicion(1, 0);

		}
		if (buttonId == 4) {
			Manager.managerImplements.elejirPosicion(1, 1);

		}
		if (buttonId == 5) {
			Manager.managerImplements.elejirPosicion(1, 2);

		}
		if (buttonId == 6) {
			Manager.managerImplements.elejirPosicion(2, 0);

		}
		if (buttonId == 7) {
			Manager.managerImplements.elejirPosicion(2, 1);

		}
		if (buttonId == 8) {
			Manager.managerImplements.elejirPosicion(2, 2);

		}


		if (buttonId == 9) {
			Manager.managerImplements.reset();
		}

		Manager.managerImplements.turno();

		Manager.managerImplements.finPartida();
		Manager.managerImplements.checkGanador();
	}
}
