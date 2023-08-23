/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica2;

import java.util.Scanner;

/**
 *
 * @author jaac2
 */
public class Fecha {
    private int dia;
    private int mes;
    private int año;
    
    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAño() {
        return año;
    }
    
    public void leer_fecha(){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Se va a ingresar una fecha con numeros (ejemplo: 10/13/2023):\n");
        System.out.println("Ingresa el dia: ");
        setDia(in.nextInt());
        
        System.out.println("Ingresa el mes: ");
        setMes(in.nextInt());
        
        System.out.println("Ingresa el año: ");
        setAño(in.nextInt());
    }
    
    public int validar_fecha(){
        if(getDia() < 1 || getDia() > 31 || getMes() < 1 || getMes() > 12 || getAño() < 1){
            if(getDia() < 1 || getDia() > 31){
                System.out.println("El dia ingresado no es valido, "
                        + "vuelve a intentarlo.");
            }
            if(getMes() < 1 || getMes() > 12){
                System.out.println("El mes ingresado no es valido, vuelve a intentarlo.");
            }
            if(getAño() < 1){
                System.out.println("El anio ingresado no es valido, vuelve a intentarlo.");
            }
            return 0;
        }
        
        if(getMes() == 4 || getMes() == 6 || getMes() == 9 || getMes() == 11){
            if(getDia() > 30){
                System.out.println("Ese mes no tiene 30 dias, vuelve a intentarlo.");
                return 0;
            }
        }
        
        if(getMes() == 2 && (getAño() % 4) == 0 && getDia() == 29){
            System.out.println("El anio es bisiesto, no puede tener 29 dias.");
        }
        
        return 1;
    }
    
    public void imprimir_fecha_corta(){
        System.out.println("La fecha corta es: " + getDia() + "/" + getMes() +
                "/" + getAño());
    }
    
    public void imprimir_fecha_larga(){
        String[] fecha = new String[]{"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        System.out.println("La fecha larga es: " + getDia() + " de " + fecha[getMes()-1] + " del " + getAño());
    }
}