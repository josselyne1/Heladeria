/*
 * 2.	Una heladería desea obtener un reporte semanal de ventas.
Para ello debe capturar en un sistema todas las facturas de ventas realizadas.
Cada factura contiene la cantidad y el sabor de las paletas vendidas. Los sabores 
y los precios son: limón ($2500), nuez ($2800), lulo ($2600), fresa ($2000) y 
crema ($3000). El sistema debe imprimir la cantidad de paletas vendidas de cada
sabor, el valor vendido y la venta total. Considere que una factura puede tener v
arias paletas de diferentes sabores.
 */
package heladeria;

import java.util.Scanner;

/**
 *
 * josselyne ester chilito galindez , codigo: 20201187434
 */
public class Heladeria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada =new Scanner(System.in);
       String sabor;
       int l = 0, n = 0, lu = 0, f = 0, c = 0; 
       int limon = 2500, nuez = 2800;
       int lulo = 2600;
       int fresa = 2000;
       int crema = 3000;
       int plimon, pnuez, plulo, pfresa, pcrema,paletas;
       
        System.out.println("¿CUANTAS PALETAS HA VENDIDO EN LA SEMANA?");
        paletas= entrada.nextInt();
        for (int i = 1; i <= paletas; i++) {
            System.out.println("QUE SABORES VENDIO");
            sabor=entrada.next();
            if (sabor.equalsIgnoreCase("limon")) {
                sabor = "LIMON";
                l++;
            } else if (sabor.equalsIgnoreCase("nuez")){
                sabor = "NUEZ";
                n++;
            }else if (sabor.equalsIgnoreCase("lulo")){
                sabor = "LULO";
                lu++;
            }else if (sabor.equalsIgnoreCase("fresa")){
                sabor = "FRESA";
                f++;
            }else if (sabor.equalsIgnoreCase("crema")){
                sabor = "CREMA";
                c++;
            }
        }
        plimon = l * limon;
        pnuez = n * nuez;
        plulo = lu * lulo;
        pfresa = f * fresa;
        pcrema = c * crema;
        
        System.out.println("____________________________________");
        System.out.println("LA CANTIDAD DE PALETAS DE LIMON SON "+l);
        System.out.println("EL TOTAL VENDIDO ES DE: $"+plimon);
        System.out.println("____________________________________");
        
        System.out.println("____________________________________");
        System.out.println("LA CANTIDAD DE PALETAS DE NUEZ SON "+n);
        System.out.println("EL TOTAL VENDIDO ES DE: $"+pnuez);
        System.out.println("____________________________________");
        
        System.out.println("___________________________________");
        System.out.println("LA CANTIDAD DE PALETAS DE LULO SON "+lu);
        System.out.println("EL TOTAL VENDIDO ES DE: $"+plulo);
        System.out.println("___________________________________");
        
        System.out.println("___________________________________");
        System.out.println("LA CANTIDAD DE PALETAS DE FRESA SON "+f);
        System.out.println("EL TOTAL VENDIDO ES DE: $"+pfresa);
        System.out.println("___________________________________");
        
        System.out.println("____________________________________");
        System.out.println("LA CANTIDAD DE PALETAS DE CREMA SON "+c);
        System.out.println("EL TOTAL VENDIDO ES DE: $"+pcrema);
        System.out.println("___________________________________");
        
        System.out.println("EL TOTAL DE VENTAS EN LA SEMANA ES DE $"+(plimon+pnuez+plulo+pfresa+pcrema));
       
        
        
        
         
         
        
        
        
       
        }
       
    }
    

    

