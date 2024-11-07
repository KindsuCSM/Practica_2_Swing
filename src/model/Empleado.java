package model;

import java.util.GregorianCalendar;

public class Empleado {
	private static int contadorEmpleado; //un contador estatico para que incremente el id de empleado
    private int idEmpleado;
    private String nombre;
    private String dni;
    private GregorianCalendar fechaNacimiento;
    private double salario;
    private double salarioMaximo;

    // Constructor
    public Empleado(String nombre, String dni, GregorianCalendar fechaNacimiento, double salario, double salarioMaximo) {
        this.idEmpleado = ++contadorEmpleado; //Se pone los signos de mas delante para que empiece desde 1 el contador
        setNombre(nombre);
        setDni(dni);
        setFechaNacimiento(fechaNacimiento);
        setSalario(salario);
        setSalarioMaximo(salarioMaximo);
    }
    // Getters y setters
    public void setDni(String dni) {
    	this.dni = dni;
    }
    public String getDni() {
    	return dni;
    }
    public int getIdEmpleado() {
    	return idEmpleado;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public GregorianCalendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(GregorianCalendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalarioMaximo() {
        return salarioMaximo;
    }

    public void setSalarioMaximo(double salarioMaximo) {
        this.salarioMaximo = salarioMaximo;
    }
}