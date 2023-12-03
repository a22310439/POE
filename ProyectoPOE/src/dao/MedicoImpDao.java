package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

import modelo.medico;

public class MedicoImpDao implements MedicoDao{
    Connection conexion;
    PreparedStatement stInsertarMedico;
    PreparedStatement stConsultarMedico;
    PreparedStatement stActualizarMedico;
    PreparedStatement stEliminarMedico;
    PreparedStatement stNumeroMedicos;
    PreparedStatement stConsultaCodigo;

    public MedicoImpDao(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(ClassNotFoundException ex){
            System.out.println("Error al cargar el driver.");
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void abrirConexion() {
        try { 
            conexion = DriverManager.getConnection(
                 "jdbc:mysql://127.0.0.1/proyectopoe?serverTimezone=GMT-5",
                 "root",
                 "");
            
             stInsertarMedico = conexion.prepareStatement(
                    "INSERT INTO medicos VALUES (?,?,?,?,?,?,?)");
            
             stConsultarMedico = conexion.prepareStatement(
                    "SELECT * FROM medicos WHERE codigo=?");
             
             stActualizarMedico = conexion.prepareStatement(
                    "UPDATE medicos set nombre=?, apellido=?, codigo=?, area=?, email=?, posicion=?, cedulaProfesional=? WHERE codigo=?");
           
             stEliminarMedico = conexion.prepareStatement(
                    "DELETE FROM medicos WHERE codigo=?");

            stNumeroMedicos = conexion.prepareStatement(
                    "SELECT COUNT(*) FROM medicos");

            stConsultaCodigo = conexion.prepareStatement(
                    "SELECT codigo FROM medicos LIMIT ?, 1");
             
        }catch(SQLException ex) {
            System.out.println("Error, no se logró la conexión con la BD");
            System.out.println(ex.getMessage());
       }
    }

    @Override
    public void cerrarConexion() {
        try{
            conexion.close();
        }catch(SQLException ex) {
            System.out.println("Error, no se logró cerrar la conexión con la BD");
            System.out.println(ex.getMessage());
       }
    }

    @Override
    public void agregarMedico(medico med){
        try{
            stInsertarMedico.setString(1, med.getNombre());
            stInsertarMedico.setString(2, med.getApellido());
            stInsertarMedico.setString(3, med.getCodigo());
            stInsertarMedico.setString(4, med.getArea());
            stInsertarMedico.setString(5, med.getEmail());
            stInsertarMedico.setString(6, med.getPosicion());
            stInsertarMedico.setString(7, med.getCedula());
        }catch(SQLException ex) {
            System.out.println("Error al registrar un medico en la BD");    
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public medico consultarMedico(String codigo) {
    
        medico med = null;
        ResultSet rs = null;
        
        try{
            stConsultarMedico.setString(1, codigo);
            rs = stConsultarMedico.executeQuery();
            if(rs.next()){
                med = new medico();
                med.setNombre(rs.getString("nombre"));
                med.setApellido(rs.getString("apellido"));
                med.setCodigo(rs.getString("codigo"));
                med.setArea(rs.getString("area"));
                med.setEmail(rs.getString("email"));
                med.setPosicion(rs.getString("posicion"));
                med.setCedula(rs.getString("cedulaProfesional"));

            }
        }catch(SQLException ex) {
            System.out.println("Error al consultar un medico en la BD");
            System.out.println(ex.getMessage());
        }
        return med;
    }

    @Override
    public void eliminarMedico(String codigo) { 
       try{ 
           stEliminarMedico.setString(1, codigo);
           stEliminarMedico.executeUpdate();
       }catch(SQLException ex){
           System.out.println("Error al eliminar un medico");
           System.out.println(ex.getMessage());
       }
    }

    @Override
    public void actualizarMedico(medico med, String codigo) {
        try {
            stActualizarMedico.setString(1, med.getNombre());
            stActualizarMedico.setString(2, med.getApellido());
            stActualizarMedico.setString(3, med.getCodigo());
            stActualizarMedico.setString(4, med.getArea());
            stActualizarMedico.setString(5, med.getEmail());
            stActualizarMedico.setString(6, med.getPosicion());
            stActualizarMedico.setString(7, med.getCedula());
            stActualizarMedico.setString(8, codigo);
            
            stActualizarMedico.executeUpdate();
        } catch(SQLException ex) {
            System.out.println("Error al Actualizar un medico en la BD");
            System.out.println(ex.getMessage());
        }
    }
}