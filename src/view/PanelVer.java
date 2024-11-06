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
    private JPanel contentPane;
    private JLabel lblNombre, lblFecha, lblSalario;
    public JTextField txtNombre, txtFecha, txtSalario;
    public JButton btnAnterior, btnSiguiente,  btnPrimero, btnUltimo;

    private CtrlPanelVer ctrlPanVer;
    private CtrlEmpleado ctrlEmpleado;

	public PanelVer() {
		contentPane = new JPanel(new GridLayout(0, 2, 16, 16));

		addComponents();
		add(contentPane);
		addListeners();
	}

	public void addComponents() {
		lblNombre = new JLabel("Nombre:");
        contentPane.add(lblNombre);

        txtNombre = new JTextField();
        contentPane.add(txtNombre);
        txtNombre.setColumns(10);

        lblFecha = new JLabel("Fecha de nacimiento:");
        contentPane.add(lblFecha);

        txtFecha = new JTextField();
        contentPane.add(txtFecha);
        txtFecha.setColumns(10);

        lblSalario = new JLabel("Salario:");
        contentPane.add(lblSalario);

        txtSalario = new JTextField();
        contentPane.add(txtSalario);
        txtSalario.setColumns(10);

        btnPrimero = new JButton("Primero");
        contentPane.add(btnPrimero);

        btnUltimo = new JButton("Último");
        contentPane.add(btnUltimo);

        btnAnterior = new JButton("Anterior");
        contentPane.add(btnAnterior);

        btnSiguiente = new JButton("Siguiente");
        contentPane.add(btnSiguiente);

        ctrlEmpleado = new CtrlEmpleado();
        ctrlPanVer = new CtrlPanelVer(this, ctrlEmpleado);
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
