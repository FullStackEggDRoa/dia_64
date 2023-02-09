/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_3;

import Entidades.Alumno;
import Servicios.serviciosAlumno;
import java.util.ArrayList;

/**
 *
 * @author droa
 */
public class Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Alumno> alumnos = new ArrayList();
        serviciosAlumno sA = new serviciosAlumno();
        sA.crearAlumno(alumnos);
        sA.notaFinal(alumnos);
    }
    
}
