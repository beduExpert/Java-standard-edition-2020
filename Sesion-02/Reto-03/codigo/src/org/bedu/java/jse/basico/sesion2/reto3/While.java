package org.bedu.java.jse.basico.sesion2.reto3;

public class While {
    public static void main(String[] args) {

        //Imprimir del 1 al 10 usando while
        /*short i = 0;
        while (++i <= 10) {
            System.out.println("El valor de i es " + i);
        }*/

        //Imprimir del 1 al 10 usando do...while
        /*short i = 1;

        do {
            System.out.println("El valor de i es " + i);
        } while (i++ < 10);*/


        short[] valores = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //Imprimir todos los valores del arreglo
        /*
        short i = 0;
        while(i < valores.length){
            System.out.println("El valor actual del arreglo es " + valores[i++]);
        }*/

        short i = 1;
        while(i <= valores.length){
            System.out.println("El valor actual del arreglo es " + valores[i]);
            i += 2;
        }

    }
}
