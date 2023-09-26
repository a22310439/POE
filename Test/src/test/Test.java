/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Asthok
 */


public class Test {
    public static void main(String[] args){     //Sintaxis para hacer la funcion main
        Scanner cin = new Scanner(System.in);
        Figura triangulo = new Figura();
        
        System.out.println("Ingresa el nombre del triangulo");
        triangulo.setNombre(cin.next());
        System.out.println("Ingresa el area del triangulo");
        triangulo.setArea(cin.nextDouble());
        
        System.out.println(triangulo.getNombre()+ ", " + triangulo.getArea());
        
    }
    
}
