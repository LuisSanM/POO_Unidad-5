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
public class DadosArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random numerosAleatorios = new Random();
        //Un arreglo de contadores con frecuencia 
        int[]frecuencia = new int[7];
        for(int tiro=1;tiro<60;tiro++){
            ++frecuencia[1+numerosAleatorios.nextInt(6)];
            System.out.printf("%s%10s\n", "CARA" , "FRECUENCIA");
        }
       for(int cara=1;cara<frecuencia.length;cara++){
           System.out.printf("%4d%10d\n",cara,frecuencia[cara]);
       } 
    }
    
}
