/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.condiciones.pkg2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ProyectoCondiciones2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a,b,c;
            
         System.out.println("Ingrese la varible A=");
    Scanner leerA =new Scanner(System.in);
    a=leerA.nextDouble();
    
    System.out.println("Ingrese la varible b=");
    Scanner leerb =new Scanner(System.in);
    b=leerb.nextDouble();
    
    if(b>0){  
    c=a/b;     
    System.out.println("El resultado de la division es="+c);
    }
    else{
        System.out.println("No se puede hacer la division");
    }
    
            
             
    }

            
    
}
