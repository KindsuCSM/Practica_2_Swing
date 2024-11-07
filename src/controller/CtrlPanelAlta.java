package controller;

import model.Empleado;
import view.PanelAlta;

import java.awt.*;
import java.util.GregorianCalendar;

import javax.swing.JOptionPane;

public class CtrlPanelAlta {
    public void guardarEmpleado(String nombre, String dni, String fechaNacimiento, String salario, String salarioMaximo) {
        boolean esCorrecto = true;

        GregorianCalendar gc = convertirFechaAGregorian(fechaNacimiento);

        if(Double.parseDouble(salario) > Double.parseDouble(salarioMaximo)){
        	JOptionPane.showMessageDialog(null, "El salario es mayor que el salario máximo", "Error salario", JOptionPane.ERROR_MESSAGE);
        	esCorrecto = false;
        }
        if(gc.get(GregorianCalendar.YEAR) < 1900 || gc.get(GregorianCalendar.YEAR) > 2015) {
        	JOptionPane.showMessageDialog(null, "El año introducido no es correcto", "Error año", JOptionPane.ERROR_MESSAGE);
        	esCorrecto = false;
        }
        if(esCorrecto) {
        	Empleado empleado = new Empleado(nombre, dni, gc, Double.parseDouble(salario), Double.parseDouble(salarioMaximo));
            CtrlEmpleado.empleados.add(empleado);
        }
    }

    public GregorianCalendar convertirFechaAGregorian(String fechaNacimiento) {
        String[] fechaSinConvertir;
        int dia, mes, anio;
        fechaSinConvertir = fechaNacimiento.split("-");
        dia = Integer.parseInt(fechaSinConvertir[0]);
        mes = Integer.parseInt(fechaSinConvertir[1]) - 1;
        anio = Integer.parseInt(fechaSinConvertir[2]);
        return new GregorianCalendar(anio, mes, dia);
    }
}

