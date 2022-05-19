/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkgswitch.vs.arrays;

import java.util.Random;

/**
 *
 * @author invitado
 */
public class DadosSwitches {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random numerosAleatorios = new Random();
         int frecuencia1=0;
         int frecuencia2=0;
         int frecuencia3=0;
         int frecuencia4=0;
         int frecuencia5=0;
         int frecuencia6=0;
         
         int cara;
         
         for(int tiros=1;tiros<60;tiros++);
         cara=1+numerosAleatorios.nextInt(6);
                 
                 
                 switch(cara){
                     case 1:++frecuencia1;
                         break;
                     case 2:++frecuencia2;
                         break;
                     case 3:++frecuencia3;
                         break;
                     case 4:++frecuencia4;
                         break;
                     case 5:++frecuencia5;
                         break;
                     case 6:++frecuencia6;
                         break;
                     
                 }
                 System.out.println("cara \\  frecuencia");
                 System.out.printf("1\t%d\n2\t%d\n3\t%d\n4\t%d\n5\t%d\n6\t\n",frecuencia1,frecuencia2,frecuencia3,frecuencia4,frecuencia5,frecuencia6);
         
        
        // TODO code application logic here
    }
    
}
