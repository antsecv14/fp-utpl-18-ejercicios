/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Crear un programa que permita ingresar una calificacion por teclado,
si la calificacion ingresada es mayor igual a 5 y la calificacion es 
menor a 10 se debe presentar un mensaje que diga "Usted esta en supletorios"
de lo contrario se presenta el mensaje con el valor de la calificacion dividido
para dos.
*/
package ejemplos;

import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author Salas
 */
public class EjemploSeleccion {
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            double calificacion;
            System.out.println("ingrese su calificacion");
            calificacion= entrada.nextInt();
            if(calificacion>=5&& calificacion<10){
                System.out.printf("usted esta en supletorios");
            }else{
              //System.out.printf("%d", calificacion/2);
                double resultado = calificacion/2;
                System.out.printf("%f", resultado);
 
            }
        }
}
