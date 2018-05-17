/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller1;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class ejercicio1_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner entrada = new Scanner(System.in);
        int sum=0;
        int din =0;
        int hij=0;
        double pasaje=0;
        double bar=0;
        double salidas=0;
        double sumpa=0;
        double sumba=0;
        double sumsal=0;
        double sumto=0;
        System.out.printf("Ingrese el sueldo del padre: ");
        din= entrada.nextInt();
        System.out.printf("Ingrese la cantidad de hijos que tiene: ");
        hij= entrada.nextInt();
        String cadenafinal=String.format("\t\t\t%s\n%s \t\t%s \t\t%s \t\t%s\n", "~Costos Familia~", "Persona", "Pasaje", "Bar", "Salidas");
        for (int cont=1;cont<=hij;cont++){
            System.out.println("Ingrese  el gasto en pasajes del hijo "+cont);
            pasaje=entrada.nextDouble();
            System.out.println("Ingrese el gasto en bares del hijo "+cont);
            bar=entrada.nextDouble();
            System.out.println("Ingrese el gasto en salidas del hijo "+cont);
            salidas=entrada.nextDouble();
            sumpa=sumpa+pasaje;
            sumba=sumba+bar;
            sumsal=sumsal+salidas;
            sumto=sumpa+sumba+sumsal;
     
            cadenafinal=String.format("%s\n%s%s \t\t\t%.2f \t\t%.2f \t\t%.2f ",cadenafinal,"hijo",cont,pasaje,bar,salidas);
            
        }
        cadenafinal =String.format("%s\n%s\n\t\t\t%.2f \t\t%.2f \t\t%.2f",cadenafinal,"Totales",sumpa,sumba,sumsal);
        System.out.println(cadenafinal);
        if(sumto<din){
            System.out.println("Al padre de familia le sobra dinero ");
        }else{
            if(sumto>din){
                System.out.println("Al padre de familia le falta dinero");
            
            
            }
        
        
        }
        }
    }
    
