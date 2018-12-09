/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_1_do_while;

import java.util.Scanner;

/**
 *
 * @author temporal2
 */
public class EVA3_1_do_while {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here}
        //Numeros entre 1 y 12 y mostrar el mes
        //while
        Scanner input= new Scanner(System.in);
        //System.out.println("Introduce el numero del mes");
        int iMes;
        //while((iMes<1)||(iMes>12)){
             //System.out.println("Introduce el numero del mes");
              //iMes = input.nextInt();
             //if((iMes>=1)&&(iMes<=12))
        //}
        do{//hacer
            System.out.println("Introduce el numero del mes");
              iMes = input.nextInt();
        }while((iMes<1)||(iMes>12));
        
            
        
        switch(iMes){
                case 1:
                    System.out.println("Enero");
                    break;
                case 2:
                    System.out.println("Febrero");
                    break;
                case 3:
                    System.out.println("Marzo");
                    break;
                case 4:
                    System.out.println("Abril");
                    break; 
                case 5:
                    System.out.println("Mayo");
                    break;
                case 6:
                    System.out.println("Junio");
                    break;
                case 7:
                    System.out.println("Julio");
                    break;
                case 8:
                    System.out.println("Agosto");
                    break;
                case 9:
                    System.out.println("Septiembre");
                    break;
                case 10:
                    System.out.println("Octubre");
                    break;
                case 11:
                    System.out.println("Noviembre");
                    break;
                default:
                    System.out.println("Diciembre");
        }            
    }
    
}
