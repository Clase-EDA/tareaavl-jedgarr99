/*
 *Jorge Edgar Rodriguez Ortiz Loyola 
 *181334
 */
package tareaavl;

import java.util.Iterator;

/**
 *
 * @author Edgar
 */
public interface ArbolAVLADT<T extends Comparable<T>> {

    public boolean isEmpty();

    public int size();

    public boolean contains(T elemento);

    public NodoAVL<T> find(T elemento);

    public Iterator<T> imorden();

    public Iterator<T> preorden();

    public Iterator<T> postorden();

    public void impresionIzquierdaDerecha();

    public void add(T elem);

    public boolean remove(T elem);


}
