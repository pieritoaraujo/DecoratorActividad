public class Moca extends DecoratorComplemento {
    Bebida bebida;
    public Moca(Bebida bebida){
        this.bebida = bebida;
    }
    public String getDescripcion(){
        return bebida.getDescripcion() + " con moca";
    }
    public double costo(){
        return .20 + bebida.costo();
    }
}
