public class Crema extends DecoratorComplemento {
    Bebida bebida;
    public Crema(Bebida bebida){
        this.bebida = bebida;
    }

    public String getDescripcion(){
        return bebida.getDescripcion() + " con crema";
    }
    public double costo(){
        return .10 + bebida.costo();
    }
}
