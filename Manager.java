package tresEnRaya;

import java.awt.Color;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Manager {

	public JButton[][] tablero;
	private int puntosJ1;
	private int puntosJ2;
	private boolean turno;
	private int i;
	private int j;

	public static Manager managerImplements;

	public Manager() {

		JButton[][] t = {

				{ Panel3Raya.panel3RayaImplements.button00, Panel3Raya.panel3RayaImplements.button01,
						Panel3Raya.panel3RayaImplements.button02 },
				{ Panel3Raya.panel3RayaImplements.button10, Panel3Raya.panel3RayaImplements.button11,
						Panel3Raya.panel3RayaImplements.button12 },
				{ Panel3Raya.panel3RayaImplements.button20, Panel3Raya.panel3RayaImplements.button21,
						Panel3Raya.panel3RayaImplements.button22 } };
		tablero = t;
		puntosJ1 = 0;
		puntosJ2 = 0;
		turno = true;

		managerImplements = this;
		inicializarTablero();

	}

	public JButton[][] getTablero() {
		return tablero;
	}

	public void setTablero(JButton[][] tablero) {
		this.tablero = tablero;
	}

	public int getPuntosJ1() {
		return puntosJ1;
	}

	public void setPuntosJ1(int puntosJ1) {
		this.puntosJ1 = puntosJ1;
	}

	public int getPuntosJ2() {
		return puntosJ2;
	}

	public void setPuntosJ2(int puntosJ2) {
		this.puntosJ2 = puntosJ2;
	}

	public boolean isTurno() {
		return turno;
	}

	public void setTurno(boolean turno) {
		this.turno = turno;
	}

	public void inicializarTablero() {

		turno();

		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero.length; j++) {

				tablero[i][j].setText("");
				tablero[i][j].setSelected(false);
				tablero[i][j].setBorder(BorderFactory.createLineBorder(Color.black, 2, false));
				Image defaultImg = new ImageIcon("/Users/Lupe/eclipse-workspace/nube2.jfif").getImage();
				ImageIcon img = new ImageIcon(defaultImg.getScaledInstance(tablero[i][j].getWidth(),
						tablero[i][j].getHeight(), Image.SCALE_SMOOTH));
				tablero[i][j].setIcon(img);

			}

		}

	}

	public void turno() {// cambia el turno automaticamente y lo muestra

		if (turno) {
			Panel3Raya.panel3RayaImplements.player1.setBorder(BorderFactory.createLineBorder(Color.green, 2, false));
			Panel3Raya.panel3RayaImplements.player2.setBorder(BorderFactory.createLineBorder(Color.white, 2, false));
		} else {
			Panel3Raya.panel3RayaImplements.player2.setBorder(BorderFactory.createLineBorder(Color.green, 2, false));
			Panel3Raya.panel3RayaImplements.player1.setBorder(BorderFactory.createLineBorder(Color.white, 2, false));
		}

		turno = !turno;
	}

	public void compruebaPosicionVacia() {
		// meto por parametros posicion de la matriz
		// comprueba que la podsicion no ha sido previamente seleccionada

		if (tablero[i][j].isSelected()) {
			JOptionPane.showInternalMessageDialog(null, "Elija otra posición en el tablero");
			turno();

		} else {

		}
	}

	public void elejirPosicion(int i, int j) {// marca y seleciona posicion elegida
		this.i = i;
		this.j = j;

		compruebaPosicionVacia();
		tablero[i][j].setBorder(BorderFactory.createLineBorder(Color.green, 2, false));
		tablero[i][j].setSelected(true);

		muestraImagenJugador(); // aparece imagen segun turno

	}

	public void muestraImagenJugador() {// pulso posicion si es turno J1 sale perrito, J2 gatito

		if (turno) {

			ImageIcon img2 = new ImageIcon("/Users/Lupe/eclipse-workspace/gatito.png");

			tablero[i][j].setIcon(new ImageIcon(img2.getImage().getScaledInstance(tablero[i][j].getWidth(),
					tablero[i][j].getHeight(), Image.SCALE_SMOOTH)));

			tablero[i][j].setText("G");

		} else

		{
			ImageIcon img1 = new ImageIcon("/Users/Lupe/eclipse-workspace/perrito.png");

			tablero[i][j].setIcon(new ImageIcon(img1.getImage().getScaledInstance(tablero[i][j].getWidth(),
					tablero[i][j].getHeight(), Image.SCALE_SMOOTH)));
			tablero[i][j].setText("P");

		}

	}

	public boolean tableroLLeno() {

		for (int i = 0; i < tablero.length; i++) { // recorre filas
			for (int j = 0; j < tablero.length; j++) { // recorre colunas
				if (!tablero[i][j].isSelected()) {// comprueba que hay posiciones sin seleccional

					return false;// el tablero NO estaria lleno
				}
			}
		}

		return true; // tablero estaria lleno

	}


	public boolean coincidenciaPerrito(JButton[][] matriz) {

		if ((matriz[0][0].getText().equals("P")) && (matriz[0][1].getText().equals("P"))
				&& (matriz[0][2].getText().equals("P"))) {

			return true;
		}

		if ((matriz[1][0].getText().equals("P")) && (matriz[1][1].getText().equals("P"))
				&& (matriz[1][2].getText().equals("P"))) {

			return true;
		}

		if ((matriz[2][0].getText().equals("P")) && (matriz[2][1].getText().equals("P"))
				&& (matriz[2][2].getText().equals("P"))) {

			return true;
		}
		if ((matriz[0][0].getText().equals("P")) && (matriz[1][0].getText().equals("P"))
				&& (matriz[2][0].getText().equals("P"))) {

			return true;
		}

		if ((matriz[0][1].getText().equals("P")) && (matriz[1][1].getText().equals("P"))
				&& (matriz[2][1].getText().equals("P"))) {

			return true;
		}

		if ((matriz[0][2].getText().equals("P")) && (matriz[1][2].getText().equals("P"))
				&& (matriz[2][2].getText().equals("P"))) {

			return true;
		}
		if ((matriz[0][0].getText().equals("P")) && (matriz[1][1].getText().equals("P"))
				&& (matriz[2][2].getText().equals("P"))) {

			return true;
		}

		if ((matriz[2][0].getText().equals("P")) && (matriz[1][1].getText().equals("P"))
				&& (matriz[0][2].getText().equals("P"))) {

			return true;
		}

		return false;
	}

	public boolean coincidenciaGatito(JButton[][] matriz) {

		if ((matriz[0][0].getText().equals("G")) && (matriz[0][1].getText().equals("G"))
				&& (matriz[0][2].getText().equals("G"))) {

			return true;
		}

		if ((matriz[1][0].getText().equals("G")) && (matriz[1][1].getText().equals("G"))
				&& (matriz[1][2].getText().equals("G"))) {

			return true;
		}

		if ((matriz[2][0].getText().equals("G")) && (matriz[2][1].getText().equals("G"))
				&& (matriz[2][2].getText().equals("G"))) {

			return true;
		}
		if ((matriz[0][0].getText().equals("G")) && (matriz[1][0].getText().equals("G"))
				&& (matriz[2][0].getText().equals("G"))) {

			return true;
		}

		if ((matriz[0][1].getText().equals("G")) && (matriz[1][1].getText().equals("G"))
				&& (matriz[2][1].getText().equals("G"))) {

			return true;
		}

		if ((matriz[0][2].getText().equals("G")) && (matriz[1][2].getText().equals("G"))
				&& (matriz[2][2].getText().equals("G"))) {

			return true;
		}
		if ((matriz[0][0].getText().equals("G")) && (matriz[1][1].getText().equals("G"))
				&& (matriz[2][2].getText().equals("G"))) {

			return true;
		}

		if ((matriz[2][0].getText().equals("G")) && (matriz[1][1].getText().equals("G"))
				&& (matriz[0][2].getText().equals("G"))) {

			return true;
		}

		return false;
	}

	public boolean finPartida() {

		if (tableroLLeno() || coincidenciaGatito(tablero) || coincidenciaPerrito(tablero)) {

			JOptionPane.showInternalMessageDialog(null, "FIN DE PARTIDA");
			return true;
		}
		return false;
	}

	public void ganaJ1() {

		puntosJ1++;

		Panel3Raya.panel3RayaImplements.scoreP1.setText(puntosJ1 + "");

	}

	public void ganaJ2() {

		puntosJ2++;

		Panel3Raya.panel3RayaImplements.scoreP2.setText(puntosJ2 + "");

	}

	public void checkGanador() {
		if (coincidenciaPerrito(tablero)) {
			ganaJ1();
		}
		if (coincidenciaGatito(tablero)) {
			ganaJ2();
		}
	}

	public void reset() {

		inicializarTablero();

	}

}
