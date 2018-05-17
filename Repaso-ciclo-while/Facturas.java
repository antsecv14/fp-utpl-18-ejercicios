/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturas;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Facturas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Entrada= new Scanner (System.in);
        int cant=0;
        double sum=0;
        double preuni=0;
        double pretot ;
        double iva;
        boolean pregunta=true;
        System.out.println("Ingrese el nombre del cliente : \n");
        String nombrecli = Entrada.nextLine();
        String cadenafinal= String.format("\t\t\t\t\t%s\n\t\t\t%s\n%s  %s\n%s \t\t%s \t\t%s \t\t%s\n", "Factura", "   Supermercado  ~Todo a menor precio~","Nombre del cliente: ",nombrecli, "Articulo", "Cantidad", "Precio unitario", "Precio Total");
         while(pregunta){
            System.out.println("Ingrese nombre del artículo:");
            String narticulo = Entrada.nextLine();
            System.out.println("Ingrese cantidad de artículos:");
            cant = Entrada.nextInt();
            System.out.println("Ingrese el precio unitario:");
            preuni = Entrada.nextDouble();
            pretot=cant*preuni;
             sum=pretot+sum;
             Entrada.nextLine();
             cadenafinal = String.format("%s%-12s\t\t%d\t\t\t%.2f\t\t\t\t%.2f\n",cadenafinal,narticulo,cant,preuni,pretot);
             System.out.println("¿Desea ingresar mas articulos?(Escriba ~NO~ para salir)");
             String temporal = Entrada.nextLine();
             temporal =temporal.toUpperCase();
             if(temporal.equals("NO")){
                 pregunta=false;
             }
        }
         iva=sum*0.14;
          cadenafinal = String.format("%s  \t\t\t\t\t\t\tSubtotal:\t\t%.2f\n"
                + "  \t\t\t\t\t\t\tIva:     \t\t%.2f\n  \t\t\t\t\t\t\tTotal:    \t\t%.2f\n",cadenafinal,sum,iva,sum*1.14);
          System.out.printf(cadenafinal);
    }

}
   
