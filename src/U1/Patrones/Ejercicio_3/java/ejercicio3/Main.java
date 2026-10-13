package ejercicio3;

public class Main {

    public static void main(String[] args) {

        Presidente p1 = Presidente.getInstance("Joe", "Biden", 2020);
        // Segunda petición con otros datos: no se crea otro presidente, se devuelve el mismo.
        Presidente p2 = Presidente.getInstance("Donald", "Trump", 2016);

        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);

        // Comprobación: comparamos ambos objetos y mostramos sus hshcode para verificar que son distintos.
        System.out.println("¿p1 y p2 son el mismo objeto? " + (p1 == p2));
        System.out.println("hashCode p1: " + System.identityHashCode(p1));
        System.out.println("hashCode p2: " + System.identityHashCode(p2));
    }
}