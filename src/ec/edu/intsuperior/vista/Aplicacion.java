/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.modelo.MiClase;
import java.util.Scanner;


/**
 *
 * @author Usuario
 */
public class Aplicacion {

       public static void main(String[] args) {
//        System.out.println(MiClase.resta());
//        System.out.println(MiClase.division());
        

        
        
       // suma();
        //System.out.println("la resta es " + resta());
        //Aplicacion ap = new Aplicacion();
        //ap.multiplicacion();
        //System.out.println("la division es " +ap.division());
        //promedio();
        
        
    }
     public void Estriangulo(){
            Scanner imput = new Scanner(System.in);
            System.out.println("ingrese un valor ");    
            int   a=imput.nextInt();
            int b=imput.nextInt();
            int c=imput.nextInt();
             System.out.println("ingrese un valor ");  
            
            if(a+b>c){
                if(a+c>b){
                    if(b+c>a){
                        System.out.println("si es un triangulo");
                        
                          }else{
                        System.out.println("no es un triangulo");
                    }
                    
                }
            }
     }
                
            


                    
    }



