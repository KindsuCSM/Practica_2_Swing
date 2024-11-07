package controller;

import java.util.ArrayList;
import java.util.GregorianCalendar;

import model.Empleado;

public class CtrlEmpleado {
    public static ArrayList<Empleado> empleados;
    private int indiceActual;

    public CtrlEmpleado() {
        empleados = new ArrayList<>();
        indiceActual = 0;

        inicializarEmpleados();
    }

    public void inicializarEmpleados() {
    	empleados.add(new Empleado("Juan Pérez", "12345678A", new GregorianCalendar(1990, 0, 15), 30000, 50000));
        empleados.add(new Empleado("María López", "87654321B", new GregorianCalendar(1985, 4, 10), 32000, 50000));
        empleados.add(new Empleado("Carlos García", "23456789C", new GregorianCalendar(1978, 11, 22), 28000, 50000));
        empleados.add(new Empleado("Ana Fernández", "34567890D", new GregorianCalendar(1993, 2, 3), 35000, 50000));
        empleados.add(new Empleado("Luis Sánchez", "45678901E", new GregorianCalendar(2000, 10, 1), 25000, 50000));
    }

    public Empleado getEmpleadoActual() {
        return empleados.get(indiceActual);
    }
    public Empleado getPrimerEmpleado(){
        indiceActual = 0;
        return empleados.get(indiceActual);
    }
    public Empleado getUltimoEmpleado(){
        indiceActual = empleados.size() -1;
        return empleados.get(indiceActual);
    }

    public void siguienteEmpleado() {
        if (indiceActual < empleados.size() - 1) {
            indiceActual++;
        }
    }

    public void anteriorEmpleado() {
        if (indiceActual > 0) {
            indiceActual--;
        }
    }

    public boolean esUltimoEmpleado() {
        return indiceActual == empleados.size() - 1;
    }

    public boolean esPrimerEmpleado() {
        return indiceActual == 0;
    }
}