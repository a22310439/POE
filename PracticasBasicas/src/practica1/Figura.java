/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1;

import java.util.Scanner;

/**
 *
 * @author Asthok
 */
public class Figura {
    
    private double largo;
    private double ancho;
    private double alto;
    private double volumen;

    public double getLargo() {
        return largo;
    }

    public double getAncho() {
        return ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }
    
    public void leer_medida(){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Ingresa el largo de la figura: ");
        setLargo(in.nextDouble());
        
        System.out.println("Ingresa el ancho de la figura: ");
        setAncho(in.nextDouble());
        
        System.out.println("Ingresa el alto de la figura: ");
        setAlto(in.nextDouble());
    }
    
    public double obtener_volumen(){
        volumen = getLargo() * getAncho() * getAlto();
        return volumen;
    }
    
    public void imprimir_medidas(){
        System.out.println("""
                           Las medidas son:
                           
                           Largo: """ + getLargo() + 
                "\nAncho: " + getAncho() +
                "\nAlto: " + getAlto() +
                "\nVolumen: " + obtener_volumen());
    }
    
}
