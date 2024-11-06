package controller;

import model.Empleado;
import view.PanelAlta;
import view.PanelVer;

public class CtrlPanelVer {
	private PanelVer panelVer;
    private CtrlEmpleado ctrlEmpleado;

    public CtrlPanelVer(PanelVer panelVer, CtrlEmpleado ctrlEmpleado) {
        this.panelVer = panelVer;
        this.ctrlEmpleado = ctrlEmpleado;
        mostrarEmpleadoActual();
    }

    public void setEmpleadoData(String nombre, String fechaNacimiento, double salario) {
    	panelVer.txtNombre.setText(nombre);
    	panelVer.txtFecha.setText(fechaNacimiento);
    	panelVer.txtSalario.setText(String.valueOf(salario));
    }

    public void mostrarPrimerEmpleado() {
        Empleado empleado = ctrlEmpleado.getPrimerEmpleado();
        setEmpleadoData(empleado.getNombre(), empleado.getFechaNacimiento(), empleado.getSalario());
        panelVer.btnSiguiente.setEnabled(true);
        panelVer.btnAnterior.setEnabled(false);
    }
    public void mostrarUltimoEmpleado(){
        Empleado empleado = ctrlEmpleado.getUltimoEmpleado();
        setEmpleadoData(empleado.getNombre(), empleado.getFechaNacimiento(), empleado.getSalario());
        panelVer.btnSiguiente.setEnabled(false);
        panelVer.btnAnterior.setEnabled(true);
    }

    public Empleado recogerEmpleado() {
        String nombre = panelVer.txtNombre.getText();
        String fecha = panelVer.txtFecha.getText();
        Double salario = Double.parseDouble(panelVer.txtSalario.getText());

        return new Empleado(nombre, fecha, salario);
    }

    public void mostrarEmpleadoActual() {
        Empleado empleado = ctrlEmpleado.getEmpleadoActual();
        setEmpleadoData(empleado.getNombre(), empleado.getFechaNacimiento(), empleado.getSalario());

        panelVer.btnAnterior.setEnabled(!ctrlEmpleado.esPrimerEmpleado());
        panelVer.btnSiguiente.setEnabled(!ctrlEmpleado.esUltimoEmpleado());
    }

}