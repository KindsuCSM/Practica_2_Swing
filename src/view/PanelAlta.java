package view;

import controller.CtrlEmpleado;
import controller.CtrlPanelAlta;
import controller.CtrlPanelVer;

import javax.swing.*;
import java.awt.*;

public class PanelAlta extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel lblNombre, lblFecha, lblSalario, lblDni, lblSalarioMax;
	public static JTextField txtNombre, txtFecha, txtSalario, txtDni, txtSalarioMax;
	public JButton btnGuardar, btnCancelar;


	private CtrlPanelAlta ctrlPanAlta;


	public PanelAlta() {

		setLayout(new GridLayout(0, 2, 10, 10));
		addComponents();
		addListeners();
	}

	private void addComponents() {

		lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 16));
		add(lblNombre);

		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Tahoma", Font.PLAIN, 16));
		add(txtNombre);

		lblDni = new JLabel("DNI:");
		lblDni.setFont(new Font("Tahoma", Font.PLAIN, 16));
		add(lblDni);

		txtDni = new JTextField();
		txtDni.setFont(new Font("Tahoma", Font.PLAIN, 16));
		add(txtDni);

		lblFecha = new JLabel("<html><p>Fecha de nacimiento (dd-mm-aaaa):</html></p>");
		lblFecha.setFont(new Font("Tahoma", Font.PLAIN, 16));
		add(lblFecha);

		txtFecha = new JTextField();
		txtFecha.setFont(new Font("Tahoma", Font.PLAIN, 16));
		add(txtFecha);

		lblSalario = new JLabel("Salario:");
		lblSalario.setFont(new Font("Tahoma", Font.PLAIN, 16));
		add(lblSalario);

		txtSalario = new JTextField();
		txtSalario.setFont(new Font("Tahoma", Font.PLAIN, 16));
		add(txtSalario);

		lblSalarioMax = new JLabel("Salario máximo:");
		lblSalarioMax.setFont(new Font("Tahoma", Font.PLAIN, 16));
		add(lblSalarioMax);

		txtSalarioMax = new JTextField();
		txtSalarioMax.setFont(new Font("Tahoma", Font.PLAIN, 16));
		add(txtSalarioMax);

		btnGuardar = new JButton("Guardar");
		btnGuardar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		add(btnGuardar);

		btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		add(btnCancelar);





		ctrlPanAlta = new CtrlPanelAlta();

	}

	private void addListeners() {

		btnGuardar.addActionListener(e -> {



			ctrlPanAlta.guardarEmpleado(txtNombre.getText(), txtDni.getText(), txtFecha.getText(),
					txtSalario.getText(), txtSalarioMax.getText());
			borrarDatos();
		});

		btnCancelar.addActionListener(e -> {
			borrarDatos();
		});
	}



	private void borrarDatos(){
		txtNombre.setText("");
		txtDni.setText("");
		txtFecha.setText("");
		txtSalario.setText("");
		txtSalarioMax.setText("");
	}

}
