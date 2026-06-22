import java.util.HashMap;
import java.util.Map;

public class Soya extends DecoratorComplemento {
    Bebida bebida;
    private final Map<Tamano, Double> precios = new HashMap<>();

    public Soya(Bebida bebida){

        this.bebida = bebida;
        precios.put(Tamano.NORMAL, 0.15);
        precios.put(Tamano.MEDIANO, 0.20);
        precios.put(Tamano.GRANDE, 0.25);
    }
    @Override
    public String getDescripcion(){
        return bebida.getDescripcion() + " con soya";
    }
    @Override
    public double costo(){
        return .15 + bebida.costo();
    }
    @Override
    public Tamano getTamano(){
        return bebida.getTamano();
    }
}
