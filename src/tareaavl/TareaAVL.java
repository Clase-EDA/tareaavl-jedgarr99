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

        ArbolAVL<String> a = new ArbolAVL<>();
        a.add("9");
        a.add("7");
        a.add("4");
        a.add("8");
        a.add("3");
        a.add("2");
        a.add("5");
        a.add("b");
        a.add("a");
      

        System.out.println(a.imordenArray());
        a.remove("4");

        a.impresionIzquierdaDerecha();

 

    }

}
