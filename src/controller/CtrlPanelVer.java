package controller;

import java.util.GregorianCalendar;

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
    public String convertirFechaAString(GregorianCalendar fechaNacimiento) {
    	int dia = fechaNacimiento.get(GregorianCalendar.DAY_OF_MONTH);
    	int mes = fechaNacimiento.get(GregorianCalendar.MONTH) + 1;
    	int anio = fechaNacimiento.get(GregorianCalendar.YEAR);

    	return String.format("%02d-%02d-%d", dia, mes, anio);
    }
    public void setEmpleadoData(int id, String nombre, String dni, String fechaNacimiento, double salario, double salarioMax) {
    	panelVer.txtId.setText(String.valueOf(id));
    	panelVer.txtNombre.setText(nombre);
    	panelVer.txtDni.setText(dni);
    	panelVer.txtFecha.setText(fechaNacimiento);
    	panelVer.txtSalario.setText(String.valueOf(salario));
    	panelVer.txtSalarioMax.setText(String.valueOf(salarioMax));
    }
    public void mostrarPrimerEmpleado() {
        Empleado empleado = ctrlEmpleado.getPrimerEmpleado();
        setEmpleadoData(empleado.getIdEmpleado(), empleado.getNombre(), empleado.getDni(), convertirFechaAString(empleado.getFechaNacimiento()), empleado.getSalario(), empleado.getSalarioMaximo());
        panelVer.btnSiguiente.setEnabled(true);
        panelVer.btnAnterior.setEnabled(false);
    }
    public void mostrarUltimoEmpleado(){
        Empleado empleado = ctrlEmpleado.getUltimoEmpleado();
        setEmpleadoData(empleado.getIdEmpleado(), empleado.getNombre(), empleado.getDni(), convertirFechaAString(empleado.getFechaNacimiento()), empleado.getSalario(), empleado.getSalarioMaximo());
        panelVer.btnSiguiente.setEnabled(false);
        panelVer.btnAnterior.setEnabled(true);
    }
    public void mostrarEmpleadoActual() {
        Empleado empleado = ctrlEmpleado.getEmpleadoActual();
        setEmpleadoData(empleado.getIdEmpleado(), empleado.getNombre(), empleado.getDni(), convertirFechaAString(empleado.getFechaNacimiento()), empleado.getSalario(), empleado.getSalarioMaximo());

        panelVer.btnAnterior.setEnabled(!ctrlEmpleado.esPrimerEmpleado());
        panelVer.btnSiguiente.setEnabled(!ctrlEmpleado.esUltimoEmpleado());
    }

}