package ejercicio3;

// Patrón Singleton: la propia clase guarda su única instancia.
public class Presidente {

    // Única instancia. Es estática, así que pertenece a la clase y no a ningún objeto.
    private static Presidente instancia;

    private String nombre;
    private String apellidos;
    private int anioEleccion;

    // Constructor privado: nadie fuera de esta clase puede hacer new Presidente(...).
    private Presidente(String nombre, String apellidos, int anioEleccion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.anioEleccion = anioEleccion;
    }

    // Crea el presidente solo la primera vez; las siguientes devuelve el que ya existe
    public static Presidente getInstance(String nombre, String apellidos, int anioEleccion) {
        if (instancia == null) {
            instancia = new Presidente(nombre, apellidos, anioEleccion);
        }
        return instancia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getAnioEleccion() {
        return anioEleccion;
    }

    @Override
    public String toString() {
        return nombre + " " + apellidos + " (elegido en " + anioEleccion + ")";
    }
}

