/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicav2;

/**
 *
 * @author Asthok
 */
public class Usuario {
    private String nombre;
    private int edad;
    private String email;
    private String telefono;
    private String carrera;

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    public String getNombre() {
        return nombre;
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

    public String getCarrera() {
        return carrera;
    }
    
    @Override
    public String toString(){
        String contenido = "Nombre: " + getNombre() + 
                "\nEdad: " + getEdad() +
                "\nEmail: " + getEmail() +
                "\nTelefono: " + getTelefono() +
                "\nCarrera: " + getCarrera();
        
        return contenido;
    }
}