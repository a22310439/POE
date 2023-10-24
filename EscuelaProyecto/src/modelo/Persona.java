package modelo;

public class Persona {
    private String nombre;
    private int edad;
    private String email;
    private String codigo;

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getEmail() {
        return email;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public String mostrarInfo(){                  //agregar los saltos de linea
        String info = "Información:\n" +
                "\nNombre: " + getNombre() +
                "\nEdad: " + getEdad() +
                "\nEmail: " + getEmail() +
                "\nCodigo: " + getCodigo();
        return info;
    }
}
