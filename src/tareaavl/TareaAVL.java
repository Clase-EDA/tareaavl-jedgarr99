/*
 *Jorge Edgar Rodriguez Ortiz Loyola 
 *181334
 */
package tareaavl;

import java.util.ArrayList;

/**
 *
 * @author Edgar
 */
public class TareaAVL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArbolAVL<Integer> a = new ArbolAVL<>();
        a.add(100);
        a.add(300);
        a.add(400);
        a.add(350);
        a.add(375);
        a.add(50);
        a.add(200);
        a.add(360);
        a.add(380);
        a.add(500);
          a.impresionIzquierdaDerecha();
        a.add(390);

        //a.add(Integer.SIZE);
         a.impresionIzquierdaDerecha();
        /* System.out.println(a.imordenArray());
        a.remove(375);
          System.out.println(a.imordenArray());
        a.remove(50);
          System.out.println(a.imordenArray());
        a.remove(400);
          System.out.println(a.imordenArray());
        a.remove(380);
          System.out.println(a.imordenArray());
          
          
          

    

        a.impresionIzquierdaDerecha();*/
 

    }

}
