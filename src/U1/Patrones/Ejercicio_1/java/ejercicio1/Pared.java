package ejercicio1;

public class Pared {

    private Double altura;

    public Pared() {
    }

    // El constructor es vacío (como en el diagrama), por eso la altura se da con el setter.
    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
}