package dao;

import modelo.usuario;

public interface UsuarioDao {
    public void abrirConexion();
    public void cerrarConexion();
    public void agregarUsuario(usuario usu);
    public usuario consultarUsuario(String codigo);
    public void eliminarUsuario(String codigo);
    public void actualizarUsuario(usuario usu, String codigo);
}
