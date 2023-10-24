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
    
    public void evaluarAlumno(Alumno alumno, double calMate, double calFisica, double calProgra){
        alumno.setCalMate(calMate);
        alumno.setCalFisica(calFisica);
        alumno.setCalProgra(calProgra);
        alumno.obtenerPromedio();
    }
    
    @Override
    public String mostrarInfo(){
        String info = super.mostrarInfo();
        info += "\n\nHoras impartidas: " + getCantHoras() +
                "\nPago por hora: " + getPagoHora() +
                "\nSalario: " + getSalario();
        return info;
    }
}
