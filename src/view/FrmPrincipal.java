package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class FrmPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private MenuBarPrincipal menuBarPrincipal;

	public FrmPrincipal() {
		setTitle("Aplicación empleados");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		menuBarPrincipal = new MenuBarPrincipal();
		setJMenuBar(menuBarPrincipal.MenuBarPrincipal());

		setContentPane(contentPane);
		setVisible(true);
	}

}
