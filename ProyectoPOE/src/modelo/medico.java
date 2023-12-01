package modelo;

public class medico extends persona{
    private String area;
    private String posicion;
    private String cedula;

    public String getArea() {
        return area;
    }
    public String getPosicion() {
        return posicion;
    }

    public String getCedula() {
        return cedula;
    }
    

    public void setArea(String area) {
        this.area = area;
    }
    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
}
