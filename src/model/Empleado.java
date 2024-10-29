package model;

public class Empleado {
    private int idEmpleado;
    private String nombre;
    private String fechaNacimiento;
    private double salario;
    private double salarioMaximo;

    // Constructor
    public Empleado(int idEmpleado, String nombre, String fechaNacimiento, double salario, double salarioMaximo) {
        incrementarId();
        setNombre(nombre);
        setFechaNacimiento(fechaNacimiento);
        setSalario(salario);
        setSalarioMaximo(salarioMaximo);
    }

    //Incrementar idEmpleado
    private void incrementarId(){
        this.idEmpleado++;
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

    public double getSalarioMaximo() {
        return salarioMaximo;
    }

    public void setSalarioMaximo(double salarioMaximo) {
        this.salarioMaximo = salarioMaximo;
    }
}
