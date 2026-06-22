public class Soya extends DecoratorComplemento {
    Bebida bebida;
    public Soya(Bebida bebida){
        this.bebida = bebida;
    }
    public String getDescripcion(){
        return bebida.getDescripcion() + " con soya";
    }
    public double costo(){
        return .15 + bebida.costo();
    }
}
