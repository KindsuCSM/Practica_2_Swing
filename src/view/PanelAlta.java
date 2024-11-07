package view;

import controller.CtrlEmpleado;
import controller.CtrlPanelAlta;
import controller.CtrlPanelVer;

import javax.swing.*;
import java.awt.*;

public class PanelAlta extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel lblNombre, lblFecha, lblSalario, lblDni, lblSalarioMax, txtTitulo;
	public JTextField txtNombre, txtFecha, txtSalario, txtDni, txtSalarioMax;
	public JButton btnGuardar, btnCancelar;

	private JPanel panelMenu;
	private CtrlPanelAlta ctrlPanAlta;


	public PanelAlta() {

		setLayout(new BorderLayout(5,5));
		panelMenu = new JPanel(new GridLayout(0, 2, 10, 10));

		addComponents();
		addListeners();
	}

	private void addComponents() {

		lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelMenu.add(lblNombre);

		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelMenu.add(txtNombre);

		lblDni = new JLabel("DNI:");
		lblDni.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelMenu.add(lblDni);

		txtDni = new JTextField();
		txtDni.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelMenu.add(txtDni);

		lblFecha = new JLabel("Fecha de nacimiento (dd-mm-aaaa):");
		lblFecha.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelMenu.add(lblFecha);

		txtFecha = new JTextField();
		txtFecha.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelMenu.add(txtFecha);

		lblSalario = new JLabel("Salario:");
		lblSalario.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelMenu.add(lblSalario);

		txtSalario = new JTextField();
		txtSalario.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelMenu.add(txtSalario);

		lblSalarioMax = new JLabel("Salario máximo");
		lblSalarioMax.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelMenu.add(lblSalarioMax);

		txtSalarioMax = new JTextField();
		txtSalarioMax.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelMenu.add(txtSalarioMax);

		btnGuardar = new JButton("Guardar");
		btnGuardar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelMenu.add(btnGuardar);

		btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelMenu.add(btnCancelar);


		add(panelMenu, BorderLayout.CENTER);
		txtTitulo = new JLabel("Panel Alta");
		txtTitulo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtTitulo.setHorizontalAlignment(SwingConstants.CENTER);

		add(txtTitulo, BorderLayout.NORTH);
		ctrlPanAlta = new CtrlPanelAlta();

	}

	private void addListeners() {

		btnGuardar.addActionListener(e -> {
			ctrlPanAlta.guardarEmpleado(txtNombre.getText(), txtDni.getText(), txtFecha.getText(),
					Double.parseDouble(txtSalario.getText()), Double.parseDouble(txtSalarioMax.getText()));
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
