package modelo;

public class persona {
    private String nombre;
    private String apellido;
    private String email;
    private String codigo;
    
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
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
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
