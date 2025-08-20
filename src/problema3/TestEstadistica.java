/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema3;

import java.util.Scanner;

/**
 *
 * @author Joshelyn
 */
public class TestEstadistica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // solicitando al usuario ingresar 10 numeros
        System.out.print("Ingrese 10 numeros: ");
        float x1 = sc.nextFloat(), x2 = sc.nextFloat(), x3 = sc.nextFloat();
        float x4 = sc.nextFloat(), x5 = sc.nextFloat(), x6 = sc.nextFloat();
        float x7 = sc.nextFloat(), x8 = sc.nextFloat(), x9 = sc.nextFloat(), x10 = sc.nextFloat();
        
        // intancia dw un objeto de la clase Estadistica
        Estadistica est1 = new Estadistica(x1,x2,x3,x4,x5,x6,x7,x8,x9,x10); 
        
        // obteniendo el promedio y desviacion
        System.out.println("El promedio es "+ est1.promedio());
        System.out.println("La desviacion estandar es "+ est1.desviacion());
        
    }
}
