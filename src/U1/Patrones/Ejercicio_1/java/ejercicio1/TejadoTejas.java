package ejercicio1;

public class TejadoTejas extends Tejado{
    public TejadoTejas(){
        super();
    }

    // Sobrescribe el metodo del padre: cambia el comportamiento sin tocar ejercicio1.Casa.
    @Override
    public void darSoporte() {
        System.out.println("El tejado de tejas da soporte a la casa.");
    }
}