package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class PrincipalImpDao implements PrincipalDao{
    Connection conexion;
    PreparedStatement stConsultarNombreUsuario;
    PreparedStatement stConsultarContrasena;

    public PrincipalImpDao(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(ClassNotFoundException ex){
            System.out.println("Error al cargar el Driver");
            System.out.println(ex.getMessage());
        }
     }

     public void abrirConexion() {
        try { 
            conexion = DriverManager.getConnection(
                 "jdbc:mysql://127.0.0.1/proyectopoe?serverTimezone=GMT-5",
                 "root",
                 "");
            
            stConsultarNombreUsuario = conexion.prepareStatement(
                    "SELECT usuario FROM usuarios WHERE usuario=?");
             
            stConsultarContrasena = conexion.prepareStatement(
                    "SELECT contrasena FROM usuarios WHERE usuario=?");

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
    public String obtenerNombreUsuario(String nombreUsuario){
        
        String usuario = "";
        ResultSet rs = null;

        try{
            stConsultarNombreUsuario.setString(1, nombreUsuario);
            rs = stConsultarNombreUsuario.executeQuery();
            if(rs.next()){
                usuario = rs.getString("usuario");
            }
        }catch(SQLException ex){
            System.out.println("Error al obtener el nombre de usuario");
            System.out.println(ex.getMessage());
        }
        return usuario;
    }

    @Override
    public String obtenerContrasena(String usuario){
        
        String contrasena = "";
        ResultSet rs = null;

        try{
            stConsultarContrasena.setString(1, usuario);
            rs = stConsultarContrasena.executeQuery();
            if(rs.next()){
                contrasena = rs.getString("contrasena");
            }
        }catch(SQLException ex){
            System.out.println("Error al obtener la contrasena");
            System.out.println(ex.getMessage());
        }
        return contrasena;
    }
}
