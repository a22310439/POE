package dao;

import modelo.medico;

public interface MedicoDao {
    public void abrirConexion();
    public void cerrarConexion();
    public void agregarMedico(medico med);
    public medico consultarMedico(String codigo);
    public void eliminarMedico(String codigo);
    public void actualizarMedico(medico med, String codigo);
}
