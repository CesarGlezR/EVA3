/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_2_todos_ciclos;

/**
 *
 * @author temporal2
 */
public class EVA3_2_todos_ciclos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("For");
        for (int i = 1; i <= 100; i++) {
         System.out.print(i+"-");
        }
        System.out.println("");
        for (int j = 100; j > 1; j--) {
            System.out.print(j+"-");
        }
        System.out.println("");
        System.out.println("while");
        int x=1;
        while(x<=100){
            System.out.print(x+"-");  
            x++;   
        }
        int p=100;
        System.out.println("");
        while(p>=1){
            System.out.print(p+"-");  
            p--;   
        }
        {int y=0;
        System.out.println("");
        System.out.println("do while");
        do{
          System.out.print(y+"-");
          y++;
          
        }while(y<=100);
        
        }System.out.println("");
        int z=100;
        do{
            
          System.out.print(z+"-");
          z--;
          
        }while(z>=1);
    }
    
}
