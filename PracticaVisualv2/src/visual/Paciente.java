/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visual;

/**
 *
 * @author jaac2
 */
public class Paciente {
    private String nombre;
    private String apellido;
    private int edad;
    private String email;
    private String telefono;
    private String sexo;
    private String nacionalidad;
    private String residencia;
    private String tipoSangre;
    private String alergias;
    private String vacunas;

    public Paciente(String nombre){
        this.nombre = nombre;
        this.apellido = "";
    }

    public Paciente(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido(){
        return apellido;
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
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
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
}