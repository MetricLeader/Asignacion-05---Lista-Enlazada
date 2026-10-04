package linkedlist;

import java.util.Iterator;

public interface ILista<T> {
    
    public void append(T elemento) throws ListaExcepcion;
    public void insert(T elemento, int index) throws ListaExcepcion;
    public T remove(int index) throws ListaExcepcion;
    public boolean removeObj(T elemento) throws ListaExcepcion;
    public int indexOf(T elemento);
    public T get(int index) throws ListaExcepcion;
    public void set(T elemento, int index) throws ListaExcepcion;
    public void clear();
    public boolean empty();
    public int size();
    public Iterator<T> Iterator();   
    public void invertir();
    public void concatenar(ListaEnlazada <T> otraLista);
}
