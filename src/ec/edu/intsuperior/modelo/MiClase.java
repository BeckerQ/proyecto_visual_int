/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

/**
 *
 * @author Usuario
 */
public class MiClase {
        public static void suma() {
        int x, y, z;
        x = 4;
        y = 6;
        z = x + y;
        System.out.println("la suma es : " + z);
    }

    public static int resta() {
        int x, y, z;
        x = 8;
        y = 2;
        z = x + y;
        return z;
    }

    public void multiplicacion() {
        int x, y, z;
        x = 5;
        y = 6;
        z = x * y;
        System.out.println("la multiplicacion es ;" + z);

    }
    public static float division(){
    float x,y;
    x=54;
    y=3;
    return x/y;
    }
    public static void promedio(){
        float x,y,z;
        float prom;
        x=8;
        y=5;
        z=7;
        prom= (float) (x+y+z)/3;
        System.out.println("el promedio es "+prom);
        
        if(prom>=7){
            System.out.println("exonerado");
        }else {
            if(prom>=4){
                System.out.println("suspenso");
            } else
                System.out.println("pierde");
            }
        }
    
}
