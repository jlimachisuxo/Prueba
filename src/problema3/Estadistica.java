/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema3;

/**
 *
 * @author Joshelyn
 */
public class Estadistica {
    // atributos
    private float x1, x2, x3, x4, x5, x6, x7, x8, x9, x10;
    // constructor
    public Estadistica(float x1,float x2, float x3, float x4,float x5,float x6, float x7,float x8, float x9,float x10){
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.x4 = x4;
        this.x5 = x5;
        this.x6 = x6;
        this.x7 = x7;
        this.x8 = x8;
        this.x9 = x9;
        this.x10 = x10;
    }
    // metodo para obtener el promedio
    public float promedio(){
        float prom = (x1+x2+x3+x4+x5+x6+x7+x8+x9+x10)/10;
        return prom;
    }
    // metodo para obtener la desviacion
    public float desviacion(){
        float prom = promedio();
        float desv = (float) Math.sqrt((Math.pow(x1-prom, 2)+Math.pow(x2-prom, 2)+Math.pow(x3-prom, 2)+Math.pow(x4-prom, 2)+Math.pow(x5-prom, 2)+Math.pow(x6-prom, 2)+Math.pow(x7-prom, 2)+Math.pow(x8-prom, 2)+Math.pow(x9-prom, 2)+Math.pow(x10-prom, 2))/9);
        return desv;
    }
}
    
