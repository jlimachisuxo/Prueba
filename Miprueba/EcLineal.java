/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema1;

/**
 *
 * @author Joshelyn
 */
public class EcLineal {
    private double a, b, c , d, e, f;
    
    // constructor
    public EcLineal(double a, double b, double c, double d, double e, double f){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    // metodo para verificar si tiene solucion
    public boolean tieneSolucion(){
        return (a * d - b * c) != 0;
    }
    // metodo para obtener la solucuion de x
    public double getX(){
        if(tieneSolucion()){
            return (e*d - b*f) / (a*d - b*c);
        }
        else{
            // Double.NaN es una forma de indicar que el resultado no es un numero real
            return Double.NaN;
        }
    }
    
    // metodo para obtener la solucuion de y
    public double getY(){
        if(tieneSolucion()){
            return (a*f - e*c) / (a*d - b*c);
        }
        else{
            return Double.NaN;
        }
    }
}

