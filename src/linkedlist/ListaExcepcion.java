package linkedlist;
public class ListaExcepcion extends RuntimeException {
    public ListaExcepcion() {
        super();
    }
    public ListaExcepcion(String msg) {
        super(msg);
    }
}
