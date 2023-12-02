package modelo;

public class usuario extends persona{
    private String nombreUsuario;
    private String contrasena;
    private String tipoUsuario;

    public String getNombreUsuario() {
        return nombreUsuario;
    }
    public String getTipoUsuario() {
        return tipoUsuario;
    }
    public String getContrasena() {
        return contrasena;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    @Override
    public String mostrarInfo(){
        String info = super.mostrarInfo();
        info += "\nNombre de usuario: " + getNombreUsuario() +
        "\nContrasena: " + getContrasena() +
        "\nTipo de usuario: " + getTipoUsuario();
        return info;
    }
} 
