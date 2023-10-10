package visual;

public class Usuario {
    private String nombre;
    private char[] contrasena;
    
    public String getNombre() {
        return nombre;
    }

    public char[] getContrasena() {
        return contrasena;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setContrasena(char[] contrasena) {
        this.contrasena = contrasena;
    }
}
