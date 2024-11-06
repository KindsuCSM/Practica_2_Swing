package view;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.CtrlEmpleado;
import controller.CtrlPanelVer;

public class PanelVer extends JPanel {

	private static final long serialVersionUID = 1L;
    private JLabel lblNombre, lblFecha, lblSalario;
    public JTextField txtNombre, txtFecha, txtSalario;
    public JButton btnAnterior, btnSiguiente,  btnPrimero, btnUltimo;

    private CtrlPanelVer ctrlPanVer;
    private CtrlEmpleado ctrlEmpleado;

	public PanelVer() {
		setLayout(new GridLayout(0, 2, 16, 16));
		addComponents();
		addListeners();
	}

	public void addComponents() {
		lblNombre = new JLabel("Nombre:");
        add(lblNombre);

        txtNombre = new JTextField();
        add(txtNombre);

        lblFecha = new JLabel("Fecha de nacimiento:");
        add(lblFecha);

        txtFecha = new JTextField();
        add(txtFecha);

        lblSalario = new JLabel("Salario:");
        add(lblSalario);

        txtSalario = new JTextField();
        add(txtSalario);

        btnPrimero = new JButton("Primero");
        add(btnPrimero);

        btnUltimo = new JButton("Último");
        add(btnUltimo);

        btnAnterior = new JButton("Anterior");
        add(btnAnterior);

        btnSiguiente = new JButton("Siguiente");
        add(btnSiguiente);
	}
	public void addListeners() {
		btnAnterior.addActionListener(e -> {
            ctrlEmpleado.anteriorEmpleado();
            ctrlPanVer.mostrarEmpleadoActual();
        });
        btnSiguiente.addActionListener(e -> {
            ctrlEmpleado.siguienteEmpleado();
            ctrlPanVer.mostrarEmpleadoActual();
        });
        btnPrimero.addActionListener(e ->{
        	ctrlPanVer.mostrarPrimerEmpleado();
        });
        btnUltimo.addActionListener(e -> {
        	ctrlPanVer.mostrarUltimoEmpleado();
        });
	}
}
