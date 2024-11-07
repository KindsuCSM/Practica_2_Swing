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
    private JLabel lblNombre, lblFecha, lblSalario, lblDni, lblSalarioMax, lblID;
    public JTextField txtNombre, txtFecha, txtSalario, txtDni, txtSalarioMax, txtId;
    public JButton btnAnterior, btnSiguiente,  btnPrimero, btnUltimo;

    private CtrlPanelVer ctrlPanVer;
    private CtrlEmpleado ctrlEmpleado;

	public PanelVer() {
		setLayout(new GridLayout(0, 2, 10, 10));
		addComponents();
		addListeners();
	}

	public void addComponents() {

		lblID = new JLabel("ID:");
		add(lblID);

		txtId = new JTextField();
		add(txtId);
		txtId.setColumns(10);
		lblNombre = new JLabel("Nombre:");
        add(lblNombre);

        txtNombre = new JTextField();
        add(txtNombre);

        lblDni = new JLabel("DNI:");
        add(lblDni);

        txtDni = new JTextField();
        add(txtDni);

        lblFecha = new JLabel("Fecha de nacimiento (dd-mm-aaaa):");
        add(lblFecha);

        txtFecha = new JTextField();
        add(txtFecha);

        lblSalario = new JLabel("Salario:");
        add(lblSalario);

        txtSalario = new JTextField();
        add(txtSalario);

        lblSalarioMax = new JLabel("Salario máximo");
        add(lblSalarioMax);

        txtSalarioMax = new JTextField();
        add(txtSalarioMax);

        btnPrimero = new JButton("Primero");
        add(btnPrimero);

        btnUltimo = new JButton("Último");
        add(btnUltimo);

        btnAnterior = new JButton("Anterior");
        add(btnAnterior);

        btnSiguiente = new JButton("Siguiente");
        add(btnSiguiente);

        //Inicializar controladores
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
