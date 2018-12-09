/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_while_2;

import java.util.Scanner;

/**
 *
 * @author FamFG
 */
public class EVA3_while_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("Introduce una contraseña");
    String sClave = input.nextLine();
    String sLoguin;
    int i=1;
    do{
        i++;
        System.out.println("Introduce tu contraseña");
        sLoguin = input.nextLine();
        System.out.println(i);
    }while(!sClave.equals(sLoguin));
        
    System.out.println("Bienvenido");
    
    }
    
}
