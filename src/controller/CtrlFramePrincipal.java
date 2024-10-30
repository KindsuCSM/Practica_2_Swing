package controller;
import model.Empleado;
import view.FrmPrincipal;

public class CtrlFramePrincipal {

    private FrmPrincipal frmPrincipal;
    private CtrlEmpleado ctrlEmpleado;

    public CtrlFramePrincipal(FrmPrincipal frmPrincipal, CtrlEmpleado ctrlEmpleado) {
        this.frmPrincipal = frmPrincipal;
        this.ctrlEmpleado = ctrlEmpleado;
        mostrarEmpleadoActual();
    }

    public void setEmpleadoData(String nombre, String fechaNacimiento, double salario) {
        frmPrincipal.txtNombre.setText(nombre);
        frmPrincipal.txtFecha.setText(fechaNacimiento);
        frmPrincipal.txtSalario.setText(String.valueOf(salario));
    }

    public void mostrarPrimerEmpleado() {
        Empleado empleado = ctrlEmpleado.getPrimerEmpleado();
        setEmpleadoData(empleado.getNombre(), empleado.getFechaNacimiento(), empleado.getSalario());
        frmPrincipal.btnSiguiente.setEnabled(true);
        frmPrincipal.btnAnterior.setEnabled(false);
    }
    public void mostrarUltimoEmpleado(){
        Empleado empleado = ctrlEmpleado.getUltimoEmpleado();
        setEmpleadoData(empleado.getNombre(), empleado.getFechaNacimiento(), empleado.getSalario());
        frmPrincipal.btnSiguiente.setEnabled(false);
        frmPrincipal.btnAnterior.setEnabled(true);
    }

    public void mostrarEmpleadoActual() {
        Empleado empleado = ctrlEmpleado.getEmpleadoActual();
        setEmpleadoData(empleado.getNombre(), empleado.getFechaNacimiento(), empleado.getSalario());

        frmPrincipal.btnAnterior.setEnabled(!ctrlEmpleado.esPrimerEmpleado());
        frmPrincipal.btnSiguiente.setEnabled(!ctrlEmpleado.esUltimoEmpleado());
    }
}