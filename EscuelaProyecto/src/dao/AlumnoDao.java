package dao;
import modelo.Alumno;

public interface AlumnoDao {
    public void abrirConexion();
    public void cerrarConexion();
    public void insertarAlumno(Alumno objAl);
    public Alumno consultarAlumno(String codigo);
    public void eliminarAlumno(String codigo);
    public void actualizarAlumno(Alumno objAl);
}
