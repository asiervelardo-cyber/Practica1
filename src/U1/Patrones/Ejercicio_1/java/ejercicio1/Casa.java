package ejercicio1;

public class Casa {

    private double area;
    private Tejado tejado;
    private Pared pared1;
    private Pared pared2;
    private Pared pared3;
    private Pared pared4;

    // Inyección por constructor. El parámetro es de tipo ejercicio1.Tejado, así que acepta tanto un ejercicio1.Tejado como un ejercicio1.TejadoTejas.
    public Casa(double area, Tejado tejado, Pared pared1, Pared pared2, Pared pared3, Pared pared4) {
        this.area = area;
        this.tejado = tejado;
        this.pared1 = pared1;
        this.pared2 = pared2;
        this.pared3 = pared3;
        this.pared4 = pared4;
    }

    public double getArea() {
        return area;
    }

    public Tejado getTejado() {
        return tejado;
    }

    public void mostrar() {
        System.out.println("ejercicio1.Casa de " + area + " m2");
        System.out.println("Tipo de tejado: " + tejado.getClass().getSimpleName());
        tejado.darSoporte();
        System.out.println("Alturas de las paredes: " + pared1.getAltura() + ", " + pared2.getAltura() + ", " + pared3.getAltura() + ", " + pared4.getAltura());
    }
}