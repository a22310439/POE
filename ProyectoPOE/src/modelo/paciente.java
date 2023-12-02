package modelo;

public class paciente extends persona{
    private String sexo;
    private String fechaNacimiento;
    private String ocupacion;
    private String estadoCivil;
    private String ciudadNacimiento;
    private String ciudadResidencia;
    private String domicilio;
    private String telefono;
    private String contactoEmergencia;
    private String vacunas;
    private String contactoAnimales;
    private String estadoVivienda;
    private String tipoSangre;
    private String enfInfancia;
    private String enfInfecciosas;
    private String enfCronicoDegenerativas;
    private String alergias;
    private String cirugiasPrevias;
    private String fracturas;
    private String transfusionesSanguineas;
    private String hospitalizaciones;
    private String motivoConsulta;
    private String evoPadecimientoActual;
    private String sospechaDiagnostica;
    private String planTratamiento;
    private String evoPaciente;
    private String prioritario;
    
    public String getSexo() {
        return sexo;
    }
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
    public String getOcupacion() {
        return ocupacion;
    }
    public String getEstadoCivil() {
        return estadoCivil;
    }
    public String getCiudadNacimiento() {
        return ciudadNacimiento;
    }
    public String getCiudadResidencia() {
        return ciudadResidencia;
    }
    public String getDomicilio() {
        return domicilio;
    }
    public String getTelefono() {
        return telefono;
    }
    public String getContactoEmergencia() {
        return contactoEmergencia;
    }
    public String getVacunas() {
        return vacunas;
    }
    public String getContactoAnimales() {
        return contactoAnimales;
    }
    public String getEstadoVivienda() {
        return estadoVivienda;
    }
    public String getTipoSangre() {
        return tipoSangre;
    }
    public String getEnfInfancia() {
        return enfInfancia;
    }
    public String getEnfInfecciosas() {
        return enfInfecciosas;
    }
    public String getEnfCronicoDegenerativas() {
        return enfCronicoDegenerativas;
    }
    public String getAlergias() {
        return alergias;
    }
    public String getCirugiasPrevias() {
        return cirugiasPrevias;
    }
    public String getFracturas() {
        return fracturas;
    }
    public String getTransfusionesSanguineas() {
        return transfusionesSanguineas;
    }
    public String getHospitalizaciones() {
        return hospitalizaciones;
    }
    public String getMotivoConsulta() {
        return motivoConsulta;
    }
    public String getEvoPadecimientoActual() {
        return evoPadecimientoActual;
    }
    public String getSospechaDiagnostica() {
        return sospechaDiagnostica;
    }
    public String getPlanTratamiento() {
        return planTratamiento;
    }
    public String getEvoPaciente() {
        return evoPaciente;
    }
    public String getPrioritario() {
        return prioritario;
    }
    

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }
    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    public void setCiudadNacimiento(String ciudadNacimiento) {
        this.ciudadNacimiento = ciudadNacimiento;
    }
    public void setCiudadResidencia(String ciudadResidencia) {
        this.ciudadResidencia = ciudadResidencia;
    }
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public void setContactoEmergencia(String contactoEmergencia) {
        this.contactoEmergencia = contactoEmergencia;
    }
    public void setVacunas(String vacunas) {
        this.vacunas = vacunas;
    }
    public void setContactoAnimales(String contactoAnimales) {
        this.contactoAnimales = contactoAnimales;
    }
    public void setEstadoVivienda(String estadoVivienda) {
        this.estadoVivienda = estadoVivienda;
    }
    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }
    public void setEnfInfancia(String enfInfancia) {
        this.enfInfancia = enfInfancia;
    }
    public void setEnfInfecciosas(String enfInfecciosas) {
        this.enfInfecciosas = enfInfecciosas;
    }
    public void setEnfCronicoDegenerativas(String enfCronicoDegenerativas) {
        this.enfCronicoDegenerativas = enfCronicoDegenerativas;
    }
    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }
    public void setCirugiasPrevias(String cirugiasPrevias) {
        this.cirugiasPrevias = cirugiasPrevias;
    }
    public void setFracturas(String fracturas) {
        this.fracturas = fracturas;
    }
    public void setTransfusionesSanguineas(String transfusionesSanguineas) {
        this.transfusionesSanguineas = transfusionesSanguineas;
    }
    public void setHospitalizaciones(String hospitalizaciones) {
        this.hospitalizaciones = hospitalizaciones;
    }
    public void setMotivoConsulta(String motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
    }
    public void setEvoPadecimientoActual(String evoPadecimientoActual) {
        this.evoPadecimientoActual = evoPadecimientoActual;
    }
    public void setSospechaDiagnostica(String sospechaDiagnostica) {
        this.sospechaDiagnostica = sospechaDiagnostica;
    }
    public void setPlanTratamiento(String planTratamiento) {
        this.planTratamiento = planTratamiento;
    }
    public void setEvoPaciente(String evoPaciente) {
        this.evoPaciente = evoPaciente;
    }
    public void setPrioritario(String prioritario) {
        this.prioritario = prioritario;
    }

    @Override
    public String mostrarInfo(){
    String info = super.mostrarInfo();
    info += "\nSexo: " + getSexo() +
            "\nFecha de Nacimiento: " + getFechaNacimiento() +
            "\nOcupación: " + getOcupacion() +
            "\nEstado Civil: " + getEstadoCivil() +
            "\nCiudad de Nacimiento: " + getCiudadNacimiento() +
            "\nCiudad de Residencia: " + getCiudadResidencia() +
            "\nDomicilio: " + getDomicilio() +
            "\nTelefono: " + getTelefono() +
            "\nContacto de Emergencia: " + getContactoEmergencia() +
            "\nVacunas: " + getVacunas() +
            "\nContacto con Animales: " + getContactoAnimales() +
            "\nEstado de Vivienda: " + getEstadoVivienda() +
            "\nTipo de Sangre: " + getTipoSangre() +
            "\nEnfermedades de Infancia: " + getEnfInfancia() +
            "\nEnfermedades Infecciosas: " + getEnfInfecciosas() +
            "\nEnfermedades Cronico Degenerativas: " + getEnfCronicoDegenerativas() +
            "\nAlergias: " + getAlergias() +
            "\nCirugias Previas: " + getCirugiasPrevias() +
            "\nFracturas: " + getFracturas() +
            "\nTransfusiones Sanguineas: " + getTransfusionesSanguineas() +
            "\nHospitalizaciones: " + getHospitalizaciones() +
            "\nMotivo de Consulta: " + getMotivoConsulta() +
            "\nEvolucion del Padecimiento Actual: " + getEvoPadecimientoActual() +
            "\nSospecha Diagnostica: " + getSospechaDiagnostica() +
            "\nPlan de Tratamiento: " + getPlanTratamiento() +
            "\nEvolucion del Paciente: " + getEvoPaciente() +
            "\nPaciente Prioritario: " + getPrioritario();
    return info;
    }
}

