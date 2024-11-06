package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class FrmPrincipal extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private MenuBarPrincipal menuBarPrincipal;
    private PanelAlta panAlta;
    private PanelVer panVer;
    private PanelAcercaDe panAcercaDe;

    public FrmPrincipal() {
        setTitle("Aplicación empleados");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        setLocationRelativeTo(null);

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);

        JPanel panel = new JPanel();
        contentPane.add(panel);

        panAlta = new PanelAlta();
        panVer = new PanelVer();
        panAcercaDe = new PanelAcercaDe();

        menuBarPrincipal = new MenuBarPrincipal(this, panAlta, panVer, panAcercaDe);
        setJMenuBar(menuBarPrincipal.mnBarPrincipal());

        setVisible(true);
    }
}
