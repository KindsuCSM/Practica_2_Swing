import controller.CtrlEmpleado;
import controller.CtrlFramePrincipal;
import view.FrmPrincipal;

public class StartApp {
    public static void main(String[] args) {
        CtrlEmpleado ctrlEmpleado = new CtrlEmpleado();
        FrmPrincipal frame = new FrmPrincipal();
        CtrlFramePrincipal ctrFrm = new CtrlFramePrincipal(frame, ctrlEmpleado);
        FrmPrincipal frmPrincipal = new FrmPrincipal();
        System.out.println("hola");
    }
}
