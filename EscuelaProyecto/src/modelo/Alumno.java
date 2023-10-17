package modelo;

public class Alumno extends Persona {
    private String carrera;
    private double calMate;
    private double calFisica;
    private double calProgra;
    private double promedio;

    public String getCarrera() {
        return carrera;
    }

    public double getCalMate() {
        return calMate;
    }

    public double getCalFisica() {
        return calFisica;
    }

    public double getCalProgra() {
        return calProgra;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setCalMate(double calMate) {
        this.calMate = calMate;
    }

    public void setCalFisica(double calFisica) {
        this.calFisica = calFisica;
    }

    public void setCalProgra(double calProgra) {
        this.calProgra = calProgra;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    
    public void obtenerPromedio(){
        setPromedio((getCalMate() + getCalFisica() + getCalProgra()) / 3);
    }
    
    @Override
    public String mostrarInfo(){                        //agregar saltos de linea
        String info = super.mostrarInfo();
        info += "\nCarrera: " + getCarrera() +
                "\nCalificacion de Matematicas: " + getCalMate() +
                "\nCalificacion de Fisica: " + getCalFisica() +
                "\nCalificacion de Programacion: " + getCalProgra() +
                "\nPromedio: " + getPromedio() +
                "\nPromedio redondeado: " + Math.round(getPromedio());
        return info;
    }
}
