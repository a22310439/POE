/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author Asthok
 */
public class AutomovilPrincipal {
 
    public static void main(String[] args){
        Automovil objauto = new Automovil();
        
        objauto.solicitarDatos();
        System.out.println(objauto.toString());
        switch (objauto.getAño()){
            case(2003):
                System.out.println("EL AÑO ES 2003!!!!");
            break;
        }
    }
    
}
