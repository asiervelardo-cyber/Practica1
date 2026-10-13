package ejercicio1;

public class Main {

    // Metodo auxiliar para no repetir el new + setAltura en cada pared.
    private static Pared crearPared(double altura) {
        Pared pared = new Pared();
        pared.setAltura(altura);
        return pared;
    }

    public static void main(String[] args) {

        // ejercicio1.Casa 1: tejado de tejas
        Tejado tejado1 = new TejadoTejas();
        Casa casa1 = new Casa(120, tejado1, crearPared(2), crearPared(2), crearPared(2), crearPared(2));

        // ejercicio1.Casa 2: tejado normal
        Tejado tejado2 = new Tejado();
        Casa casa2 = new Casa(80, tejado2, crearPared(3), crearPared(3), crearPared(2), crearPared(2));

        System.out.println("--- ejercicio1.Casa 1 ---");
        casa1.mostrar();
        System.out.println();
        System.out.println("--- ejercicio1.Casa 2 ---");
        casa2.mostrar();
    }
}