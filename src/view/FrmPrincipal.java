package view;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import controller.CtrlEmpleado;
import controller.CtrlFramePrincipal;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

public class FrmPrincipal extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JLabel lblNombre, lblFecha, lblSalario;
    public JTextField txtNombre, txtFecha, txtSalario;
    public JButton btnAnterior, btnSiguiente, btnPrimero, btnUltimo;

    private CtrlFramePrincipal ctrlFramePrincipal;
    private CtrlEmpleado ctrlEmpleado;



    public FrmPrincipal() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new GridLayout(0, 2, 16, 16));

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
        ctrlFramePrincipal = new CtrlFramePrincipal(this, ctrlEmpleado);

        setVisible(true);
        setListeners();
    }

    public void setListeners() {
        btnAnterior.addActionListener(e -> {
            ctrlEmpleado.anteriorEmpleado();
            ctrlFramePrincipal.mostrarEmpleadoActual();
        });

        btnSiguiente.addActionListener(e -> {
            ctrlEmpleado.siguienteEmpleado();
            ctrlFramePrincipal.mostrarEmpleadoActual();
        });

        btnPrimero.addActionListener(e ->{
            ctrlFramePrincipal.mostrarPrimerEmpleado();
        });
        btnUltimo.addActionListener(e -> {
            ctrlFramePrincipal.mostrarUltimoEmpleado();
        });
   }
}