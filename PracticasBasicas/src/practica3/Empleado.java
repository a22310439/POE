/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica3;

import java.util.Scanner;

/**
 *
 * @author jaac2
 */
public class Empleado {
    private String nombre;
    private String puesto;
    private double pagoHora;
    private double horasTrabajadasMes;
    private double salarioMensual;

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public double getPagoHora() {
        return pagoHora;
    }

    public double getHorasTrabajadasMes() {
        return horasTrabajadasMes;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setPagoHora(double pagoHora) {
        this.pagoHora = pagoHora;
    }

    public void setHorasTrabajadasMes(double horasTrabajadasMes) {
        this.horasTrabajadasMes = horasTrabajadasMes;
    }

    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    public void capturar_datos_trabajador(){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Ingresa el nombre del trabajador: ");
        setNombre(in.nextLine());
        
        System.out.println("Ingresa el puesto del trabajador: ");
        setPuesto(in.nextLine());
        
        System.out.println("Ingresa el pago por hora trabajada: ");
        setPagoHora(in.nextDouble());
        
        System.out.println("Ingresa las horas trabajadas en el mes: ");
        setHorasTrabajadasMes(in.nextDouble());
    }
    
    public double obtener_salario_mensual(){
        double cantidadFinal;
        
        cantidadFinal = getPagoHora() * getHorasTrabajadasMes();
        
        if(getHorasTrabajadasMes() >= 100 && getHorasTrabajadasMes() <= 200){
            cantidadFinal = cantidadFinal + (cantidadFinal * 0.1);
        }
        if(getHorasTrabajadasMes() >= 201 && getHorasTrabajadasMes() <= 220){
            cantidadFinal = cantidadFinal + (cantidadFinal * 0.2);
        }
        if(getHorasTrabajadasMes() >= 221 && getHorasTrabajadasMes() <= 230){
            cantidadFinal = cantidadFinal + (cantidadFinal * 0.3);
        }
        
        cantidadFinal = cantidadFinal - (cantidadFinal * 0.16);
        
        return cantidadFinal;
    }
    
    public void imprimir_datos_trabajador(){
        System.out.println("\nInformacion del trabajador: \n"
                + "\nNombre: " + getNombre()
                + "\nPuesto: " + getPuesto()
                + "\nPago por hora: " + getPagoHora()
                + "\nHoras trabajadas en el mes: " + getHorasTrabajadasMes()
                + "\nSalario mensual: " + obtener_salario_mensual());
    }
    
}
