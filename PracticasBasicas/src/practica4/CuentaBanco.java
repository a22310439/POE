/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica4;

import java.util.Scanner;

/**
 *
 * @author jaac2
 */
public class CuentaBanco {
    private String nombreC;
    private String numeroC;
    private double saldoC;
    Scanner in = new Scanner(System.in);

    public String getNombreC() {
        return nombreC;
    }

    public String getNumeroC() {
        return numeroC;
    }

    public double getSaldoC() {
        return saldoC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    public void setNumeroC(String numeroC) {
        this.numeroC = numeroC;
    }

    public void setSaldoC(double saldoC) {
        this.saldoC = saldoC;
    }
    
    public void capturar_datos(){        
        System.out.println("Ingresa el nombre del cliente: ");
        setNombreC(in.nextLine());
        
        System.out.println("Ingresa el numero de cuenta: ");
        setNumeroC(in.next());
        
        System.out.println("Ingresa el saldo inicial de la cuenta: ");
        setSaldoC(in.nextDouble());
    }
    
    public void imprimir_datos(){
        System.out.println("\nDatos de la cuenta:"
                + "\nNombre del cliente: " + getNombreC()
                + "\nNumero de la cuenta: " + getNumeroC()
                + "\nSaldo de la cuenta: " + getSaldoC() + "\n");
    }
    
    public void abonar_cuenta(double cantidad){
        setSaldoC(getSaldoC() + cantidad);
        System.out.println("Nuevo saldo: " + getSaldoC() + "\n");
    }
    
    public void retirar_cuenta(double cantidad){
        if(getSaldoC() > cantidad){
        setSaldoC(getSaldoC() - cantidad);
        System.out.println("Nuevo saldo: " + getSaldoC() + "\n");
        }else{
            System.out.println("La cantidad a retirar es mayor al saldo de la cuenta, el saldo de la cuenta permanecera intacto.\n");
        }
    }
    
    public void mostrar_menu(){
        int opcion;
        double cantidad;
        boolean sistemaActivo = true;
        while(sistemaActivo){
            System.out.println("         Sistema de Manejo de Cuenta Bancaria\n"
                    + "\n1- Crear la cuenta bancaria"
                    + "\n2- Imprimir datos"
                    + "\n3- Abonar a la cuenta bancaria"
                    + "\n4- Retirar de la cuenta bancaria"
                    + "\n5- Salir del sistema"
                    + "\n\nSelecciona la accion a realizar: ");
            opcion = in.nextInt();
            in.nextLine();

            while(opcion < 1 || opcion > 5){
                System.out.println("La opcion ingresada no es valida, vuelve a intentarlo: ");
                opcion = in.nextInt();
            }

            switch (opcion){
                case (1):
                    capturar_datos();
                    break;
                case (2):
                    imprimir_datos();
                    break;
                case (3):
                    System.out.println("\nIngresa la cantidad a abonar:");
                    cantidad = in.nextDouble();
                    abonar_cuenta(cantidad);
                    break;
                case (4):
                    System.out.println("\nIngresa la cantidad a retirar:");
                    cantidad = in.nextDouble();
                    retirar_cuenta(cantidad);
                    break;
                case (5):
                    sistemaActivo = false;
                    break;
            }
        }
    }
}
