/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_4;

import Entidades.Pelicula;
import Utilidades.utilidadesPelicula;
import Servicios.serivciosPelicula;
import java.util.ArrayList;

/**
 *
 * @author droa
 */
public class Ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Pelicula> peliculas = new ArrayList<>();
        serivciosPelicula sP = new serivciosPelicula();
        
        sP.crearPelicula(peliculas);
        
        System.out.println("Películas Registradas:  ");
        System.out.println(peliculas.toString().replace(",", ""));
        
        System.out.println("Filtro: Películas mayor a 1 hora");
        System.out.println(sP.filtroDuracion(peliculas));
        
        System.out.println("Ordenado: De Mayor a Menor Duración:");
        peliculas.sort(utilidadesPelicula.compararDuracionDESC);        
        System.out.println(peliculas.toString().replace(",", ""));
        
        System.out.println("Ordenado: De Menor a Mayor Duración:");
        peliculas.sort(utilidadesPelicula.compararDuracionASC);
        System.out.println(peliculas.toString().replace(",", ""));
        
        System.out.println("Ordenado: Titulo (A-Z):");
        peliculas.sort(utilidadesPelicula.compararTituloAZ);
        System.out.println(peliculas.toString().replace(",", ""));
        
        System.out.println("Ordenado: Director (A-Z):");
        peliculas.sort(utilidadesPelicula.comparardirectorAZ);
        System.out.println(peliculas.toString().replace(",", ""));
        
    }
    
}
