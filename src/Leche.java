public class Leche extends DecoratorComplemento {
    Bebida bebida;
    public Leche (Bebida bebida){
        this.bebida = bebida;
    }
    public String getDescripcion(){
        return bebida.getDescripcion() + " con leche";
    }
    public double costo(){
        return .10 + bebida.costo();
    }
}
