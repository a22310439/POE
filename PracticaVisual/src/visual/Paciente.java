package visual;

public class Paciente {
    private String nombre;
    private String apellidos;
    private int edad;
    private String email;
    private String telefono;
    private String sexo;
    private String nacionalidad;
    private String residencia;
    private String tipoSangre;
    private String alergias;
    private String vacunas;
    private String prioritario;

    public Paciente(String nombre, String apellidos, int edad, String email, String telefono, String sexo, String nacionalidad, String residencia, String tipoSangre, String alergias, String vacunas, String prioritario){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.email = email;
        this.telefono = telefono;
        this.sexo = sexo;
        this.nacionalidad = nacionalidad;
        this.residencia = residencia;
        this.tipoSangre = tipoSangre;
        this.alergias = alergias;
        this.vacunas = vacunas;
        this.prioritario = prioritario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos(){
        return apellidos;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getTelefono() {
        return telefono;
    }
    
    public String getSexo() {
        return sexo;
    }
    
    public String getNacionalidad() {
        return nacionalidad;
    }
    
    public String getResidencia() {
        return residencia;
    }
    
    public String getTipoSangre() {
        return tipoSangre;
    }
    
    public String getAlergias() {
        return alergias;
    }
    
    public String getVacunas() {
        return vacunas;
    }
    
    public String getPrioritario() {
        return prioritario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    
    public void setResidencia(String residencia) {
        this.residencia = residencia;
    }
    
    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }
    
    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }
    
    public void setVacunas(String vacunas) {
        this.vacunas = vacunas;
    }

    public void setPrioritario(String prioritario) {
        this.prioritario = prioritario;
    }
}