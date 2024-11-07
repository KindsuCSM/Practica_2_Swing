package controller;

import model.Empleado;
import view.PanelAlta;

import java.util.GregorianCalendar;

public class CtrlPanelAlta {



    public void guardarEmpleado(String nombre, String dni, String fechaNacimiento, String salario, String salarioMaximo) {


        //Comprobaciones de null.

        if(nombre.isEmpty()){
            nombre = "";
        }

        if(dni.isEmpty()){
            dni = "";
        }

        if(fechaNacimiento.isEmpty()){
            fechaNacimiento = "1900-01-01";
        }

        if(salario.isEmpty()){
            salario = "0.0";
        }

        if(salarioMaximo.isEmpty()){
            salarioMaximo = "0.0";
        }

        GregorianCalendar gc = convertirFechaAGregorian(fechaNacimiento);
        Empleado empleado = new Empleado(nombre, dni, gc, Double.parseDouble(salario), Double.parseDouble(salarioMaximo));
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
