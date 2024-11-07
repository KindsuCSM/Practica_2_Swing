package controller;

import model.Empleado;

import java.util.GregorianCalendar;

public class CtrlPanelAlta {

    public void guardarEmpleado(String nombre, String dni, String fechaNacimiento, Double salario, Double salarioMaximo) {

        GregorianCalendar gc = convertirFechaAGregorian(fechaNacimiento);
        Empleado empleado = new Empleado(nombre, dni, gc, salario, salarioMaximo);

        CtrlEmpleado.empleados.add(empleado);

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
}
