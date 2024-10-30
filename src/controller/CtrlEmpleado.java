package controller;

import java.util.ArrayList;

import model.Empleado;

public class CtrlEmpleado {
    private ArrayList<Empleado> empleados;
    private int indiceActual;

    public CtrlEmpleado() {
        empleados = new ArrayList<>();
        indiceActual = 0;

        inicializarEmpleados();
    }

    public void inicializarEmpleados() {
        empleados.add(new Empleado("Juan Pérez", "1990-01-15", 30000));
        empleados.add(new Empleado("María López", "1985-05-10", 32000));
        empleados.add(new Empleado("Carlos García", "1978-12-22", 28000));
        empleados.add(new Empleado("Ana Fernández", "1993-03-03", 35000));
        empleados.add(new Empleado("Luis Sánchez", "2000-11-01", 25000));
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
        return indiceActual == empleados.size();
    }

    public boolean esPrimerEmpleado() {
        return indiceActual == 0;
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
        indiceActual = empleados.size() - 1;
    }

    public boolean hayCampoNuevo() {
        return indiceActual == empleados.size();
    }

}