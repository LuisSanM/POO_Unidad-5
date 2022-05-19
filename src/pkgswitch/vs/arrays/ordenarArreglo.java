/*
 Se solicita al usuario que defina el tamaño del arreglo, despues debera de intoducir valores numericos 
 de acuerdo al tamaño del arreglo indicar el indice en el cual se aloja dicho valor, 
 mostrar el total de elementos introducidos, por ultmo preguntar si se desea ordenar el arreglo.  
 */
package pkgswitch.vs.arrays;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class ordenarArreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Se cre objeto para guardar el valor (Tamaño del arreglo).
        int nn;

        Scanner sc = new Scanner(System.in);
         System.out.println("definir el tamaño del arreglo: ");
        nn = sc.nextInt();
        //nn en realidad guarda el total de elementos del arreglo 
        //se crea el arreglo de acuerdo al valor que tiene la variable "nn"
        int ArrayN[] = new int[nn];
        //se crea el ciclo o bucle para rellenar el arreglo con valores introducidos por el usuario
        for(int i=0; i <ArrayN.length;i++){
            System.out.println("Elemento alojado en el indice. "+(i+1)+" ");
            ArrayN[i]=sc.nextInt();
        }
        //Mostrar el arreglo sin ordenar3
        System.out.println("**** SIN ORDENAR ****");
        //Se llama al metodo; mostrarN
        mostrarN(ArrayN);
        //se pregunta si se desea ordenar el arreglo 
        System.out.println("Se desea ordenar el arrelo? S/N");
        
        Scanner sc2 = new Scanner(System.in);
        String res = sc2.nextLine();
        if(res.equalsIgnoreCase("S")){
            //SE MUESTRA EL ARREGLO ORDENADO
            System.out.println("**** ARREGLO ORDENADO ****");
            //Se llama metodo para ordenar 
            ordenarBurbuja(ArrayN);
        }
    }
    //SE crea metodo de ordenacion mediante el algoritmo burbuja 
     static void ordenarBurbuja(int ArrayN[]){
        //ciclo que recorta desde hasta la longitud del array
        for(int i=0;i<ArrayN.length -1;i++){
            for (int j = 0; j <ArrayN.length -1; j++) {
                if (ArrayN[j]>ArrayN[j+1]) {
                    int temp= ArrayN[j+1];
                    ArrayN[j+1]=ArrayN[j];
                    ArrayN[j]=temp;
                }
            }
        }
        mostrarN(ArrayN);}
    
     static void mostrarN(int ArrayN[]){
         System.out.println("....");
         for (int i = 0; i < ArrayN.length; i++) {
             System.out.println("elemnto"+(i+1)+"->"+ArrayN[i]+"\n");
         }
     }
}
