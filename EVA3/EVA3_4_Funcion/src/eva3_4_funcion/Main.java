/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_4_funcion;

/**
 *
 * @author invitado
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //para usar la funcion --> llamada a funcion
       //imprimeMensaje("Cesar");
       Main mObjeto = new Main();
       mObjeto.imprimeMensaje("Cesar");
       Math.random();
    }

     void imprimeMensaje(String mensaje){
        System.out.println("hola "+mensaje);
    }
        //Paradigmas de la programacion:
    //Programacion estructurada
    //Programacion modular, orientada a objetos,
    //orientada a eventos, logica, funcional
    
    //opp
    //publico, privado, protegido, default
    //Valor de retorno nombre de la funcion (argumentos)
    //{cuerpo de la funcion}
    //funciones --> regresan un valor
    //procedimientos --> no regresa nada
}
