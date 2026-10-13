package ejercicio2;

public abstract class Figura {

    protected String color;

    public Figura(String color) {
        this.color = color;
    }

    // Abstracto: cada figura concreta decide cómo se dibuja.
    public abstract void dibujarFigura();
}
