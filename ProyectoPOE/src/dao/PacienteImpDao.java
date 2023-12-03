package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

import modelo.paciente;

public class PacienteImpDao implements PacienteDao {
    Connection conexion;
    PreparedStatement stInsertarPaciente;
    PreparedStatement stConsultarPaciente;
    PreparedStatement stActualizarPaciente;
    PreparedStatement stEliminarPaciente;

    public PacienteImpDao() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
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

            stInsertarPaciente = conexion.prepareStatement(
                    "INSERT INTO pacientes VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

            stConsultarPaciente = conexion.prepareStatement(
                    "SELECT * FROM pacientes WHERE codigo=?");

            stActualizarPaciente = conexion.prepareStatement(
                    "UPDATE pacientes set nombre=?, apellidos=?, email=?, codigo=?, sexo=?, fechaNacimiento=?, ocupacion=?, estadoCivil=?, ciudadNacimiento=?, ciudadResidencia=?, domicilio=?, telefono=?, contactoEmergencia=?, vacunas=?, contactoAnimales=?, estadoVivienda=?, tipoSangre=?, enfInfancia=?, enfInfecciosas=?, enfCronicoDegenerativas=?, alergias=?, cirugiasPrevias=?, fracturas=?, transfusionesSanguineas=?, hospitalizaciones=?, motivoConsulta=?, evoPadecimientoActual=?, sospechaDiagnostica=?, planTratamiento=?, evoPaciente=?, pacientePrioritario=? WHERE codigo=?");

            stEliminarPaciente = conexion.prepareStatement(
                    "DELETE FROM pacientes WHERE codigo=?");

    } catch (SQLException ex) {
        System.out.println("Error, no se logró la conexión con la BD");
        System.out.println(ex.getMessage());
    }
}


    @Override
    public void cerrarConexion() {
        try {
            conexion.close();
        } catch (SQLException ex) {
            System.out.println("Error, no se logró cerrar la conexión con la BD");
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void agregarPaciente(paciente pac) {
        try {
            stInsertarPaciente.setString(1, pac.getNombre());
            stInsertarPaciente.setString(2, pac.getApellido());
            stInsertarPaciente.setString(3, pac.getEmail());
            stInsertarPaciente.setString(4, pac.getCodigo());
            stInsertarPaciente.setString(5, pac.getSexo());
            stInsertarPaciente.setString(6, pac.getFechaNacimiento());
            stInsertarPaciente.setString(7, pac.getOcupacion());
            stInsertarPaciente.setString(8, pac.getEstadoCivil());
            stInsertarPaciente.setString(9, pac.getCiudadNacimiento());
            stInsertarPaciente.setString(10, pac.getCiudadResidencia());
            stInsertarPaciente.setString(11, pac.getDomicilio());
            stInsertarPaciente.setString(12, pac.getTelefono());
            stInsertarPaciente.setString(13, pac.getContactoEmergencia());
            stInsertarPaciente.setString(14, pac.getVacunas());
            stInsertarPaciente.setString(15, pac.getContactoAnimales());
            stInsertarPaciente.setString(16, pac.getEstadoVivienda());
            stInsertarPaciente.setString(17, pac.getTipoSangre());
            stInsertarPaciente.setString(18, pac.getEnfInfancia());
            stInsertarPaciente.setString(19, pac.getEnfInfecciosas());
            stInsertarPaciente.setString(20, pac.getEnfCronicoDegenerativas());
            stInsertarPaciente.setString(21, pac.getAlergias());
            stInsertarPaciente.setString(22, pac.getCirugiasPrevias());
            stInsertarPaciente.setString(23, pac.getFracturas());
            stInsertarPaciente.setString(24, pac.getTransfusionesSanguineas());
            stInsertarPaciente.setString(25, pac.getHospitalizaciones());
            stInsertarPaciente.setString(26, pac.getMotivoConsulta());
            stInsertarPaciente.setString(27, pac.getEvoPadecimientoActual());
            stInsertarPaciente.setString(28, pac.getSospechaDiagnostica());
            stInsertarPaciente.setString(29, pac.getPlanTratamiento());
            stInsertarPaciente.setString(30, pac.getEvoPaciente());
            stInsertarPaciente.setString(31, pac.getPrioritario());
            stInsertarPaciente.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error al registrar un paciente en la BD");
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public paciente consultarPaciente(String codigo) {
    
        paciente pac = null;
        ResultSet rs = null;
        
        try{
            stConsultarPaciente.setString(1, codigo);
            rs = stConsultarPaciente.executeQuery();
            if(rs.next()){
                pac = new paciente();
                pac.setNombre(rs.getString("nombre"));
                pac.setApellido(rs.getString("apellidos"));
                pac.setEmail(rs.getString("email"));
                pac.setCodigo(rs.getString("codigo"));
                pac.setSexo(rs.getString("sexo"));
                pac.setFechaNacimiento(rs.getString("fechaNacimiento"));
                pac.setOcupacion(rs.getString("ocupacion"));
                pac.setEstadoCivil(rs.getString("estadoCivil"));
                pac.setCiudadNacimiento(rs.getString("ciudadNacimiento"));
                pac.setCiudadResidencia(rs.getString("ciudadResidencia"));
                pac.setDomicilio(rs.getString("domicilio"));
                pac.setTelefono(rs.getString("telefono"));
                pac.setContactoEmergencia(rs.getString("contactoEmergencia"));
                pac.setVacunas(rs.getString("vacunas"));
                pac.setContactoAnimales(rs.getString("contactoAnimales"));
                pac.setEstadoVivienda(rs.getString("estadoVivienda"));
                pac.setTipoSangre(rs.getString("tipoSangre"));
                pac.setEnfInfancia(rs.getString("enfInfancia"));
                pac.setEnfInfecciosas(rs.getString("enfInfecciosas"));
                pac.setEnfCronicoDegenerativas(rs.getString("enfCronicoDegenerativas"));
                pac.setAlergias(rs.getString("alergias"));
                pac.setCirugiasPrevias(rs.getString("cirugiasPrevias"));
                pac.setFracturas(rs.getString("fracturas"));
                pac.setTransfusionesSanguineas(rs.getString("transfusionesSanguineas"));
                pac.setHospitalizaciones(rs.getString("hospitalizaciones"));
                pac.setMotivoConsulta(rs.getString("motivoConsulta"));
                pac.setEvoPadecimientoActual(rs.getString("evoPadecimientoActual"));
                pac.setSospechaDiagnostica(rs.getString("sospechaDiagnostica"));
                pac.setPlanTratamiento(rs.getString("planTratamiento"));
                pac.setEvoPaciente(rs.getString("evoPaciente"));
                pac.setPrioritario(rs.getString("pacientePrioritario"));
            }
        }catch(SQLException ex) {
            System.out.println("Error al consultar un paciente en la BD");
            System.out.println(ex.getMessage());
        }
        return pac;
    }

    @Override
    public void eliminarPaciente(String codigo) { 
       try{ 
           stEliminarPaciente.setString(1, codigo);
           stEliminarPaciente.executeUpdate();
       }catch(SQLException ex){
           System.out.println("Error al eliminar un paciente");
           System.out.println(ex.getMessage());
       }
    }

    @Override
    public void actualizarPaciente(paciente pac, String codigo) {
        try {
            stActualizarPaciente.setString(1, pac.getNombre());
            stActualizarPaciente.setString(2, pac.getApellido());
            stActualizarPaciente.setString(3, pac.getEmail());
            stActualizarPaciente.setString(4, pac.getCodigo());
            stActualizarPaciente.setString(5, pac.getSexo());
            stActualizarPaciente.setString(6, pac.getFechaNacimiento());
            stActualizarPaciente.setString(7, pac.getOcupacion());
            stActualizarPaciente.setString(8, pac.getEstadoCivil());
            stActualizarPaciente.setString(9, pac.getCiudadNacimiento());
            stActualizarPaciente.setString(10, pac.getCiudadResidencia());
            stActualizarPaciente.setString(11, pac.getDomicilio());
            stActualizarPaciente.setString(12, pac.getTelefono());
            stActualizarPaciente.setString(13, pac.getContactoEmergencia());
            stActualizarPaciente.setString(14, pac.getVacunas());
            stActualizarPaciente.setString(15, pac.getContactoAnimales());
            stActualizarPaciente.setString(16, pac.getEstadoVivienda());
            stActualizarPaciente.setString(17, pac.getTipoSangre());
            stActualizarPaciente.setString(18, pac.getEnfInfancia());
            stActualizarPaciente.setString(19, pac.getEnfInfecciosas());
            stActualizarPaciente.setString(20, pac.getEnfCronicoDegenerativas());
            stActualizarPaciente.setString(21, pac.getAlergias());
            stActualizarPaciente.setString(22, pac.getCirugiasPrevias());
            stActualizarPaciente.setString(23, pac.getFracturas());
            stActualizarPaciente.setString(24, pac.getTransfusionesSanguineas());
            stActualizarPaciente.setString(25, pac.getHospitalizaciones());
            stActualizarPaciente.setString(26, pac.getMotivoConsulta());
            stActualizarPaciente.setString(27, pac.getEvoPadecimientoActual());
            stActualizarPaciente.setString(28, pac.getSospechaDiagnostica());
            stActualizarPaciente.setString(29, pac.getPlanTratamiento());
            stActualizarPaciente.setString(30, pac.getEvoPaciente());
            stActualizarPaciente.setString(31, pac.getPrioritario());
            stActualizarPaciente.setString(32, codigo);


            stActualizarPaciente.executeUpdate();
        } catch(SQLException ex) {
            System.out.println("Error al Actualizar un paciente en la BD");
            System.out.println(ex.getMessage());
        }
    }
}
