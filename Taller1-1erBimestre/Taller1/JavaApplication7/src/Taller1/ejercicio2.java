
package Taller1;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int sum = 0;
        int din = 0;
        int hij = 0;
        int pad = 0;
        double dinfi=0;
        double pasaje = 0;
        double bar = 0;
        double salidas = 0;
        double sumpa = 0;
        double sumba = 0;
        double sumsal = 0;
        double sumto = 0;
        System.out.print("Ingrese la cantidad de padres de padres de familia: ");
        pad = entrada.nextInt();
        String cadenafinal="";
        entrada.nextLine();
        for (int contp = 1; contp <= pad; contp++) {
            System.out.print("Ingrese el nombre 1 del padre " + contp + " :\n");
            String nombre = entrada.nextLine();          
            System.out.print("Ingrese el nombre 2 del padre " + contp + " :\n");
            String nombre2 = entrada.nextLine();
            System.out.print("Ingrese el apellido 1 del padre" + contp + " :\n");
            String apellido = entrada.nextLine();
            System.out.print("Ingrese el apellido 2 del padre" + contp + " :\n");
            String apellido2 = entrada.nextLine();
            System.out.printf("Ingrese el sueldo del padre: ");
            din = entrada.nextInt();
            System.out.print("Ingrese la cantidad de hijos que tiene el padre " + contp + " :\n");
            hij = entrada.nextInt();
            cadenafinal = String.format("%s \t\t\t%s\n %s %s %s \n%s \t\t%s \t\t%s \t\t%s\n",cadenafinal, "~Costos Familia~", "Nombre de padre de familia: ", nombre, apellido, "Persona", "Pasaje", "Bar", "Salidas");
            for (int cont = 1; cont <= hij; cont++) {
                System.out.println("\nIngrese  el gasto en pasajes del hijo " + cont + " del padre " + contp);
                pasaje = entrada.nextDouble();
                System.out.println("Ingrese el gasto en bares del hijo " + cont + " del padre " + contp);
                bar = entrada.nextDouble();
                System.out.println("Ingrese el gasto en salidas del hijo " + cont + " del padre " + contp);
                salidas = entrada.nextDouble();
                sumpa = sumpa + pasaje;
                sumba = sumba + bar;
                sumsal = sumsal + salidas;

                cadenafinal = String.format("%s\n%s%s \t\t\t%.2f \t\t%.2f \t\t%.2f ", cadenafinal, "hijo", cont, pasaje, bar, salidas);

            }
            sumto = sumpa + sumba + sumsal;
            cadenafinal = String.format("%s\n%s\n\t\t\t%.2f \t\t%.2f \t\t%.2f", cadenafinal, "Totales", sumpa, sumba, sumsal);
            if (sumto < din) {
                dinfi = din-sumto;
                cadenafinal=String.format("%s\n El padre de familia %s %s %s %s le sobran %.2f dolares\n\n", cadenafinal, nombre, nombre2, apellido, apellido2, dinfi);
            } else {
                if (sumto > din) {
                    dinfi = sumto-din;
                    cadenafinal=String.format("%s\n El padre de familia %s %s %s %s le faltan %.2f dolares\n\n", cadenafinal, nombre, nombre2, apellido, apellido2, dinfi);

                }
            }
            sumpa=0;
            sumba=0;
            sumsal=0;
            entrada.nextLine();
        }
          System.out.print(cadenafinal);
          System.out.println();
    }
}
