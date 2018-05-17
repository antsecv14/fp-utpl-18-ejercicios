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
public class reportautos {
      public static void main(String[] args) {
        // TODO code application logic here
        Scanner Entrada= new Scanner (System.in);
        int cont=1;
        int limite;
        double sum=0;
        double cost;
        double impu ;
        double pret=0;
        double totimp=0;
        
        int p1 =0;
        int p2 =0;
        int p3 =0;
        int p4 =0;
        boolean pregunta=true;
        System.out.println("Ingrese el limite de autos : \n");
        limite = Entrada.nextInt();
        Entrada.nextLine();
        String cadenafinal= String.format("\t\t\t%s\n%s  \t\t%s \t\t%s \t\t%s \t\t%s\n", "Reporte de autos importados", "Marca", "Origen", "Costo", "Impuesto", "Precio de venta");
         while(cont<=limite){
            System.out.println("Ingrese la marca del auto: ");
            String marca = Entrada.nextLine();
            System.out.println("Ingrese el origen del auto: ");
            String origen = Entrada.nextLine();
            System.out.println("Ingrese el costo del auto: ");
            cost = Entrada.nextDouble();
            Entrada.nextLine();
            if (origen.equals("argentina") ){
                impu=cost*0.2;
                p1 = p1+1;
            }else{
                if(origen.equals("colombia")){
                    impu=cost*0.25;
                    p2=p2+1;
                }else{
                    if(origen.equals("chile")){
                        impu=cost*0.30;
                        p3=p3+1;
                    }else{
                        impu=cost*0.40;
                        p4=p4+1;

                    }
                
                }

            }
            pret=impu+cost;
            totimp=totimp +impu;
            sum=sum+pret;
             cadenafinal = String.format("%s%-12s\t%-12s\t%.0f\t\t%.0f\t\t\t%.0f\n",cadenafinal,marca,origen,cost,impu,pret);
             cont =cont +1;
        }
         cont=cont-1;
          cadenafinal = String.format("%s\n%-12s\t%d\tTot. Imps  %.0f\t%s\t%.0f\n\n%-12s\t%d\n%-12s\t%d\n%-12s\t%d\n%-12s\t%d\n"
                ,cadenafinal,"Total Autos",cont,totimp,"Tot. PV",sum,"Argentina",p1,"Chile",p2,"Colombia",p3,"Otros Paises",p4);
          System.out.printf(cadenafinal);
    }

}
