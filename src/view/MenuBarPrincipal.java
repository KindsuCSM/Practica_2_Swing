package view;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuBarPrincipal {
	JMenuBar menuBar;
	private JMenu mnEmpleado, mnHelp;
	private JMenuItem itemVer, itemAlta, itemAcercaDe;


	public JMenuBar MenuBarPrincipal() {
		menuBar = new JMenuBar();

		mnEmpleado = new JMenu("Empleado");
		mnHelp = new JMenu("Ayuda");

		itemVer = new JMenuItem("Ver empleados");
		itemAlta = new JMenuItem("Dar alta");
		itemAcercaDe = new JMenuItem("Äcerca de...");

		mnEmpleado.add(itemVer);
		mnEmpleado.add(itemAlta);
		mnHelp.add(itemAcercaDe);

		menuBar.add(mnEmpleado);
		menuBar.add(mnHelp);

		return menuBar;
	}

	private void addListeners() {

	}
}
