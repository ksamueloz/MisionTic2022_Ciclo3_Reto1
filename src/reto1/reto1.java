/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reto1;

import java.util.Scanner;

/**
 *
 * @author Kevin Moreno
 */
public class reto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        
        System.out.print("Ingrese la cantidad de pacientes: ");
        int pacientes = Integer.parseInt(leer.nextLine());
        /* Vector 'almacen' de n filas por 6 columnas. */
        String[][] almacen = new String[pacientes][6];
        
        for(int i = 0; i < pacientes; i++) {
                /* Por cada paciente leo la información. */
                System.out.print("Ingrese la informacion del paciente: ");
                String p = leer.nextLine();
                String[] cadenaSeparada = p.split("-");
                
                /* Habiendo leído la información la separo y la inserto en el vector almacen. */
                for (int k = 0; k < cadenaSeparada.length; k++) {
                    almacen[i][k] = cadenaSeparada[k];
                }
        }
        
        /* Ingreso la información de las ciudades. */
        
        System.out.print("Ingrese las ciudades: ");
        String entradaCiudades = leer.nextLine();
        String[] cadenaSeparadaCiudades = entradaCiudades.split("-");
        
        /* Con esto tengo el total de ciudades que hay. */
        String[] ciudades = new String[cadenaSeparadaCiudades.length];
        
        /*String[] xyz = new String[pacientes];
        
        for (int i = 0; i < cadenaSeparadaCiudades.length; i++) {
            xyz[i] = cadenaSeparadaCiudades[i];
        }*/
        
        
        int[] vectorContador = new int[pacientes];
        int suma = 0;
        
        for (int i = 0; i < cadenaSeparadaCiudades.length; i++) {
            for (int j = 0; j < almacen.length; j++) {
                /* Cuento el número de veces que aparece el valor de la ciudad en 'cadenaSeparadaCiudades' 
                   dentro del vector 'almacen' el cual tiene la información de todos los pacientes.
                */
                if(cadenaSeparadaCiudades[i].equalsIgnoreCase(almacen[j][3])) {
                    suma += 1;
                }
                
                
                vectorContador[i] = suma;
            } 
             suma = 0;
        }
        
        for (int i = 0; i < vectorContador.length; i++) {
            if(i < ciudades.length) {
                System.out.println(vectorContador[i]);
            }
        } 

    }
    
}
