/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_10_funciones;

import java.util.Scanner;

/**
 *
 * @author temporal2
 */
public class EVA3_10_Funciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
        
        System.out.println("Introduce el numero del mes");
        String iM1 = input.nextLine();
        String iResu = Mes(iM1);
        System.out.println(iResu);
        
        
        System.out.println("Introduce una calificacion con letra mayuscula");
        String iL1 = input.nextLine();
        String iResu2 = Califa(iL1);
        System.out.println(iResu2);
        
        
        System.out.println("Introduce una calificacion ");
        String iL2 = input.nextLine();
        String iResu3 = Califa2(iL2);
        System.out.println(iResu3);
        
        
        System.out.println("Introduce dos numeros enteros que quieras sumar");
        int iVal = input.nextInt();
        int iVal2= input.nextInt();
        int iResu4 = captura(iVal, iVal2);
        System.out.println(iResu4);
        
        System.out.println("Introduce dos palabras");
        String sL3 = input.nextLine();
        String sL4 = input.nextLine();
        String iResu5 = captura(sL3, sL4);
        System.out.println(iResu5);
        
        System.out.println("Introduce true o false");
        boolean iVal3 = input.nextBoolean();
        boolean iResu6 = captura(iVal3);
        System.out.println(iResu6);
        
        System.out.println("Introduce dos numeros enteros que quieras dividir");
        double iVal4 = input.nextInt();
        double iVal5= input.nextInt();
        double iResu7 = captura(iVal4, iVal5);
        System.out.println(iResu7);
        
        System.out.println("Introduce el año");
        int iVal6 = input.nextInt();
        String iResu8= iAño(iVal6);
        System.out.println(iResu8);
        
        System.out.println("Introduce un numero entero");
        int iVal7 = input.nextInt();
        String iResu9= numeroPrimo(iVal6);
        System.out.println(iResu9);
    }
    public static String Mes(String iM){
        
        switch(iM){
            case "1":
             return "Enero"; 
             case "2":
             return "Febrero";
             case "3":
             return "Marzo";
             case "4":
             return "Abril";
             case "5":
             return "Mayo";
             case "6":
             return "Junio";
             case "7":
             return "Julio";
             case "8":
             return "Agosto";
             case "9":
             return "Septiembre";
             case "10":
             return "Octubre";
             case "11":
             return "Noviembre";
             case "12":
             return "Diciembre";
             
             
             
        }
      return iM;
    }
    public static String Califa(String iC){
    
        
    switch(iC){
    case "A":
        return "100";
    case "B":
        return "90"; 
    case "C":
        return "80";
    case "D":
        return "70";
    case "F":
        return "0";
    
    }
    return iC;
    }
    public static String Califa2(String iC2){
        
        switch(iC2){
    case "100":
        return "A";
    case "90":
        return "B"; 
    case "80":
        return "D";
    case "70":
        return "D";
    case "0":
        return "F";
    
    }
    return iC2;
        
    }
    public static int captura(int sMensaje, int sMensaje2){
        return sMensaje+sMensaje2;
    }
    public static String captura(String sMensaje, String sMensaje2){
        return sMensaje+sMensaje2;
    }
    public static boolean captura(boolean sMensaje){
        if(sMensaje == true){
            return false;
                 }
        else if(sMensaje == false){
                    return true;
        }
        return(sMensaje);
    }
    public static double captura(double sMensaje, double sMensaje2){
        return sMensaje/sMensaje2;
}
    public static String iAño(int iA){
        if (iA%4==0 && iA%100!=0)
    return "es bisiesto";
     else
     if (iA%100==0 && iA%400==0)
    return "es bisiesto";
    else
    if (iA%400==0)
    return "es bisiesto";
    else 
    return "no es bisiesto";
    }
    public static String numeroPrimo(int iN){
        boolean bP = true;
    for(int x=2; x<iN;x++){
    if((iN%x)==0){
        bP = false;
        break;
    }
    }
    if(bP){
        return "es primo";
    }else{
         return "No es primo";
    }
    }
}
