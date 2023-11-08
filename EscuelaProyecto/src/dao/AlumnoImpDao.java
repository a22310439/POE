package dao;
import modelo.Alumno;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
// import java.sql.ResultSet;

public class AlumnoImpDao implements AlumnoDao{

    Connection conexion;
    PreparedStatement stInsertar;

    public AlumnoImpDao(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(ClassNotFoundException ex){
            System.out.println("Error al cargar el driver");
            System.out.println(ex.getMessage());
        }
    }
    
    @Override
    public void abrirConexion(){
        try{
            conexion = DriverManager.getConnection("jdbc:mysql://127.0.0.1/idsescuela?serverTimezone=GMT-5",
            "root",
            "");
            stInsertar = conexion.prepareStatement("INSERT INTO alumno VALUES (?,?,?,?,?,?,?,?,?)");
        }catch(SQLException ex){
            System.out.println("Error, no se logro conectar la conexion en la BD");
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void cerrarConexion(){
        try{
            conexion.close();
        }catch(SQLException ex){
            System.out.println("Error, no se logro cerrar la conexion");
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void insertarAlumno(Alumno objAl){
        try{
            stInsertar.setString(1, objAl.getNombre());
            stInsertar.setInt(2, objAl.getEdad());
            stInsertar.setString(3, objAl.getEmail());
            stInsertar.setString(4, objAl.getCodigo());
            stInsertar.setString(5, objAl.getCarrera());
            stInsertar.setDouble(6, objAl.getCalMate());
            stInsertar.setDouble(7, objAl.getCalFisica());
            stInsertar.setDouble(8, objAl.getCalProgra());
            stInsertar.setDouble(9, objAl.getPromedio());

            stInsertar.executeUpdate();

        }catch(SQLException ex){
            System.out.println("Error al registrar el alumno en la BD");
            System.out.println(ex.getMessage());
        }
            
    }

    @Override
    public Alumno consultarAlumno(String codigo){
        return new Alumno();
    }

    @Override
    public void eliminarAlumno(String codigo){

    }

    @Override
    public void actualizarAlumno(Alumno objAl){

    }
    
}
