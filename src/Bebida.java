public abstract class Bebida {
    String descripcion = "Bebida desconocida";

    public enum Tamano {
        NORMAL,
        MEDIANO,
        GRANDE
    }

    private Tamano tamano = Tamano.NORMAL;

    public Tamano getTamano() {
        return tamano;
    }

    public void setTamano(Tamano tamano) {
        this.tamano = tamano;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public abstract double costo();

}
