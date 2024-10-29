package model;

public class Empleado {
    private String nombre;
    private String fechaNacimiento;
    private double salario;

    // Constructor
    public Empleado(String nombre, String fechaNacimiento, double salario) {
        setNombre(nombre);
        setFechaNacimiento(fechaNacimiento);
        setSalario(salario);
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
