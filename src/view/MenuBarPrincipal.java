package view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class MenuBarPrincipal implements ActionListener {
    private JMenuBar menuBar;
    private JMenu mnEmpleado, mnHelp;
    private JMenuItem itemVer, itemAlta, itemAcercaDe;
    private FrmPrincipal frmPrincipal;
    private JPanel panAlta, panVer, panAcercaDe;

    public MenuBarPrincipal(FrmPrincipal frmPrincipal, JPanel panAlta, JPanel panVer, JPanel panAcercaDe) {
        this.frmPrincipal = frmPrincipal;
        this.panAlta = panAlta;
        this.panVer = panVer;
        this.panAcercaDe = panAcercaDe;
    }

    public JMenuBar mnBarPrincipal() {
        menuBar = new JMenuBar();

        mnEmpleado = new JMenu("Empleado");
        mnHelp = new JMenu("Ayuda");

        itemVer = new JMenuItem("Ver empleados");
        itemAlta = new JMenuItem("Dar alta");
        itemAcercaDe = new JMenuItem("Acerca de...");

        itemVer.addActionListener(this);
        itemAlta.addActionListener(this);
        itemAcercaDe.addActionListener(this);

        mnEmpleado.add(itemVer);
        mnEmpleado.add(itemAlta);
        mnHelp.add(itemAcercaDe);

        menuBar.add(mnEmpleado);
        menuBar.add(mnHelp);
        return menuBar;
    }

    private void cambiarPanel(JPanel panelNuevo) {
        frmPrincipal.getContentPane().removeAll();
        frmPrincipal.getContentPane().add(panelNuevo, BorderLayout.CENTER);
        frmPrincipal.revalidate();
        frmPrincipal.repaint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == itemVer) {
            cambiarPanel(panVer);
            frmPrincipal.setTitle("Ver empleados");
        } else if (e.getSource() == itemAlta) {
            cambiarPanel(panAlta);
            frmPrincipal.setTitle("Dar alta");
        } else if (e.getSource() == itemAcercaDe) {
            cambiarPanel(panAcercaDe);
            frmPrincipal.setTitle("Acerca de...");
        }
    }
}