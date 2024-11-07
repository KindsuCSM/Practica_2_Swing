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

    public GregorianCalendar convertirFechaAGregorian(String fechaNacimiento) {
    	String[] fechaSinConvertir;
    	int dia, mes, anio;

    	fechaSinConvertir = fechaNacimiento.split("-");

    	dia = Integer.parseInt(fechaSinConvertir[2]);
    	mes = Integer.parseInt(fechaSinConvertir[1]) - 1;
    	anio = Integer.parseInt(fechaSinConvertir[0]);

    	return new GregorianCalendar(anio, mes, dia);
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

    public Empleado recogerEmpleado() {
        String nombre = panelVer.txtNombre.getText();
        String dni = panelVer.txtDni.getText();
        GregorianCalendar fecha = convertirFechaAGregorian(panelVer.txtFecha.getText());
        Double salario = Double.parseDouble(panelVer.txtSalario.getText());
        Double salarioMax = Double.parseDouble(panelVer.txtSalarioMax.getText());

        return new Empleado(nombre, dni, fecha, salario, salarioMax);
    }

    public void mostrarEmpleadoActual() {
        Empleado empleado = ctrlEmpleado.getEmpleadoActual();
        setEmpleadoData(empleado.getIdEmpleado(), empleado.getNombre(), empleado.getDni(), convertirFechaAString(empleado.getFechaNacimiento()), empleado.getSalario(), empleado.getSalarioMaximo());

        panelVer.btnAnterior.setEnabled(!ctrlEmpleado.esPrimerEmpleado());
        panelVer.btnSiguiente.setEnabled(!ctrlEmpleado.esUltimoEmpleado());
    }

    public void agregarNuevoEmpleado() {
        Empleado nuevoEmpleado = recogerEmpleado();
        ctrlEmpleado.agregarEmpleado(nuevoEmpleado);
        mostrarEmpleadoActual();
    }
}