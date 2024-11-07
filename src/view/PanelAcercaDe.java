package view;

import javax.swing.*;
import java.awt.*;

public class PanelAcercaDe extends JPanel {
	private static final long serialVersionUID = 1L;
	public JLabel lblInformacion, lblInformacionContenido, lblAutores, lblAutoresJulian, lblAutoresCristina;
	public PanelAcercaDe() {
		setLayout(new GridLayout(0, 1, 10, 10));
		initComponents();
	}
	private void initComponents() {
		lblInformacion = new JLabel("Información sobre la aplicación: ");
		lblInformacion.setFont(new Font("Tahoma", Font.PLAIN, 20));
		add(lblInformacion);

		lblInformacionContenido = new JLabel();
		lblInformacionContenido.setText("<html><p> &emsp;Esta aplicación trabaja sobre una lista de empleados y nos permite mostrarla por pantalla o agregar un empleado si lo requiere el usuario.</p></html>");
		lblInformacionContenido.setFont(new Font("Tahoma", Font.PLAIN, 16));
		add(lblInformacionContenido);

		lblAutores = new JLabel("Autores: ");
		lblAutores.setFont(new Font("Tahoma", Font.PLAIN, 20));
		add(lblAutores);

		lblAutoresJulian = new JLabel("<html><p> &emsp; - Julian Cabanillas Blanco</p></html>");
		lblAutoresJulian.setFont(new Font("Tahoma", Font.PLAIN, 16));
		add(lblAutoresJulian);

		lblAutoresCristina = new JLabel("<html><p> &emsp; - Cristina Sánchez Moreno</p></html>");
		lblAutoresCristina.setFont(new Font("Tahoma", Font.PLAIN, 16));
		add(lblAutoresCristina);

	}


}
