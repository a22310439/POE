/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica2;

/**
 *
 * @author jaac2
 */
public class PrincipalFecha {
    public static void main(String[] args){
        Fecha objFecha1 = new Fecha();
        
        objFecha1.leer_fecha();
        
        if(objFecha1.validar_fecha() == 1){
            objFecha1.imprimir_fecha_corta();
            objFecha1.imprimir_fecha_larga();
        }
    }
}
