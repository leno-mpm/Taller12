import java.util.ArrayList;
import java.util.List;

public class BuscadorEmpleado {
    public static Empleado buscarEmpleadoPorNombre(String nombre, List<Empleado> empleados) {
        for (Empleado empleado : empleados) {
            if (empleado.getNombre().equals(nombre)) {
                return empleado;
            }
        }
        return null;
    }

    public static List<Empleado> obtenerEmpleadosPorHorasTrabajadasaPartirDe(int horas, List<Empleado> empleados) {
        List<Empleado> empleadosPorTipo = new ArrayList<>();
        for (Empleado empleado : empleados) {
            if (empleado.getHorasTrabajadas()>horas) {
                empleadosPorTipo.add(empleado);
            }
        }
        return empleadosPorTipo;
    }
}
