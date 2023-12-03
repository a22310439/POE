package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

import modelo.usuario;

public class UsuarioImpDao implements UsuarioDao{
    Connection conexion;
    PreparedStatement stInsertarUsuario;
    PreparedStatement stConsultarUsuario;
    PreparedStatement stActualizarUsuario;
    PreparedStatement stEliminarUsuario;

    public UsuarioImpDao(){
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
            
            
             stInsertarUsuario = conexion.prepareStatement(
                    "INSERT INTO usuarios VALUES (?,?,?,?,?,?,?)");
            
             stConsultarUsuario = conexion.prepareStatement(
                    "SELECT * FROM usuarios WHERE usuario=?");
             
             stActualizarUsuario = conexion.prepareStatement(
                            "UPDATE usuarios set nombre=?, apellido=?, codigo=?, email=?, usuario=?, contrasena=?, tipoCuenta=? WHERE usuario=?");
           
             stEliminarUsuario = conexion.prepareStatement(
                            "DELETE FROM usuarios WHERE usuario=?");

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
    public void agregarUsuario(usuario usu){
        try{
            stInsertarUsuario.setString(1, usu.getNombre());
            stInsertarUsuario.setString(2, usu.getApellido());
            stInsertarUsuario.setString(3, usu.getCodigo());
            stInsertarUsuario.setString(4, usu.getEmail());
            stInsertarUsuario.setString(5, usu.getNombreUsuario());
            stInsertarUsuario.setString(6, usu.getContrasena());
            stInsertarUsuario.setString(7, usu.getTipoUsuario());
            stInsertarUsuario.executeUpdate();
        }catch(SQLException ex) {
            System.out.println("Error al registrar un usuario en la BD");    
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public usuario consultarUsuario(String usuario) {
    
        usuario usu = null;
        ResultSet rs = null;
        
        try{
            stConsultarUsuario.setString(1, usuario);
            rs = stConsultarUsuario.executeQuery();
            if( rs.next() ){
                usu = new usuario();
                usu.setNombre(rs.getString("nombre") );
                usu.setApellido(rs.getString("apellido"));
                usu.setCodigo(rs.getString("codigo"));
                usu.setEmail(rs.getString("email"));
                usu.setNombreUsuario(rs.getString("usuario"));
                usu.setContrasena(rs.getString("contrasena"));
                usu.setTipoUsuario(rs.getString("tipoCuenta"));
            }
        }catch(SQLException ex) {
            System.out.println("Error al consultar un usuario en la BD");
            System.out.println(ex.getMessage());
        }
        return usu;
    }

    @Override
    public void eliminarUsuario(String usuario) { 
       try{ 
           stEliminarUsuario.setString(1, usuario);
           stEliminarUsuario.executeUpdate();
       }catch(SQLException ex){
           System.out.println("Error al eliminar un usuario");
           System.out.println(ex.getMessage());
       }
    }

    @Override
    public void actualizarUsuario(usuario usu, String usuario) {
        try {
            stActualizarUsuario.setString(1, usu.getNombre());
            stActualizarUsuario.setString(2, usu.getApellido());
            stActualizarUsuario.setString(3, usu.getCodigo());
            stActualizarUsuario.setString(4, usu.getEmail());
            stActualizarUsuario.setString(5, usu.getNombreUsuario());
            stActualizarUsuario.setString(6, usu.getContrasena());
            stActualizarUsuario.setString(7, usu.getTipoUsuario());
            stActualizarUsuario.setString(8, usuario);
            
            stActualizarUsuario.executeUpdate();
        } catch(SQLException ex) {
            System.out.println("Error al Actualizar un usuario en la BD");
            System.out.println(ex.getMessage());
        }
    }
}
