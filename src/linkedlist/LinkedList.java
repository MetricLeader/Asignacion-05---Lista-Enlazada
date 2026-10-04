package linkedlist;
public class LinkedList {
    public static void main(String[] args) {
        
        ListaEnlazada <String> Arreglo = new ListaEnlazada(String.class, 10);
        
        Arreglo.append("Raton");
        Arreglo.append("Queso");
        Arreglo.append("Zayuri");
        System.out.println(Arreglo.toString());
        
        Arreglo.insert("Juan", 2);
        System.out.println(Arreglo.toString());
        
        System.out.println("El indice 2 contiene: "+Arreglo.get(2));
        System.out.println("Numero de elementos: "+Arreglo.size());
        
        Arreglo.remove(0);
        System.out.println(Arreglo.toString());
        
        Arreglo.invertir();
        System.out.println(Arreglo.toString());
        
        ListaEnlazada <String> Arreglo2 = new ListaEnlazada(String.class, 10);
        Arreglo2.append("Daniel");
        Arreglo2.append("Julian");
        Arreglo2.append("Victoria");

        System.out.println(Arreglo2.toString());
        Arreglo.concatenar(Arreglo2);
        System.out.println(Arreglo.toString());
        
        Arreglo.clear();
        System.out.println(Arreglo.toString());        
    }
}
