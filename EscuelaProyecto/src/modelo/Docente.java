package modelo;

public class Docente extends Persona {
    private double cantHoras;
    private double pagoHora;
    private double salario;

    public double getCantHoras() {
        return cantHoras;
    }

    public double getPagoHora() {
        return pagoHora;
    }

    public double getSalario() {
        return salario;
    }

    public void setCantHoras(double cantHoras) {
        this.cantHoras = cantHoras;
    }

    public void setPagoHora(double pagoHora) {
        this.pagoHora = pagoHora;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void calcularSalario(){
        setSalario((getPagoHora() * getCantHoras()));
    }
    
    public void evaluarAlumno(Alumno alumno){
        alumno.obtenerPromedio();
    }
    
    @Override
    public String mostrarInfo(){
        String info = super.mostrarInfo();
        info += "Horas impartidas: " + getCantHoras() +
                "Pago por hora: " + getPagoHora() +
                "Salario: " + getSalario();
        return info;
    }
}
