/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Asthok
 */
public class PrincipalEscuela {
    public static void main(String[] args) {
        Alumno alumno = new Alumno();
        Docente docente = new Docente();
        
        alumno.setNombre("Juan Perez");
        alumno.setEdad(20);
        alumno.setEmail("juan@gmail.com");
        alumno.setCodigo("12345");
        alumno.setCarrera("IDS");
        
        docente.setNombre("Pedro Lopez");
        docente.setEdad(35);
        docente.setEmail("pedro@gmail.com");
        docente.setCodigo("56789");
        docente.setCantHoras(20);
        docente.setPagoHora(200);
        docente.calcularSalario();
        docente.evaluarAlumno(alumno, 87, 50, 90);
        
        System.out.println(alumno.mostrarInfo());
        System.out.println("------------------------------");
        System.out.println(docente.mostrarInfo());
        
    }    
}
