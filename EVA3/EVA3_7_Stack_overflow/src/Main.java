/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author temporal2
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        miStackOverFlow();
    }
    //Recursividad-nos acabamos la memoria (stack overflow)
    public static void miStackOverFlow(){
        System.out.println("Hola usuario, buen dia !!!");
        miStackOverFlow();
    }
}
