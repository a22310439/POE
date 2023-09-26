/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author jaac2
 */
public class Figura {
    private String nombre;
    private double area;
    
    public void nombre(double area, String nombre){
        this.area = area;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public double getArea() {
        return area;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setArea(double area) {
        this.area = area;
    }
    
    
    
}
