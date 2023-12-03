package dao;

import modelo.paciente;

public interface PacienteDao {
    public void abrirConexion();
    public void cerrarConexion();
    public void agregarPaciente(paciente pac);
    public paciente consultarPaciente(String codigo);
    public void eliminarPaciente(String codigo);
    public void actualizarPaciente(paciente pac, String codigo);
}
