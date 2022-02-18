package tresEnRaya;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;


public class Frame3Raya extends JFrame {
	


	public Frame3Raya(Panel3Raya p) {
		/*
		 * creo una clase Toolkit q llama al metodo que me devuelve devuelve un objeto
		 * tipo toolkit con el medio por el que ejecuto mi programa. creo la clase
		 * dimension que llama al metodo para saber la resolucion o el tamaño de my
		 * ventana
		 * 
		 */

		setTitle("3 EN RAYA");
		Toolkit myScreen = Toolkit.getDefaultToolkit();
		Dimension myScreenSize = myScreen.getScreenSize();
		int myScreenHeight = myScreenSize.height;
		int myScreenWidth = myScreenSize.width;
		// ayudandome delos parametros altura y ancho de mi pantalla,establezco el
		// tamaño del frame
		setSize(myScreenWidth /5, myScreenHeight / 2);
		// localizo en el centro mi frame al ejecutarse.
		setLocation(myScreenWidth /4, myScreenHeight / 8);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.white);
		setResizable(false);
		add(p);
		p.setBackground(Color.white);
	
		
		

		Image miIcono = Toolkit.getDefaultToolkit().getImage("/Users/Lupe/eclipse-workspace/3enRaya.jfif");
		setIconImage(miIcono); // cambia el icono del frame que aparece por defecto arriba a la izq.

	}
}
