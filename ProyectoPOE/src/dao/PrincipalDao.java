package dao;

public interface PrincipalDao {
    public void abrirConexion();
    public void cerrarConexion();
    public String obtenerNombreUsuario(String nomberUsuario);
    public String obtenerContrasena(String Contrasena);
}
