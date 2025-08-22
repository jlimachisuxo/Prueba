/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema1;

import java.util.Scanner;

/**
 *
 * @author Joshelyn
 */
public class TestEcLineal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //solicitando al usuario ingresar los valores
        System.out.print("Ingrese a, b, c, d, e, f: ");
        double a = sc.nextDouble(), b = sc.nextDouble();
        double c = sc.nextDouble(), d = sc.nextDouble();
        double e = sc.nextDouble(), f = sc.nextDouble();
        
        //instancia de un objeto de la clase EcLineal
        EcLineal ec1 = new EcLineal(a, b, c, d, e, f);
        
        // verificamos si la ecuacion tiene solucion
        if(ec1.tieneSolucion()){
            System.out.println("x = "+ec1.getX()+", "+"y = "+ec1.getY());
        }
        else{
            System.out.println("La ecuacion no tiene solucion.");
        }
    }
}
