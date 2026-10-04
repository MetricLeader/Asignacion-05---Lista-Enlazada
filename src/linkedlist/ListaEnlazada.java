package linkedlist;
public class ListaEnlazada <T> implements ILista<T> {
    
    protected int nElementos;
    private T Lista [];
    private final int TamLista;;
    
    public ListaEnlazada(Class<T> tipoDato, int TamLista) {
        this.TamLista = TamLista;
        nElementos = 0;
        Lista = (T[]) java.lang.reflect.Array.newInstance(tipoDato, TamLista);
    }

    @Override
    public void append(T elemento) throws ListaExcepcion {
        if (nElementos >= TamLista) {
            throw new ListaExcepcion("Lista llena");
        } 
        Lista[nElementos] = (T) elemento;
        nElementos++;    
    }

    @Override
    public void insert(T elemento, int index) throws ListaExcepcion {
        if (nElementos >= TamLista) {
            throw new ListaExcepcion("Lista llena");
        } 
        for(int i = nElementos; i > index;i--) {
            Lista[i] = Lista[i-1]; 
        }
        Lista[index] = (T) elemento;
        nElementos ++;
    }

    @Override
    public T remove(int index) throws ListaExcepcion {
        T o = (T) get(index);
        
        if (index <0 || nElementos < index) {
            throw new ListaExcepcion("Indice inexistente");
            }
        for (int i = index; i < nElementos-1; i++) {
            Lista[i] = Lista[i+1] ;
            }
            nElementos--;
            return o;    
    }

    @Override
    public boolean removeObj(T elemento) throws ListaExcepcion {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int indexOf(T elemento) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public T get(int index) throws ListaExcepcion {
        if (empty()) {
            throw new ListaExcepcion("Lista vacia");
        }
        if ( index < 0 || nElementos < index) {
            throw new ListaExcepcion("Indice fuera de limites");
        }
        return Lista[index];    
    }

    @Override
    public void set(T elemento, int index) throws ListaExcepcion {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void clear() {
        for (int i = 0; i < nElementos-1; i++) {
            remove(i);
        }
        nElementos =0;
    }

    @Override
    public boolean empty() {
        return nElementos == 0;
    }

    @Override
    public int size() {
        return nElementos;
    }

    @Override
    public java.util.Iterator<T> Iterator() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void invertir() {
        for (int i = nElementos-1; i>=0;i--) {            
            append(Lista[i]);
            remove(i);
        }
    }

    @Override
    public void concatenar(ListaEnlazada<T> otraLista)  {
        int TotalElementos = nElementos +otraLista.nElementos;
        if (TotalElementos > TamLista) {
            System.out.println("Se necesita un arreglo mas grande");
        } else {
            for (int i = 0; i < otraLista.nElementos ;i++) {
            append(otraLista.Lista[i]);
            }
        }
    }

    @Override
    public String toString() {
        String s = "[";
        
        for (int i = 0; i < nElementos; i++) {
            s+= Lista[i];
            if (i < nElementos -1) s+=", ";
        }
        s+="]";
        return s;
    }
}
