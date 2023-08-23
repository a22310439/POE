package test;

import java.util.Scanner;

public class Automovil {
    
    //Atributos de la clase
    private String marca;
    private int año;
    private String Modelo;
    private double precio;

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public int getAño() {
        return año;
    }

    public String getModelo() {
        return Modelo;
    }

    public double getPrecio() {
        return precio;
    }
    
    public void solicitarDatos(){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Ingresa la marca del auto: ");
        setMarca(in.next());
        
        System.out.println("Ingresa el modelo del auto: ");
        setModelo(in.next());
        
        System.out.println("Ingresa el año del auto: ");
        setAño(in.nextInt());
        
        System.out.println("Ingresa el precio del auto: ");
        setPrecio(in.nextDouble());
    }
    
    @Override
    public String toString(){
        
        String auto = "Marca :" + getMarca() + 
                "\nAño: " + getAño() +
                "\nModelo: " + getModelo() + 
                "\nPrecio: $" + getPrecio();
        
        return auto;
    }
}